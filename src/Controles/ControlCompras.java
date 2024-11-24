/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controles;

import Almacen.Arrays;
import ConexionMySQL.Conexion;
import Objetos.Producto_Compra;
import java.awt.Color;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ControlCompras {

    private Conexion con = new Conexion();
    private Arrays ar = new Arrays();

    public void GuardarProductosCompra(String codigo_p, int cantidad, double precio, JLabel j) {
        if (this.ControlarCodigo(codigo_p, cantidad, precio, j)) {
        } else {
            double preciototal = cantidad * precio;
            if (preciototal <= 999999.99) {
                Producto_Compra pc = new Producto_Compra(codigo_p, cantidad, Double.parseDouble(this.ControlComaPrecio(String.valueOf(precio))), preciototal);
                this.ar.getArproductoscompra().add(pc);
                j.setText("");
            } else {
                j.setForeground(Color.red);
                j.setText("El precio se excede del limite");
            }
        }
    }

    public void AgregarCompra(String c_factura, String fecha, String c_proveedor, double total, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ar.getArproductoscompra().isEmpty()) {
            j.setText("No puede guardar facturas vacias");
        } else {
            String columnas = "codigoCompra='" + c_factura + "', fecha='" + fecha + "', codigoProveedor = '" + c_proveedor + "', totalCompra='" + total + "', eliminacion=0;";
            if (this.con.Insertar("compras", columnas) == 1) {
                j.setForeground(Color.red);
                j.setText("Hubo un error al agregar");
            } else {
                j.setForeground(Color.green);
                j.setText("Factura guardada con exito");
            }
        }
    }

    public double CalcularTotal() {
        double total = 0;
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            total = total + this.ar.getArproductoscompra().get(i).getPreciototal();
        }
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        double precioTotalRedondeado = Double.parseDouble(decimalFormat.format(total));
        return precioTotalRedondeado;
    }

    public boolean ControlPrecio(String precio, JLabel j) {
        boolean a = false;
        if (precio.matches("^(0|[1-9]\\d{0,6})([.,]\\d{2})?$")) {
            if (Double.parseDouble(precio) > 0 && Double.parseDouble(this.ControlComaPrecio(precio)) <= 999999.99) {
                a = true;
            } else {
                j.setForeground(Color.red);
                j.setText("No puedes ingresar precios menores a 0 y mayores a 999999.99");
            }
        } else {
            j.setForeground(Color.red);
            j.setText("Ingrese numeros permitidos ejemplo (25.58)");
            a = false;
        }
        return a;
    }

    public boolean ControlCantidad(String cantidad, JLabel j) {
        boolean a = false;
        if (cantidad != "") {
            if (cantidad.matches("^(0|[1-9]\\d{0,6})?$")) {
                if (Integer.parseInt(cantidad) > 0 && Integer.parseInt(cantidad) <= 999999) {
                    a = true;
                } else {
                    j.setForeground(Color.red);
                    j.setText("Ingrese una cantidad mayor a 0 y menor a 1000000");
                }
            } else {
                j.setForeground(Color.red);
                j.setText("Solo ingrese numeros enteros en cantidad");
            }
        } else {
            j.setText("Ingrese un valor en cantidad");
        }
        return a;
    }

    public boolean ControlarCodigo(String codigo_p, int cantidad, double precio, JLabel j) {
        boolean a = false;
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            if (this.ar.getArproductoscompra().get(i).getC_Producto().equalsIgnoreCase(codigo_p)) {
                a = true;
                if (this.ar.getArproductoscompra().get(i).getPrecio() == precio) {
                    this.ar.getArproductoscompra().get(i).setCantidad(this.ar.getArproductoscompra().get(i).getCantidad() + cantidad);
                    j.setText("");
                } else {
                    j.setText("No puedes cambiar el precio");
                }
            }
        }
        return a;
    }

    public DefaultTableModel MostrarProductosCompra() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Producto", "Precio de productos", "Cantidad Productos", "Total"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArproductoscompra().size(); i++) {
            double preciototal = this.ar.getArproductoscompra().get(i).getCantidad() * this.ar.getArproductoscompra().get(i).getPrecio();
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            double precioTotalRedondeado = Double.parseDouble(decimalFormat.format(preciototal));
            this.ar.getArproductoscompra().get(i).setPreciototal(precioTotalRedondeado);
            modelo.addRow(new Object[]{this.ar.getArproductoscompra().get(i).getC_Producto(), this.ar.getArproductoscompra().get(i).getPrecio(),
                this.ar.getArproductoscompra().get(i).getCantidad(), this.ar.getArproductoscompra().get(i).getPreciototal()});
        }
        return modelo;
    }

    public void EliminarProductos() {
        this.ar.getArproductoscompra().clear();
    }

    public DefaultComboBoxModel MostrarProductos(String cProveedor) throws SQLException {
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        this.con.Conectar();
        this.con.SeleccionarTodo("productos where codigoProveedor = '" + cProveedor + "'");
        while (this.con.getRs().next()) {
            String cProducto = this.con.getRs().getString("codigoProducto");
            dcb.addElement(cProducto);
        }
        return dcb;
    }

    public String ControlComaPrecio(String precio) {
        StringBuilder preciomodificado = new StringBuilder(precio);
        for (int i = 0; i < preciomodificado.length(); i++) {
            if (preciomodificado.charAt(i) == ',') {
                preciomodificado.replace(i, i + 1, ".");
            }
        }
        return String.valueOf(preciomodificado);
    }

    public void GuardarInventario() throws SQLException {
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            String codigo = this.ar.getArproductoscompra().get(i).getC_Producto();
            int cantidad = this.ar.getArproductoscompra().get(i).getCantidad();
            this.GuardarProductoInventario(codigo, cantidad);
        }
    }

    public void GuardarProductoInventario(String codigoProducto, int cantidad) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null, ts;
        ResultSet rs;
        ps = this.con.getCon().prepareStatement("select * from inventario where cProducto='" + codigoProducto + "';");
        rs = ps.executeQuery();
        if (rs.next()) {
            ts = this.con.getCon().prepareStatement("update inventario set cantidad = cantidad+" + cantidad + " where cProducto='" + codigoProducto + "';");
            ts.executeUpdate();
        } else {
            String columnas = "cProducto='" + codigoProducto + "', cantidad=" + cantidad + ";";
            if (this.con.Insertar("inventario", columnas) == 1) {
            }
        }
    }

    public void GuardarKardex(String fecha, String factura) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null;
        ResultSet rs;
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            ps = this.con.getCon().prepareStatement("select * from inventario where cProducto='" + this.ar.getArproductoscompra().get(i).getC_Producto() + "';");
            rs = ps.executeQuery();
            if (rs.next()) {
                int inventario = Integer.parseInt(rs.getString("cantidad"));
                String columnas = "fecha='" + fecha + "', cproducto='" + this.ar.getArproductoscompra().get(i).getC_Producto() + "', "
                        + "descripcion='compra factura:" + factura + "', costounitario=" + this.ar.getArproductoscompra().get(i).getPrecio() + ", "
                        + "entrada=" + this.ar.getArproductoscompra().get(i).getCantidad() + ", salida=0" + ",inventario=" + inventario + ";";
                if (this.con.Insertar("kardex", columnas) == 1) {
                }
            }
        }
    }

}
