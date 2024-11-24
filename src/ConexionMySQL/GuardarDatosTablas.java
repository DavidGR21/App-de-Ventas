package ConexionMySQL;

import Almacen.Arrays;
import Objetos.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class GuardarDatosTablas {

    private Conexion con = new Conexion();
    private Arrays ar = new Arrays();

    public void GuardarProvincia() throws SQLException {
        ResultSet r;
        this.ar.getArprovincia().clear();
        this.con.SeleccionarTodo("provincias");
        r = this.con.getRs();
        while (r.next()) {
            String codigo = r.getString("codigoProvincia");
            String nombre = r.getString("nombreProvincia");
            Provincia p = new Provincia(codigo, nombre);
            ar.getArprovincia().add(p);
        }
    }

    public DefaultTableModel MostrarDatosProvincias() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Provincia", "Nombre Provincia"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArprovincia().size(); i++) {
            modelo.addRow(new Object[]{ar.getArprovincia().get(i).getCodigo(), ar.getArprovincia().get(i).getNombre()});
        }
        return modelo;
    }

    public void GuardarCiudades() throws SQLException {
        ResultSet r;
        PreparedStatement ps;
        this.ar.getArciudad().clear();
        this.con.SubSeleccion("nombreProvincia", "provincias",
                "ciudades.codigoProvincia", "provincias.codigoProvincia", "ciudades", "nombre_Provincia");
        r = this.con.getRs();
        while (r.next()) {
            String codigo = r.getString("codigoCiudad");
            String nombre = r.getString("nombreCiudad");
            String cprovincia = r.getString("codigoProvincia");
            String nProvincia = r.getString("Nombre_Provincia");
            Ciudad c = new Ciudad(cprovincia, nProvincia, codigo, nombre);
            ar.getArciudad().add(c);
        }
    }

    public DefaultTableModel MostrarDatosCiudades() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Ciudad", "Nombre Ciudad", "Nombre Provincia"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArciudad().size(); i++) {
            modelo.addRow(new Object[]{ar.getArciudad().get(i).getCodigo(), ar.getArciudad().get(i).getNombre(),
                ar.getArciudad().get(i).getNombreProvincia()});
        }
        return modelo;
    }

    public void GuardarClientes() throws SQLException {
        ResultSet r;
        this.ar.getArcliente().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select *from clientes;");
        r = ps.executeQuery();
        while (r.next()) {
            String nombre_apellido = r.getString("nombre_apellido");
            String cedula = r.getString("cedula");
            String direccion = r.getString("direccion");
            String nCiudad = r.getString("codigoCiudad");
//            String nProvincia = r.getString("nombre_provincia");
            Cliente c = new Cliente(nCiudad, nombre_apellido, cedula, direccion);
            this.ar.getArcliente().add(c);
        }
    }

    public DefaultTableModel MostrarDatosClientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Cedula", "Nombre_Apellido", "Dirección", "Codigo Ciudad"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArcliente().size(); i++) {
            modelo.addRow(new Object[]{ar.getArcliente().get(i).getId(), ar.getArcliente().get(i).getNombre(),
                ar.getArcliente().get(i).getDireccion(), ar.getArcliente().get(i).getnCiudad()});
        }
        return modelo;
    }

    public void GuardarProveedores() throws SQLException {
        ResultSet r;
        this.ar.getArproveedor().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select *from proveedores;");
        r = ps.executeQuery();
        while (r.next()) {
            String nombre_apellido = r.getString("nombre_apellido");
            String ruc = r.getString("RUC");
            String direccion = r.getString("direccion");
            String telefono = r.getString("telefono");
            String cCiudad = r.getString("codigoCiudad");
            Proveedor p = new Proveedor(telefono, cCiudad, nombre_apellido, ruc, direccion);
            this.ar.getArproveedor().add(p);
        }
    }

    public DefaultTableModel MostrarDatosProveedor() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"RUC", "Nombre_Apellido", "Dirección", "Teléfono", "Codigo Ciudad"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArproveedor().size(); i++) {
            modelo.addRow(new Object[]{this.ar.getArproveedor().get(i).getId(), this.ar.getArproveedor().get(i).getNombre(),
                this.ar.getArproveedor().get(i).getDireccion(), this.ar.getArproveedor().get(i).getTelefono(),
                this.ar.getArproveedor().get(i).getnCiudad()});
        }
        return modelo;
    }

    public void GuardarProductos() throws SQLException {
        ResultSet r;
        this.ar.getArproducto().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select *from productos;");
        r = ps.executeQuery();
        while (r.next()) {
            String cProducto = r.getString("codigoProducto");
            String nombre = r.getString("nombre");
            String cProveedor = r.getString("codigoProveedor");
            Producto p = new Producto(cProducto, nombre, cProveedor);
            this.ar.getArproducto().add(p);
        }
    }

    public DefaultTableModel MostrarDatosProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Producto", "Nombre Producto", "Codigo de Proveedor"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArproducto().size(); i++) {
            modelo.addRow(new Object[]{this.ar.getArproducto().get(i).getCodigo(), this.ar.getArproducto().get(i).getNombre(),
                this.ar.getArproducto().get(i).getcProveedor()});
        }
        return modelo;
    }

    public void GuardarDatosCompras() throws SQLException {
        ResultSet r;
        this.ar.getArcompras().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select *from compras where eliminacion=0");
//                + "select\n"
//                + "	cm.codigoCompra AS codigo_Compra,\n"
//                + "    cm.fecha AS Fecha,\n"
//                + "    p.nombre_apellido AS Nombre_Proveedor,\n"
//                + "    cm.totalCompra AS Total\n"
//                + "from\n"
//                + "	compras cm\n"
//                + "    inner join proveedores p on cm.codigoProveedor = p.RUC where cm.eliminacion=0;");
        r = ps.executeQuery();
        while (r.next()) {
            String cCompra = r.getString("codigoCompra");
            String codigo_proveedor = r.getString("codigoProveedor");
            double total = r.getDouble("totalCompra");
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = r.getString("fecha");
            Compra c = new Compra(cCompra, codigo_proveedor, fecha, total);
            this.ar.getArcompras().add(c);
        }
    }

    public void GuardarDatosFactura() throws SQLException {
        ResultSet r;
        this.ar.getArfactura().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select *from factura where eliminacion=0");
//                + "select\n"
//                + "	fa.codigoFactura AS Codigo_factura,\n"
//                + "    fa.fecha AS Fecha,\n"
//                + "    c.nombre_apellido AS Nombre_Cliente,\n"
//                + "    fa.totalVenta AS Total\n"
//                + "from\n"
//                + "	factura fa\n"
//                + "    inner join clientes c on fa.codigoCliente = c.cedula where fa.eliminacion=0");
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

    public DefaultTableModel MostrarDatosFacturas() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Codigo Factura", "Fecha", "Codigo Cliente", "Total de Compra"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArfactura().size(); i++) {
            modelo.addRow(new Object[]{this.ar.getArfactura().get(i).getCodigoFactura(), this.ar.getArfactura().get(i).getFecha(),
                this.ar.getArfactura().get(i).getCodigoCliente(), this.ar.getArfactura().get(i).getTotal()});
        }
        return modelo;
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

    public void GuardarDatosKardex() throws SQLException {
        ResultSet r;
        this.ar.getArkardex().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select * from kardex;");
        r = ps.executeQuery();
        while (r.next()) {
            String fecha = r.getString("fecha");
            String cproducto = r.getString("cproducto");
            String descripcion = r.getString("descripcion");
            double costounitario = Double.parseDouble(r.getString("costounitario"));
            int entrada = Integer.parseInt(r.getString("entrada"));
            int salida = Integer.parseInt(r.getString("salida"));
            int inventario = Integer.parseInt(r.getString("inventario"));
            Kardex k = new Kardex(fecha, cproducto, descripcion, costounitario, entrada, salida, inventario);
            this.ar.getArkardex().add(k);
        }
    }

    public DefaultTableModel MostrarDatosKardex() {
        DefaultTableModel modelo = new DefaultTableModel();
        String ids[] = {"Fecha", "C.Producto", "Descripción", "Cst.Unitario", "entrada", "salida", "Invetario"};
        modelo.setColumnIdentifiers(ids);
        modelo.setRowCount(0);
        for (int i = 0; i < ar.getArkardex().size(); i++) {
            modelo.addRow(new Object[]{this.ar.getArkardex().get(i).getFecha(), this.ar.getArkardex().get(i).getCproducto(),
                this.ar.getArkardex().get(i).getDescripcion(), this.ar.getArkardex().get(i).getCostounitario(),
                this.ar.getArkardex().get(i).getEntrada(), this.ar.getArkardex().get(i).getSalida(), this.ar.getArkardex().get(i).getInventario()});
        }
        return modelo;
    }

    public DefaultComboBoxModel MostrarProductosKardex() throws SQLException {
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        this.con.Conectar();
        this.con.SeleccionarTodo("kardex");
        while (this.con.getRs().next()) {
            String cProducto = this.con.getRs().getString("cproducto");
            if (!existeElemento(dcb, cProducto)) {
                dcb.addElement(cProducto);
            }
        }
        return dcb;
    }

    public boolean existeElemento(DefaultComboBoxModel model, String elemento) {
        for (int i = 0; i < model.getSize(); i++) {
            Object item = model.getElementAt(i);
            if (item != null && item.toString().equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void GuardarKardexCodigo(String codigo) throws SQLException {
        ResultSet r;
        this.ar.getArkardex().clear();
        PreparedStatement ps;
        this.con.Conectar();
        ps = this.con.getCon().prepareStatement("select * from kardex where cproducto='" + codigo + "';");
        r = ps.executeQuery();
        while (r.next()) {
            String fecha = r.getString("fecha");
            String cproducto = r.getString("cproducto");
            String descripcion = r.getString("descripcion");
            double costounitario = Double.parseDouble(r.getString("costounitario"));
            int entrada = Integer.parseInt(r.getString("entrada"));
            int salida = Integer.parseInt(r.getString("salida"));
            int inventario = Integer.parseInt(r.getString("inventario"));
            Kardex k = new Kardex(fecha, cproducto, descripcion, costounitario, entrada, salida, inventario);
            this.ar.getArkardex().add(k);
        }
    }

}
