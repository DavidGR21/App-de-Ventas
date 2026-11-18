# Prepara la base de datos, compila y ejecuta App de Ventas (PowerShell / VS Code)
# Uso:  .\run.ps1
#   (si Windows bloquea el script:  Set-ExecutionPolicy -Scope Process Bypass; .\run.ps1)
$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot

function Fallar($mensaje) {
    Write-Host "ERROR: $mensaje" -ForegroundColor Red
    exit 1
}

# ---------------------------------------------------------------- 0. Requisitos
foreach ($cmd in "java", "javac") {
    if (-not (Get-Command $cmd -ErrorAction SilentlyContinue)) {
        Fallar "No se encontro '$cmd'. Instala un JDK 17+ y agregalo al PATH."
    }
}

$mysql = (Get-Command mysql -ErrorAction SilentlyContinue).Source
if (-not $mysql) {
    $mysql = Get-ChildItem "C:\Program Files\MySQL\MySQL Server *\bin\mysql.exe" -ErrorAction SilentlyContinue |
        Sort-Object FullName -Descending | Select-Object -First 1 -ExpandProperty FullName
}
if (-not $mysql) { Fallar "No se encontro el cliente 'mysql'. Instala MySQL Server 8.x." }

# ---------------------------------------------------------------- 1. Archivo .env
if (-not (Test-Path .env)) {
    Write-Host "No existe .env, vamos a crearlo (Enter = valor por defecto)." -ForegroundColor Yellow
    $h = Read-Host "Host de MySQL [localhost]";  if (-not $h) { $h = "localhost" }
    $p = Read-Host "Puerto [3306]";              if (-not $p) { $p = "3306" }
    $u = Read-Host "Usuario [root]";             if (-not $u) { $u = "root" }
    $sec = Read-Host "Clave de MySQL" -AsSecureString
    $c = [Runtime.InteropServices.Marshal]::PtrToStringAuto(
        [Runtime.InteropServices.Marshal]::SecureStringToBSTR($sec))
    @(
        "DB_URL=jdbc:mysql://${h}:${p}/proyecto"
        "DB_USER=$u"
        "DB_PASSWORD=$c"
    ) | Set-Content .env -Encoding ASCII
    Write-Host ".env creado." -ForegroundColor Green
}

# Leer .env (las variables de entorno ya definidas tienen prioridad, igual que en Conexion.java)
$cfg = @{ DB_URL = "jdbc:mysql://localhost:3306/proyecto"; DB_USER = "root"; DB_PASSWORD = "" }
foreach ($linea in Get-Content .env) {
    if ($linea -match '^\s*(DB_URL|DB_USER|DB_PASSWORD)\s*=(.*)$') { $cfg[$Matches[1]] = $Matches[2].Trim() }
}
foreach ($k in @($cfg.Keys)) {
    $v = [Environment]::GetEnvironmentVariable($k)
    if ($v) { $cfg[$k] = $v }
}
if ($cfg.DB_URL -notmatch '^jdbc:mysql://([^:/]+)(?::(\d+))?/([^?]+)') { Fallar "DB_URL no valida: $($cfg.DB_URL)" }
$dbHost = $Matches[1]
$dbPort = if ($Matches[2]) { $Matches[2] } else { "3306" }
$dbName = $Matches[3]
if ($dbName -ne "proyecto") { Fallar "database/schema.sql crea la base 'proyecto', pero DB_URL apunta a '$dbName'." }

# ---------------------------------------------------------------- 2. Servicio MySQL
if ($dbHost -in "localhost", "127.0.0.1") {
    $svc = Get-Service -Name "MySQL*" -ErrorAction SilentlyContinue | Select-Object -First 1
    if ($svc -and $svc.Status -ne "Running") {
        Write-Host "Iniciando servicio $($svc.Name)..."
        try { Start-Service $svc.Name }
        catch { Fallar "No se pudo iniciar $($svc.Name). Abre VS Code como administrador o inicialo desde services.msc." }
    }
}

# ---------------------------------------------------------------- 3. Base de datos
$conn = @("-h", $dbHost, "-P", $dbPort, "--protocol=TCP")

# Ejecuta mysql con un usuario/clave dados (la clave va por MYSQL_PWD, no por linea de comandos)
function Invoke-MySql($usuario, $clave, [string[]]$extra) {
    $env:MYSQL_PWD = $clave
    $ErrorActionPreference = "Continue"   # un error de mysql no debe abortar; se revisa $LASTEXITCODE
    try { & $mysql @conn -u $usuario @extra } finally { Remove-Item Env:MYSQL_PWD -ErrorAction SilentlyContinue }
}

