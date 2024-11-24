package Almacen;

import Objetos.*;
import java.util.ArrayList;

public class Arrays {

    private ArrayList<Provincia> arprovincia = new ArrayList<>();
    private ArrayList<Ciudad> arciudad = new ArrayList<>();
    private ArrayList<Cliente> arcliente = new ArrayList<>();
    private ArrayList<Proveedor> arproveedor = new ArrayList<>();
    private ArrayList<Producto> arproducto = new ArrayList<>();
    private ArrayList<Producto_Compra> arproductoscompra = new ArrayList<>();
    private ArrayList<Compra> arcompras = new ArrayList<>();
    private ArrayList<Factura> arfactura = new ArrayList<>();
    private ArrayList<Kardex> arkardex = new ArrayList<>();

    public ArrayList<Factura> getArfactura() {
        return this.arfactura;
    }

    public void setArfactura(ArrayList<Factura> arfactura) {
        this.arfactura = arfactura;
    }

    public ArrayList<Kardex> getArkardex() {
        return this.arkardex;
    }

    public void setArkardex(ArrayList<Kardex> arkardex) {
        this.arkardex = arkardex;
    }

    public ArrayList<Compra> getArcompras() {
        return this.arcompras;
    }

    public void setArcompras(ArrayList<Compra> arcompras) {
        this.arcompras = arcompras;
    }

    public ArrayList<Producto_Compra> getArproductoscompra() {
        return this.arproductoscompra;
    }

    public void setArproductoscompra(ArrayList<Producto_Compra> arproductoscompra) {
        this.arproductoscompra = arproductoscompra;
    }

    public ArrayList<Producto> getArproducto() {
        return this.arproducto;
    }

    public void setArproducto(ArrayList<Producto> arproducto) {
        this.arproducto = arproducto;
    }

    public ArrayList<Proveedor> getArproveedor() {
        return this.arproveedor;
    }

    public void setArproveedor(ArrayList<Proveedor> arproveedor) {
        this.arproveedor = arproveedor;
    }

    public ArrayList<Cliente> getArcliente() {
        return this.arcliente;
    }

    public void setArcliente(ArrayList<Cliente> arcliente) {
        this.arcliente = arcliente;
    }

    public ArrayList<Ciudad> getArciudad() {
        return this.arciudad;
    }

    public void setArciudad(ArrayList<Ciudad> arciudad) {
        this.arciudad = arciudad;
    }

    public ArrayList<Provincia> getArprovincia() {
        return this.arprovincia;
    }

    public void setArprovincia(ArrayList<Provincia> arprovincia) {
        this.arprovincia = arprovincia;
    }
}
