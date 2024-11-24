package Controles;

import Almacen.Arrays;
import ConexionMySQL.Conexion;
import Objetos.Producto_Compra;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class ControlFactura {
    
    private Conexion con = new Conexion();
    private Arrays ar = new Arrays();
    
    public void GuardarProductosCompra(String codigo_p, int cantidad, double precio, JLabel jcambiante, JLabel stock) throws SQLException {
        if (cantidad <= Integer.parseInt(stock.getText())) {
            if (this.ControlarCodigo(codigo_p, cantidad, precio, jcambiante)) {
            } else {
                double preciototal = cantidad * precio;
                if (preciototal <= 999999.99) {
                    Producto_Compra pc = new Producto_Compra(codigo_p, cantidad, Double.parseDouble(this.ControlComaPrecio(String.valueOf(precio))), preciototal);
                    jcambiante.setText("");
                    this.ar.getArproductoscompra().add(pc);
                } else {
                    jcambiante.setForeground(Color.red);
                    jcambiante.setText("EL PRECIO SE EXCEDE DEL LIMITE");
                }
            }
        } else {
            jcambiante.setForeground(Color.red);
            jcambiante.setText("NO HAY SUFICIENTE STOCK");
        }
    }
    
    public void AgregarFactura(String c_factura, String fecha, String c_cliente, double total, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ar.getArproductoscompra().isEmpty()) {
            j.setForeground(Color.red);
            j.setText("NO PUEDES GUARDAR FACTURAS VACIAS");
        } else {
            String columnas = "codigoFactura='" + c_factura + "', fecha='" + fecha + "', codigoCliente = '" + c_cliente + "', totalVenta='" + total + "', eliminacion=0;";
            if (this.con.Insertar("factura", columnas) == 1) {
                j.setForeground(Color.red);
                j.setText("Hubo un error al agregar");
            } else {
                j.setForeground(Color.green);
                j.setText("FACTURA GUARDADA CON EXITO");
            }
        }
    }
    
    public DefaultComboBoxModel MostrarProductos() throws SQLException {
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        this.con.Conectar();
        this.con.SeleccionarTodo("productos");
        while (this.con.getRs().next()) {
            String cProducto = this.con.getRs().getString("codigoProducto");
            dcb.addElement(cProducto);
        }
        return dcb;
    }
    
    public void actualizarStock(JComboBox<String> comboBox, JLabel label) throws SQLException {
        if (comboBox.getSelectedItem() == null) {
            
        } else {
            String codigoSeleccionado = comboBox.getSelectedItem().toString();
            int stock = ObtenerStock(codigoSeleccionado);
            label.setText(String.valueOf(stock));
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String codigoSeleccionado = comboBox.getSelectedItem().toString();
                    try {
                        int stock = ObtenerStock(codigoSeleccionado);
                        label.setText(String.valueOf(stock));
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
    }
    
    public boolean ControlarStock(String codigo_p, int cantidad) throws SQLException {
        boolean a = false;
        PreparedStatement ps = null;
        ResultSet rs;
        int cant = 0;
        ps = this.con.getCon().prepareStatement("select cantidad from inventario where cProducto = '" + codigo_p + "';");
        rs = ps.executeQuery();
        if (rs.next()) {
            cant = Integer.parseInt(rs.getString("cantidad"));
        }
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            if (this.ar.getArproductoscompra().get(i).getC_Producto().equalsIgnoreCase(codigo_p)) {
                cantidad = this.ar.getArproductoscompra().get(i).getCantidad() + cantidad;
            }
        }
        if (cantidad <= cant) {
            a = true;
        }
        return a;
    }
    
    public boolean ControlarCodigo(String codigo_p, int cantidad, double precio, JLabel j) throws SQLException {
        boolean a = false;
        this.con.Conectar();
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            if (this.ar.getArproductoscompra().get(i).getC_Producto().equalsIgnoreCase(codigo_p)) {
                a = true;
                if (this.ar.getArproductoscompra().get(i).getPrecio() == precio) {
                    if (this.ControlarStock(codigo_p, cantidad)) {
                        this.ar.getArproductoscompra().get(i).setCantidad(this.ar.getArproductoscompra().get(i).getCantidad() + cantidad);
                        j.setText("");
                    } else {
                        j.setForeground(Color.red);
                        j.setText("NO HAY SUFICIENTE STOCK");
                    }
                } else {
                    j.setForeground(Color.red);
                    j.setText("NO PUEDES CAMBIAR EL PRECIO");
                }
            }
        }
        return a;
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
            j.setText("Ingrese precio permitido ejemplo (25.58)");
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
                    j.setText("INGRESE UNA CANTIDAD MAYOR A 0 Y MENOR A 1000000");
                }
            } else {
                j.setForeground(Color.red);
                j.setText("INGRESE SOLO NUMEROS ENTEROS");
            }
        } else {
            j.setForeground(Color.red);
            j.setText("INGRESE UN VALOR EN CANTIDAD");
        }
        return a;
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
    
    public void EliminarProductos() {
        this.ar.getArproductoscompra().clear();
    }
    
    public int ObtenerStock(String codigo) throws SQLException {
        int cantidad = 0;
        this.con.Conectar();
        PreparedStatement ps = null;
        ResultSet rs;
        ps = this.con.getCon().prepareStatement("select cantidad from inventario where cProducto = '" + codigo + "';");
        rs = ps.executeQuery();
        if (rs.next()) {
            cantidad = Integer.parseInt(rs.getString("cantidad"));
        }
        return cantidad;
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
    
    public DefaultTableModel MostrarProductosVenta() {
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
    
    public void GuardarInventario() throws SQLException {
        for (int i = 0; i < this.ar.getArproductoscompra().size(); i++) {
            String codigo = this.ar.getArproductoscompra().get(i).getC_Producto();
            int cantidad = this.ar.getArproductoscompra().get(i).getCantidad();
            this.GuardarProducto(codigo, cantidad);
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
                        + "descripcion='venta factura:" + factura + "', costounitario=" + this.ar.getArproductoscompra().get(i).getPrecio() + ", "
                        + "salida=" + this.ar.getArproductoscompra().get(i).getCantidad() + ", entrada=0" + ",inventario=" + inventario + ";";
                if (this.con.Insertar("kardex", columnas) == 1) {
                }
            }
        }
    }
}
