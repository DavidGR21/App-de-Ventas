package Objetos;

public class Compra {

    private String codigoCompra;
    private String codigoProvedor;
    private String fecha;
    private double total;

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Compra(String codigoCompra, String codigoProvedor, String fecha, double total) {
        this.codigoCompra = codigoCompra;
        this.codigoProvedor = codigoProvedor;
        this.fecha = fecha;
        this.total = total;
    }

    public Compra(String codigoCompra, String codigoProvedor, String fecha) {
        this.codigoCompra = codigoCompra;
        this.codigoProvedor = codigoProvedor;
        this.fecha = fecha;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigoCompra() {
        return this.codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getCodigoProvedor() {
        return this.codigoProvedor;
    }

    public void setCodigoProvedor(String codigoProvedor) {
        this.codigoProvedor = codigoProvedor;
    }

}
