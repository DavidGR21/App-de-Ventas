-- Esquema de la base de datos de App de Ventas
-- Generado a partir de las consultas SQL del código fuente.

CREATE DATABASE IF NOT EXISTS proyecto CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE proyecto;

CREATE TABLE IF NOT EXISTS provincias (
    codigoProvincia VARCHAR(10)  NOT NULL PRIMARY KEY,
    nombreProvincia VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS ciudades (
    codigoCiudad    VARCHAR(10)  NOT NULL PRIMARY KEY,
    nombreCiudad    VARCHAR(100) NOT NULL,
    codigoProvincia VARCHAR(10)  NOT NULL,
    FOREIGN KEY (codigoProvincia) REFERENCES provincias(codigoProvincia)
);

CREATE TABLE IF NOT EXISTS clientes (
    cedula          VARCHAR(13)  NOT NULL PRIMARY KEY,
    nombre_apellido VARCHAR(150) NOT NULL,
    direccion       VARCHAR(200),
    codigoCiudad    VARCHAR(10)  NOT NULL,
    FOREIGN KEY (codigoCiudad) REFERENCES ciudades(codigoCiudad)
);

CREATE TABLE IF NOT EXISTS proveedores (
    RUC             VARCHAR(13)  NOT NULL PRIMARY KEY,
    nombre_apellido VARCHAR(150) NOT NULL,
    telefono        VARCHAR(15),
    direccion       VARCHAR(200),
    codigoCiudad    VARCHAR(10)  NOT NULL,
    FOREIGN KEY (codigoCiudad) REFERENCES ciudades(codigoCiudad)
);

CREATE TABLE IF NOT EXISTS productos (
    codigoProducto  VARCHAR(20)  NOT NULL PRIMARY KEY,
    nombre          VARCHAR(150) NOT NULL,
    codigoProveedor VARCHAR(13)  NOT NULL,
    FOREIGN KEY (codigoProveedor) REFERENCES proveedores(RUC)
);

CREATE TABLE IF NOT EXISTS inventario (
    cProducto VARCHAR(20) NOT NULL PRIMARY KEY,
    cantidad  INT         NOT NULL DEFAULT 0,
    FOREIGN KEY (cProducto) REFERENCES productos(codigoProducto)
);

CREATE TABLE IF NOT EXISTS compras (
    codigoCompra    VARCHAR(20)   NOT NULL PRIMARY KEY,
    fecha           DATE          NOT NULL,
    codigoProveedor VARCHAR(13)   NOT NULL,
    totalCompra     DECIMAL(12,2) NOT NULL,
    eliminacion     TINYINT(1)    NOT NULL DEFAULT 0,
    FOREIGN KEY (codigoProveedor) REFERENCES proveedores(RUC)
);

CREATE TABLE IF NOT EXISTS factura (
    codigoFactura VARCHAR(20)   NOT NULL PRIMARY KEY,
    fecha         DATE          NOT NULL,
    codigoCliente VARCHAR(13)   NOT NULL,
    totalVenta    DECIMAL(12,2) NOT NULL,
    eliminacion   TINYINT(1)    NOT NULL DEFAULT 0,
    FOREIGN KEY (codigoCliente) REFERENCES clientes(cedula)
);

CREATE TABLE IF NOT EXISTS kardex (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    fecha         DATE          NOT NULL,
    cproducto     VARCHAR(20)   NOT NULL,
    descripcion   VARCHAR(100)  NOT NULL,
    costounitario DECIMAL(12,2) NOT NULL,
    entrada       INT           NOT NULL DEFAULT 0,
    salida        INT           NOT NULL DEFAULT 0,
    inventario    INT           NOT NULL DEFAULT 0,
    INDEX idx_kardex_producto (cproducto),
    INDEX idx_kardex_descripcion (descripcion),
    FOREIGN KEY (cproducto) REFERENCES productos(codigoProducto)
);

CREATE TABLE IF NOT EXISTS usuarios (
    usuario        VARCHAR(50)  NOT NULL PRIMARY KEY,
    clave          VARCHAR(255) NOT NULL,  -- AES (ECB/PKCS5) + Base64, ver EncriptacionDatos
    pIntentos      INT          NOT NULL DEFAULT 0,
    pProducto      TINYINT(1)   NOT NULL DEFAULT 0,
    pClientes      TINYINT(1)   NOT NULL DEFAULT 0,
    pProveedor     TINYINT(1)   NOT NULL DEFAULT 0,
    pFactura       TINYINT(1)   NOT NULL DEFAULT 0,
    pCompra        TINYINT(1)   NOT NULL DEFAULT 0,
    pKardex        TINYINT(1)   NOT NULL DEFAULT 0,
    pProvincias    TINYINT(1)   NOT NULL DEFAULT 0,
    pCiudades      TINYINT(1)   NOT NULL DEFAULT 0,
    pListaVenta    TINYINT(1)   NOT NULL DEFAULT 0,
    pListaCompra   TINYINT(1)   NOT NULL DEFAULT 0,
    pGestorUsuario TINYINT(1)   NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS usuariosbloqueados (
    usuario VARCHAR(50) NOT NULL PRIMARY KEY
);

-- Usuario administrador inicial: admin / admin (cámbiala tras el primer ingreso)
-- La clave se cifra igual que en Java: AES-128-ECB con SHA-1('DavidGiler')[0..16] y Base64.
SET SESSION block_encryption_mode = 'aes-128-ecb';
INSERT IGNORE INTO usuarios
    (usuario, clave, pProducto, pClientes, pProveedor, pFactura, pCompra, pKardex,
     pProvincias, pCiudades, pListaVenta, pListaCompra, pGestorUsuario)
VALUES
    ('admin', TO_BASE64(AES_ENCRYPT('admin', UNHEX(LEFT(SHA1('DavidGiler'), 32)))),
     1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
