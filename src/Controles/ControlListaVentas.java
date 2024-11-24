package Controles;

import Almacen.Arrays;
import ConexionMySQL.Conexion;
import Objetos.Compra;
import Objetos.Factura;
import Objetos.Producto_Compra;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ControlListaVentas {

    private Conexion con = new Conexion();
    private Arrays ar = new Arrays();

    public void GuardarVentasFecha(String fechas) throws SQLException {
        ResultSet r;
        this.ar.getArfactura().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select * from factura where eliminacion=0 and fecha ='" + fechas + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cFactura = r.getString("codigoFactura");
            String codigoCliente = r.getString("codigoCliente");
            double total = r.getDouble("totalVenta");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("fecha");
            Factura f = new Factura(cFactura, codigoCliente, fecha, total);
            this.ar.getArfactura().add(f);
        }
    }

    public void GuardarVentaCodigo(String codigo) throws SQLException {
        ResultSet r;
        this.ar.getArfactura().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select * from factura where eliminacion=0 and codigoFactura='" + codigo + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cFactura = r.getString("codigoFactura");
            String codigoCliente = r.getString("codigoCliente");
            double total = r.getDouble("totalVenta");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("fecha");
            Factura f = new Factura(cFactura, codigoCliente, fecha, total);
            this.ar.getArfactura().add(f);
        }
    }

    public void GuardarVentaCodigoFecha(String codigo, String fechas) throws SQLException {
        ResultSet r;
        this.ar.getArfactura().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select *from factura where eliminacion=0 and codigoFactura='" + codigo + "',fecha='" + fechas + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cFactura = r.getString("codigoFactura");
            String codigoCliente = r.getString("codigoCliente");
            double total = r.getDouble("totalVenta");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("fecha");
            Factura f = new Factura(cFactura, codigoCliente, fecha, total);
            this.ar.getArfactura().add(f);
        }
    }

    public DefaultTableModel MostrarDatosVentas() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Venta", "Fecha", "Codigo Cliente", "Total de Compra"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArfactura().size(); i++) {
            modelo.addRow(new Object[]{this.ar.getArfactura().get(i).getCodigoFactura(), this.ar.getArfactura().get(i).getFecha(),
                this.ar.getArfactura().get(i).getCodigoCliente(), this.ar.getArfactura().get(i).getTotal()});
        }
        return modelo;
    }

    public boolean ControlFecha(String fecha, JLabel j) {
        boolean a = false;
        if (fecha.matches("\\d{4}-\\d{2}-\\d{2}")) {
            a = true;
        } else {
            j.setForeground(Color.red);
            j.setText("INGRESE UNA FECHA VALIDA EJEMPLO (2023-07-01)");
        }
        return a;
    }

    public boolean ControlCodigo(String codigo, JLabel j) {
        boolean a = false;
        if (codigo.matches("FV\\d{8}")) {
            a = true;
        } else {
            j.setForeground(Color.red);
            j.setText("INGRESE UN CODIGO VALIDO EJEMPLO (FV00000001)");
        }
        return a;
    }

    public void Eliminar(String codigoFactura, String fecha, JLabel j) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null;
        String sql = "update factura set eliminacion=1 where codigoFactura='" + codigoFactura + "';";
        ps = this.con.getCon().prepareStatement(sql);
        ps.executeUpdate();
        this.ObtenerProductos(codigoFactura);
        this.GuardarInventario();
        this.GuardarKardex(fecha, codigoFactura);
        j.setForeground(Color.green);
        j.setText("Venta Eliminada");
    }

    public void ObtenerProductos(String factura) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null;
        ResultSet r;
        this.ar.getArproductoscompra().clear();
        ps = this.con.getCon().prepareStatement("select * from kardex where descripcion='venta factura:" + factura + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cProducto = r.getString("cproducto");
            int cantidad = Integer.parseInt(r.getString("salida"));
            double precio = Double.parseDouble(r.getString("costounitario"));
            Producto_Compra pc = new Producto_Compra(cProducto, cantidad, precio);
            this.ar.getArproductoscompra().add(pc);
        }
    }

    public void GuardarInventario() throws SQLException {
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            String codigo = this.ar.getArproductoscompra().get(i).getC_Producto();
            int cantidad = this.ar.getArproductoscompra().get(i).getCantidad();
            this.GuardarProducto(codigo, cantidad);
        }
    }

    public void GuardarProducto(String codigoProducto, int cantidad) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null, ts;
        ResultSet rs;
        ps = this.con.getCon().prepareStatement("select * from inventario where cProducto='" + codigoProducto + "';");
        rs = ps.executeQuery();
        if (rs.next()) {
            ts = this.con.getCon().prepareStatement("update inventario set cantidad = cantidad+" + cantidad + " where cProducto='" + codigoProducto + "';");
            ts.executeUpdate();
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
                        + "descripcion='venta devolucion:" + factura + "', costounitario=" + this.ar.getArproductoscompra().get(i).getPrecio() + ", "
                        + "entrada=" + this.ar.getArproductoscompra().get(i).getCantidad() + ", salida=0" + ",inventario=" + inventario + ";";
                if (this.con.Insertar("kardex", columnas) == 1) {
                }
            }
        }
    }
}
