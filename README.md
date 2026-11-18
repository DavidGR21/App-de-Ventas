<div align="center">

# 🛒 App de Ventas

**Sistema de escritorio para la gestión de ventas, compras e inventario**

Aplicación desarrollada en **Java Swing** con persistencia en **MySQL**: facturación, compras a proveedores,
control de stock con **Kardex**, códigos **QR** y gestión de usuarios con permisos por módulo.

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-5382A1?style=for-the-badge)
![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?style=for-the-badge&logo=apachenetbeanside&logoColor=white)
![Windows](https://img.shields.io/badge/Plataforma-Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)

<img src="capturas/02_menu_principal.png" alt="Menú principal" width="85%">

[Características](#-características) •
[Capturas](#-capturas-de-pantalla) •
[Instalación](#-instalación-y-ejecución) •
[Base de datos](#-base-de-datos) •
[Estructura](#-estructura-del-proyecto) •
[Autor](#-autor)

</div>

---

## 📋 Tabla de contenidos

- [Descripción](#-descripción)
- [Características](#-características)
- [Video demostrativo](#-video-demostrativo)
- [Capturas de pantalla](#-capturas-de-pantalla)
- [Tecnologías](#-tecnologías)
- [Requisitos](#-requisitos)
- [Instalación y ejecución](#-instalación-y-ejecución)
- [Base de datos](#-base-de-datos)
- [Usuarios de prueba](#-usuarios-de-prueba)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Autor](#-autor)

---

## 📖 Descripción

**App de Ventas** es una aplicación de escritorio que cubre el ciclo comercial completo de un negocio:
registro de catálogos (provincias, ciudades, clientes, proveedores y productos), **compras** que aumentan el
stock, **facturas de venta** que lo descuentan, y un **Kardex** que deja trazabilidad de cada movimiento de
inventario. Cada documento genera un **código QR** con su información, y el acceso a cada módulo se controla
con **permisos por usuario**.

---

## ✨ Características

| Módulo | Descripción |
|---|---|
| 🔐 **Inicio de sesión** | Autenticación de usuarios con contraseñas cifradas (AES) y bloqueo de cuentas. |
| 👥 **Gestión de usuarios** | Alta de usuarios y asignación de permisos individuales para cada módulo. |
| 📦 **Productos** | Registro de productos asociados a un proveedor, con **código QR** por producto. |
| 🧑‍💼 **Clientes** | Registro y validación de clientes por cédula y ciudad. |
| 🚚 **Proveedores** | Registro de proveedores por RUC, teléfono, dirección y ciudad. |
| 🗺️ **Provincias y ciudades** | Catálogos geográficos relacionados entre sí. |
| 🛍️ **Compras** | Ingreso de mercadería con detalle por producto; actualiza el inventario. |
| 🧾 **Facturación** | Ventas con validación de cliente y control de **stock disponible** en tiempo real. |
| 📑 **Listas de ventas y compras** | Historial de documentos con su **código QR** y opción de anulación. |
| 📊 **Kardex** | Movimientos de inventario (entradas, salidas, saldo) general o por producto. |
| ⚠️ **Límites de stock** | Validaciones para no vender por encima de la existencia. |

---

## 🎬 Video demostrativo

Recorrido completo por la aplicación:

▶️ **[Ver tráiler de App de Ventas](video/App_de_Ventas_Trailer.mp4)**

---

## 📸 Capturas de pantalla

### 🔐 Inicio de sesión y menú principal

<table>
  <tr>
    <td align="center"><img src="capturas/01_inicio_de_sesion.png" alt="Inicio de sesión" width="100%"><br><sub><b>Inicio de sesión</b></sub></td>
    <td align="center"><img src="capturas/02_menu_principal.png" alt="Menú principal" width="100%"><br><sub><b>Menú principal</b></sub></td>
  </tr>
</table>

### 📦 Productos

<table>
  <tr>
    <td align="center"><img src="capturas/03_productos_con_codigo_qr.png" alt="Productos con código QR" width="100%"><br><sub><b>Listado de productos con código QR</b></sub></td>
    <td align="center"><img src="capturas/04_productos_nuevo_registro.png" alt="Nuevo producto" width="100%"><br><sub><b>Registro de un nuevo producto</b></sub></td>
  </tr>
</table>

### 👥 Clientes y proveedores

<table>
  <tr>
    <td align="center"><img src="capturas/05_clientes.png" alt="Clientes" width="100%"><br><sub><b>Clientes</b></sub></td>
    <td align="center"><img src="capturas/06_clientes_formulario.png" alt="Formulario de clientes" width="100%"><br><sub><b>Formulario de clientes</b></sub></td>
  </tr>
  <tr>
    <td align="center" colspan="2"><img src="capturas/07_proveedores.png" alt="Proveedores" width="50%"><br><sub><b>Proveedores</b></sub></td>
  </tr>
</table>

### 🗺️ Provincias y ciudades

<table>
  <tr>
    <td align="center"><img src="capturas/08_provincias.png" alt="Provincias" width="100%"><br><sub><b>Provincias</b></sub></td>
    <td align="center"><img src="capturas/09_ciudades.png" alt="Ciudades" width="100%"><br><sub><b>Ciudades</b></sub></td>
  </tr>
</table>

### 🛍️ Compras

<table>
  <tr>
    <td align="center"><img src="capturas/10_compra_validacion_proveedor.png" alt="Validación de proveedor" width="100%"><br><sub><b>Validación del proveedor</b></sub></td>
    <td align="center"><img src="capturas/11_compra_detalle.png" alt="Detalle de compra" width="100%"><br><sub><b>Detalle de la compra</b></sub></td>
  </tr>
</table>

### 🧾 Facturación

<table>
  <tr>
    <td align="center"><img src="capturas/12_factura_validacion_cliente.png" alt="Validación de cliente" width="100%"><br><sub><b>Validación del cliente</b></sub></td>
    <td align="center"><img src="capturas/13_factura_detalle.png" alt="Detalle de factura" width="100%"><br><sub><b>Detalle de la factura con control de stock</b></sub></td>
  </tr>
</table>

### 📑 Listas de ventas y compras (con código QR)

<table>
  <tr>
    <td align="center"><img src="capturas/14_lista_ventas_qr.png" alt="Lista de ventas" width="100%"><br><sub><b>Lista de ventas</b></sub></td>
    <td align="center"><img src="capturas/15_lista_compras_qr.png" alt="Lista de compras" width="100%"><br><sub><b>Lista de compras</b></sub></td>
  </tr>
</table>

### 📊 Kardex

<table>
  <tr>
    <td align="center"><img src="capturas/16_kardex_general.png" alt="Kardex general" width="100%"><br><sub><b>Kardex general</b></sub></td>
    <td align="center"><img src="capturas/17_kardex_por_producto.png" alt="Kardex por producto" width="100%"><br><sub><b>Kardex filtrado por producto</b></sub></td>
  </tr>
</table>

### 🔑 Gestión de usuarios

<p align="center">
  <img src="capturas/18_gestion_de_usuarios.png" alt="Gestión de usuarios" width="70%"><br>
  <sub><b>Usuarios y permisos por módulo</b></sub>
</p>

---

## 🛠️ Tecnologías

| Tecnología | Uso |
|---|---|
| **Java 17+** | Lenguaje principal (el código es compatible con Java 8 desde NetBeans) |
| **Java Swing** (NetBeans GUI Builder `.form`) | Interfaz gráfica |
| **MySQL 8** + **Connector/J 8.4** | Base de datos relacional (`com.mysql.cj.jdbc.Driver`) |
| **[QRGen 1.4](https://github.com/kenglxn/QRGen)** + **ZXing 2.0** | Generación de códigos QR |
| **AES / SHA-1** (`javax.crypto`) | Cifrado de contraseñas |
| **PowerShell** | Script de preparación, compilación y ejecución (`run.ps1`) |

---

## 📦 Requisitos

- ☕ **JDK 17** o superior (`java` y `javac` en el `PATH`)
- 🐬 **MySQL Server 8.x** (cliente `mysql` en el `PATH` o instalado en `C:\Program Files\MySQL`)
- 🪟 **Windows** con PowerShell (para el script automático)
- 🌐 Conexión a internet la primera vez (descarga de librerías desde Maven Central)

---

## 🚀 Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/DavidGR21/App-de-Ventas.git
cd App-de-Ventas
```

### 2. Ejecutar con el script automático (recomendado)

```powershell
.\run.ps1
```

> Si Windows bloquea el script: `Set-ExecutionPolicy -Scope Process Bypass; .\run.ps1`

El script se encarga de todo:

1. ✅ Verifica que estén instalados Java y MySQL, y arranca el servicio de MySQL si está detenido.
2. ⚙️ Si no existe `.env`, solicita host, puerto, usuario y clave, y lo crea.
3. 🗄️ Si la base `proyecto` no existe, la crea con `database/schema.sql` (y el usuario de MySQL si hace falta).
4. 📥 Descarga las librerías en `lib/` (solo la primera vez).
5. 🔨 Compila el código en `out/` y abre la ventana de inicio de sesión.

### 3. Ejecutar desde NetBeans (alternativa)

1. Abrir la carpeta `src/` como proyecto.
2. Añadir al classpath los JAR de `lib/` (puedes ejecutar `run.ps1` una vez para descargarlos).
3. Ejecutar la clase principal **`Interfaz.login`**.

---

## 🗄️ Base de datos

### Creación manual

```bash
# Esquema y usuario administrador
mysql -u root -p < database/schema.sql

# (Opcional) Datos de demostración: provincias, ciudades, clientes, proveedores,
# productos, inventario, compras, facturas, kardex y usuarios de ejemplo
mysql -u root -p < database/demo_data.sql
```

### Configuración de la conexión

Copia `.env.example` como `.env` en la raíz del proyecto y completa tus datos
(el archivo `.env` está excluido en `.gitignore`):

```env
DB_URL=jdbc:mysql://localhost:3306/proyecto
DB_USER=root
DB_PASSWORD=tu_clave_de_mysql
```

Las **variables de entorno** del sistema tienen prioridad sobre el `.env`:

| Variable | Valor por defecto |
|---|---|
| `DB_URL` | `jdbc:mysql://localhost:3306/proyecto` |
| `DB_USER` | `root` |
| `DB_PASSWORD` | *(vacío)* |

```powershell
$env:DB_PASSWORD = "tu_clave"
```

### Modelo de datos

```mermaid
erDiagram
    PROVINCIAS ||--o{ CIUDADES : contiene
    CIUDADES ||--o{ CLIENTES : ubica
    CIUDADES ||--o{ PROVEEDORES : ubica
    PROVEEDORES ||--o{ PRODUCTOS : suministra
    PRODUCTOS ||--|| INVENTARIO : tiene
    PROVEEDORES ||--o{ COMPRAS : recibe
    CLIENTES ||--o{ FACTURA : genera
    PRODUCTOS ||--o{ KARDEX : registra
```

---

## 🔑 Usuarios de prueba

| Usuario | Contraseña | Permisos | Origen |
|---|---|---|---|
| `admin` | `admin` | Todos los módulos | `schema.sql` |
| `vendedor` | `ventas123` | Productos, clientes, facturas, lista de ventas | `demo_data.sql` |
| `bodega` | `bodega123` | Productos, proveedores, compras, kardex, lista de compras | `demo_data.sql` |

> ⚠️ Cambia estas contraseñas antes de usar la aplicación en un entorno real.

---

## 📁 Estructura del proyecto

```
App-de-Ventas/
├── capturas/              # Capturas de pantalla usadas en este README
├── database/
│   ├── schema.sql         # Esquema de la base de datos + usuario admin
│   └── demo_data.sql      # Datos de demostración
├── src/
│   ├── Almacen/           # Estructuras de almacenamiento en memoria
│   ├── CodigoQR/          # Generación de códigos QR (productos y documentos)
│   ├── ConexionMySQL/     # Conexión y operaciones con MySQL
│   ├── Controles/         # Lógica y validaciones de cada módulo
│   ├── Encriptaciones/    # Cifrado AES de datos sensibles
│   ├── Imagenes/          # Recursos gráficos (fondos e íconos)
│   ├── Interfaz/          # Ventanas Swing (login, menús, kardex, listas...)
│   └── Objetos/           # Modelos (Cliente, Producto, Factura, Compra...)
├── video/                 # Tráiler demostrativo de la aplicación
├── .env.example           # Plantilla de configuración de la base de datos
└── run.ps1                # Script de preparación, compilación y ejecución
```

---

## 👨‍💻 Autor

<div align="center">

**DavidGR21**

[![GitHub](https://img.shields.io/badge/GitHub-DavidGR21-181717?style=for-the-badge&logo=github)](https://github.com/DavidGR21)

⭐ Si este proyecto te resultó útil, ¡considera darle una estrella en GitHub!

</div>
