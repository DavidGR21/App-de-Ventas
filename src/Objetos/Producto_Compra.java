package Objetos;

public class Producto_Compra {

    private String c_Producto;
    private int cantidad;
    private double precio;
    private double preciototal;

    public Producto_Compra(String c_Producto, int cantidad, double precio, double preciototal) {
        this.c_Producto = c_Producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.preciototal = preciototal;
    }

    public Producto_Compra(String c_Producto, int cantidad, double precio) {
        this.c_Producto = c_Producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getPreciototal() {
        return this.preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public String getC_Producto() {
        return this.c_Producto;
    }

    public void setC_Producto(String c_Producto) {
        this.c_Producto = c_Producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
