package Objetos;

public class Kardex {

    private String fecha;
    private String cproducto;
    private String descripcion;
    private double costounitario;
    private int entrada, salida, inventario;

    public Kardex(String fecha, String cproducto, String descripcion, double costounitario, int entrada, int salida, int inventario) {
        this.fecha = fecha;
        this.cproducto = cproducto;
        this.descripcion = descripcion;
        this.costounitario = costounitario;
        this.entrada = entrada;
        this.salida = salida;
        this.inventario = inventario;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCproducto() {
        return this.cproducto;
    }

    public void setCproducto(String cproducto) {
        this.cproducto = cproducto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostounitario() {
        return this.costounitario;
    }

    public void setCostounitario(double costounitario) {
        this.costounitario = costounitario;
    }

    public int getEntrada() {
        return this.entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return this.salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getInventario() {
        return this.inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

}
