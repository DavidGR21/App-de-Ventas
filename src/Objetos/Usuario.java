package Objetos;

public class Usuario {

    private String Usuario, clave;
    private int pProducto = 0, pClientes = 0, pProveedor = 0,
            pFactura = 0, pCompra = 0, pKardex = 0, pProvincias = 0,
            pCiudades = 0, pListaVenta = 0, pListaCompra = 0, pGestorUsuario = 0, intentos = 0;

    public Usuario(String Usuario, String clave, int intentos) {
        this.Usuario = Usuario;
        this.clave = clave;
        this.intentos = intentos;
    }

    public Usuario(String Usuario, String clave, int pProductos, int pClientes, int pProveedor, int pFactura, int pCompra, int pKardex,
            int pProvincias, int pCiudades, int pListaVenta, int pListaCompra, int pGestorUsuario) {
        this.Usuario = Usuario;
        this.clave = clave;
        this.pProducto = pProductos;
        this.pClientes = pClientes;
        this.pProveedor = pProveedor;
        this.pFactura = pFactura;
        this.pCompra = pCompra;
        this.pKardex = pKardex;
        this.pProvincias = pProvincias;
        this.pCiudades = pCiudades;
        this.pListaVenta = pListaVenta;
        this.pListaCompra = pListaCompra;
        this.pGestorUsuario = pGestorUsuario;
    }

    public int getIntentos() {
        return this.intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getUsuario() {
        return this.Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int ispProducto() {
        return this.pProducto;
    }

    public void setpProducto(int pProducto) {
        this.pProducto = pProducto;
    }

    public int ispClientes() {
        return this.pClientes;
    }

    public void setpClientes(int pClientes) {
        this.pClientes = pClientes;
    }

    public int ispProveedor() {
        return this.pProveedor;
    }

    public void setpProveedor(int pProveedor) {
        this.pProveedor = pProveedor;
    }

    public int ispFactura() {
        return this.pFactura;
    }

    public void setpFactura(int pFactura) {
        this.pFactura = pFactura;
    }

    public int ispCompra() {
        return this.pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int ispKardex() {
        return this.pKardex;
    }

    public void setpKardex(int pKardex) {
        this.pKardex = pKardex;
    }

    public int ispProvincias() {
        return this.pProvincias;
    }

    public void setpProvincias(int pProvincias) {
        this.pProvincias = pProvincias;
    }

    public int ispCiudades() {
        return this.pCiudades;
    }

    public void setpCiudades(int pCiudades) {
        this.pCiudades = pCiudades;
    }

    public int ispListaVenta() {
        return this.pListaVenta;
    }

    public void setpListaVenta(int pListaVenta) {
        this.pListaVenta = pListaVenta;
    }

    public int ispListaCompra() {
        return this.pListaCompra;
    }

    public void setpListaCompra(int pListaCompra) {
        this.pListaCompra = pListaCompra;
    }

    public int ispGestorUsuario() {
        return this.pGestorUsuario;
    }

    public void setpGestorUsuario(int pGestorUsuario) {
        this.pGestorUsuario = pGestorUsuario;
    }

}
