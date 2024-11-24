package Controles;

import Almacen.Arrays;
import ConexionMySQL.Conexion;
import Objetos.Compra;
import Objetos.Producto_Compra;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ControlListaCompras {

    private Conexion con = new Conexion();
    private Arrays ar = new Arrays();

    public void GuardarCompraFecha(String fechas) throws SQLException {
        ResultSet r;
        this.ar.getArcompras().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select\n"
                + "	cm.codigoCompra AS codigo_Compra,\n"
                + "    cm.fecha AS Fecha,\n"
                + "    p.nombre_apellido AS Nombre_Proveedor,\n"
                + "    cm.totalCompra AS Total\n"
                + "from\n"
                + "	compras cm\n"
                + "    inner join proveedores p on cm.codigoProveedor = p.RUC where cm.eliminacion=0 and cm.fecha = '" + fechas + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cCompra = r.getString("codigo_Compra");
            String nombreProveedor = r.getString("Nombre_Proveedor");
            double total = Double.parseDouble(r.getString("Total"));
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("Fecha");
            Compra c = new Compra(cCompra, nombreProveedor, fecha, total);
            this.ar.getArcompras().add(c);
        }
    }

    public void GuardarCompraCodigo(String codigo) throws SQLException {
        ResultSet r;
        this.ar.getArcompras().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select * from compras where eliminacion=0 and codigoCompra='" + codigo + "';");
//                + "select\n"
//                + "	cm.codigoCompra AS codigo_Compra,\n"
//                + "    cm.fecha AS Fecha,\n"
//                + "    p.nombre_apellido AS Nombre_Proveedor,\n"
//                + "    cm.totalCompra AS Total\n"
//                + "from\n"
//                + "	compras cm\n"
//                + "    inner join proveedores p on cm.codigoProveedor = p.RUC where cm.eliminacion=0 and cm.codigoCompra = '" + codigo + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cCompra = r.getString("codigoCompra");
            String codigoProveedor = r.getString("codigoProveedor");
            double total = r.getDouble("totalCompra");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("fecha");
            Compra c = new Compra(cCompra, codigoProveedor, fecha, total);
            this.ar.getArcompras().add(c);
        }
    }

    public void GuardarCompraCodigoFecha(String codigo, String fechas) throws SQLException {
        ResultSet r;
        this.ar.getArcompras().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select * from compras where eliminacion=0 and codigoCompra='" + codigo + "'fecha='" + fechas + "';");
//                + "select\n"
//                + "	cm.codigoCompra AS codigo_Compra,\n"
//                + "    cm.fecha AS Fecha,\n"
//                + "    p.nombre_apellido AS Nombre_Proveedor,\n"
//                + "    cm.totalCompra AS Total\n"
//                + "from\n"
//                + "	compras cm\n"
//                + "    inner join proveedores p on cm.codigoProveedor = p.RUC where cm.eliminacion=0 and cm.codigoCompra = '" + codigo + "' and cm.fecha='" + fechas + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cCompra = r.getString("codigoCompra");
            String codigoProveedor = r.getString("codigoProveedor");
            double total = r.getDouble("totalCompra");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("fecha");
            Compra c = new Compra(cCompra, codigoProveedor, fecha, total);
            this.ar.getArcompras().add(c);
        }
    }

    public DefaultTableModel MostrarDatosCompras() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Compra", "Fecha", "Codigo Proveedor", "Total de Compra"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArcompras().size(); i++) {
            modelo.addRow(new Object[]{this.ar.getArcompras().get(i).getCodigoCompra(), this.ar.getArcompras().get(i).getFecha(),
                this.ar.getArcompras().get(i).getCodigoProvedor(), this.ar.getArcompras().get(i).getTotal()});
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
        if (codigo.matches("FC\\d{8}")) {
            a = true;
        } else {
            j.setForeground(Color.red);
            j.setText("INGRESE UN CODIGO VALIDO EJEMPLO (FC00000001)");
        }
        return a;
    }

    public void Eliminar(String codigoCompra, String fecha, JLabel j) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null;
        String sql = "update compras set eliminacion=1 where codigoCompra='" + codigoCompra + "';";
        ps = this.con.getCon().prepareStatement(sql);
        ps.executeUpdate();
        this.ObtenerProductos(codigoCompra);
        this.GuardarInventario();
        this.GuardarKardex(fecha, codigoCompra);
        j.setForeground(Color.green);
        j.setText("Compra Eliminada");
    }

    public void ObtenerProductos(String factura) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null;
        ResultSet r;
        this.ar.getArproductoscompra().clear();
        ps = this.con.getCon().prepareStatement("select * from kardex where descripcion='compra factura:" + factura + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String cProducto = r.getString("cproducto");
            int cantidad = Integer.parseInt(r.getString("entrada"));
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
            ts = this.con.getCon().prepareStatement("update inventario set cantidad = cantidad-" + cantidad + " where cProducto='" + codigoProducto + "';");
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
                        + "descripcion='compra devolucion:" + factura + "', costounitario=" + this.ar.getArproductoscompra().get(i).getPrecio() + ", "
                        + "salida=" + this.ar.getArproductoscompra().get(i).getCantidad() + ", entrada=0" + ",inventario=" + inventario + ";";
                if (this.con.Insertar("kardex", columnas) == 1) {
                }
            }
        }
    }

}
