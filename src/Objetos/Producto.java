package Objetos;

public class Producto {

    private String codigo, nombre, cProveedor;

    public Producto(String codigo, String nombre, String cProveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cProveedor = cProveedor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcProveedor() {
        return this.cProveedor;
    }

    public void setcProveedor(String cProveedor) {
        this.cProveedor = cProveedor;
    }

}