$existe = Invoke-MySql $cfg.DB_USER $cfg.DB_PASSWORD @("-N", "-e", "SHOW DATABASES LIKE 'proyecto';")
if ($LASTEXITCODE -ne 0) {
    if ($cfg.DB_USER -eq "root") { Fallar "No se pudo conectar como root. Revisa DB_PASSWORD en .env." }

    # El usuario de la app no existe (o no tiene acceso): crearlo con root, solo la primera vez
    Write-Host "El usuario '$($cfg.DB_USER)' no puede conectarse. Se creara usando root." -ForegroundColor Yellow
    $sec = Read-Host "Clave de root de MySQL" -AsSecureString
    $rootPwd = [Runtime.InteropServices.Marshal]::PtrToStringAuto(
        [Runtime.InteropServices.Marshal]::SecureStringToBSTR($sec))

    Write-Host "Creando base de datos 'proyecto'..."
    Invoke-MySql "root" $rootPwd @("-e", "source database/schema.sql")
    if ($LASTEXITCODE -ne 0) { Fallar "No se pudo conectar como root o fallo database/schema.sql." }

    $u = $cfg.DB_USER -replace "'", "''"
    $p = $cfg.DB_PASSWORD -replace "'", "''"
    $sql = ""
    foreach ($h in "localhost", "127.0.0.1", "::1") {
        $sql += "CREATE USER IF NOT EXISTS '$u'@'$h' IDENTIFIED BY '$p'; " +
                "ALTER USER '$u'@'$h' IDENTIFIED BY '$p'; " +
                "GRANT ALL PRIVILEGES ON proyecto.* TO '$u'@'$h'; "
    }
    Invoke-MySql "root" $rootPwd @("-e", "$sql FLUSH PRIVILEGES;")
    if ($LASTEXITCODE -ne 0) { Fallar "No se pudo crear el usuario '$($cfg.DB_USER)'." }
    Write-Host "Usuario '$($cfg.DB_USER)' creado con acceso a 'proyecto'." -ForegroundColor Green

    $existe = Invoke-MySql $cfg.DB_USER $cfg.DB_PASSWORD @("-N", "-e", "SHOW DATABASES LIKE 'proyecto';")
    if ($LASTEXITCODE -ne 0) { Fallar "El usuario '$($cfg.DB_USER)' sigue sin poder conectarse." }
}

if (-not $existe) {
    Write-Host "Creando base de datos 'proyecto'..."
    Invoke-MySql $cfg.DB_USER $cfg.DB_PASSWORD @("-e", "source database/schema.sql")
    if ($LASTEXITCODE -ne 0) { Fallar "Fallo la importacion de database/schema.sql" }
    Write-Host "Base de datos creada. Usuario inicial: admin / admin" -ForegroundColor Green
}

# ---------------------------------------------------------------- 4. Librerias (Maven Central)
$repo = "https://repo1.maven.org/maven2"
$libs = @{
    "mysql-connector-j-8.4.0.jar" = "com/mysql/mysql-connector-j/8.4.0/mysql-connector-j-8.4.0.jar"
    "qrgen-1.4.jar"               = "net/glxn/qrgen/1.4/qrgen-1.4.jar"
    "core-2.0.jar"                = "com/google/zxing/core/2.0/core-2.0.jar"
    "javase-2.0.jar"              = "com/google/zxing/javase/2.0/javase-2.0.jar"
    "AbsoluteLayout.jar"          = "org/netbeans/external/AbsoluteLayout/RELEASE180/AbsoluteLayout-RELEASE180.jar"
}
New-Item -ItemType Directory -Force lib | Out-Null
foreach ($nombre in $libs.Keys) {
    if (-not (Test-Path "lib/$nombre")) {
        Write-Host "Descargando $nombre..."
        Invoke-WebRequest "$repo/$($libs[$nombre])" -OutFile "lib/$nombre"
    }
}

# ---------------------------------------------------------------- 5. Compilar
Write-Host "Compilando..."
if (Test-Path out) { Remove-Item out -Recurse -Force }
New-Item -ItemType Directory out | Out-Null
$fuentes = Get-ChildItem src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -encoding UTF-8 -nowarn -cp "lib/*" -d out $fuentes
if ($LASTEXITCODE -ne 0) { Fallar "Error de compilacion" }
Copy-Item src/Imagenes out/Imagenes -Recurse

# ---------------------------------------------------------------- 6. Ejecutar
Write-Host "Iniciando App de Ventas..." -ForegroundColor Green
java -cp "out;lib/*" Interfaz.login
