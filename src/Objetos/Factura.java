package Objetos;

import java.time.LocalDate;

public class Factura {

    private String codigoFactura;
    private String codigoCliente;
    private String fecha;
    private double total;

    public Factura(String codigoFactura, String codigoCliente, String fecha) {
        this.codigoFactura = codigoFactura;
        this.codigoCliente = codigoCliente;
        this.fecha = fecha;
    }

    public Factura(String codigoFactura, String codigoCliente, String fecha, double total) {
        this.codigoFactura = codigoFactura;
        this.codigoCliente = codigoCliente;
        this.fecha = fecha;
        this.total = total;
    }

    public String getCodigoFactura() {
        return this.codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
