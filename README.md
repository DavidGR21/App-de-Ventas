# App de Ventas

Aplicación de escritorio en **Java (Swing)** para la gestión de ventas e inventario de un negocio, con persistencia en **MySQL**. Desarrollada con NetBeans (GUI Builder).

## Funcionalidades

- **Login** con control de usuarios, permisos y bloqueo de cuentas.
- **Gestión de usuarios** con permisos por módulo y encriptación de datos.
- **Clientes** y **Proveedores**.
- **Productos** e **inventario**, con límites de stock.
- **Compras** y **Ventas / Facturación** (con generación de **código QR**).
- **Kardex** de movimientos de inventario.
- **Listas** de compras y ventas.
- Catálogo de **provincias** y **ciudades**.

## Tecnologías

| Componente | Uso |
|---|---|
| Java 8+ | Lenguaje |
| Swing (NetBeans `.form`) | Interfaz gráfica |
| MySQL 8 + Connector/J | Base de datos (`com.mysql.cj.jdbc.Driver`) |
| [QRGen](https://github.com/kenglxn/QRGen) (+ ZXing) | Generación de códigos QR |

## Estructura del proyecto

```
src/
├── Almacen/          # Estructuras de almacenamiento en memoria
├── CodigoQR/         # Generación de códigos QR
├── ConexionMySQL/    # Conexión y operaciones con MySQL
├── Controles/        # Lógica / validaciones de cada módulo
├── Encriptaciones/   # Encriptación de datos sensibles
├── Imagenes/         # Recursos gráficos
├── Interfaz/         # Ventanas Swing (login, menús, kardex, etc.)
└── Objetos/          # Modelos (Cliente, Producto, Factura, ...)
```

## Requisitos

- JDK 8 o superior
- MySQL Server 8.x
- Librerías (agregar al classpath del proyecto):
  - `mysql-connector-j`
  - `qrgen` y sus dependencias `zxing core` / `zxing javase`

## Configuración de la base de datos

1. Crear la base de datos y todas sus tablas con el script incluido:
   ```bash
   mysql -u root -p < database/schema.sql
   ```
2. El script crea un usuario inicial con todos los permisos: **`admin` / `admin`** (cámbialo después).
3. Copiar `.env.example` como `.env` en la raíz del proyecto y completar los datos (el `.env` está en `.gitignore`). También se pueden usar variables de entorno, que tienen prioridad:

   | Variable | Valor por defecto |
   |---|---|
   | `DB_URL` | `jdbc:mysql://localhost:3306/proyecto` |
   | `DB_USER` | `root` |
   | `DB_PASSWORD` | *(vacío)* |

   Ejemplo en Windows (PowerShell):
   ```powershell
   $env:DB_PASSWORD = "tu_clave"
   ```

## Ejecución

### Desde la terminal (VS Code / PowerShell) — requiere JDK 17+

```powershell
.
un.ps1
```

El script hace todo automáticamente:
1. Verifica Java y MySQL, y arranca el servicio de MySQL si está detenido.
2. Si no existe `.env`, pide host, puerto, usuario y clave y lo crea.
3. Si la base `proyecto` no existe, la crea con `database/schema.sql`.
4. Descarga las librerías en `lib/` (solo la primera vez), compila en `out/` y abre la ventana de login.

Usuario inicial: **admin / admin**.

### Desde NetBeans

Abrir la carpeta `src/`, añadir los JAR de `lib/` (o ejecutar antes `run.ps1` para descargarlos) y ejecutar `Interfaz.login`.

## Autor

**DavidGR21** — [github.com/DavidGR21](https://github.com/DavidGR21)
