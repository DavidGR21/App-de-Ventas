/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import Controles.ControlCompras;
import Controles.ControlLimites;
import Controles.Controles_Palabra;
import static Interfaz.MenuPrincipal.dato1;
import Objetos.Compra;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author HP
 */
public class MenuCompra extends javax.swing.JPanel implements Controles_Palabra {

    private String proveedor;
    private Conexion con = new Conexion();
    private ControlCompras controlcompras = new ControlCompras();

    public String getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean ControlProveedor(String proved, JLabel j) throws SQLException {
        boolean a = false;
        this.con.Conectar();
        this.con.SeleccionarTodo("proveedores");
        if (proved != null) {
            while (this.con.getRs().next()) {
                String proveed = this.con.getRs().getString("RUC");
                if (proved.equals(proveed)) {
                    a = true;
                }
            }
        } else {
            j.setText("NO INGRESO RUC");
        }
        return a;
    }

    public MenuCompra() throws SQLException {
        initComponents();
        this.cboxProductos.setModel(this.controlcompras.MostrarProductos(dato1));
        this.GuardarDatos();
        this.tblProductos.setModel(this.controlcompras.MostrarProductosCompra());
        this.ControlLimites();
    }

    public void GuardarDatos() throws SQLException {
        Compra cmp = new Compra(this.ObtenerCCompra(), dato1, String.valueOf(LocalDate.now()));
        this.txtCProveedor.setText(dato1);
        this.txtFecha.setText(String.valueOf(cmp.getFecha()));
        this.txtFactura.setText(cmp.getCodigoCompra());
    }

    public String ObtenerCCompra() throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        String autocodigo = "";
        int cod;
        this.con.Conectar();
        try {
            ps = this.con.getCon().prepareStatement("select codigoCompra from compras where codigoCompra like 'FC%' order by codigoCompra desc limit 1;");
            rs = ps.executeQuery();
            while (rs.next()) {
                autocodigo = rs.getString("codigoCompra");
                cod = 1 + Integer.parseInt(autocodigo.substring(2, 10));
                autocodigo = "FC" + String.format("%08d", cod);
            }
            if (autocodigo.isBlank()) {
                autocodigo = "FC00000001";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return autocodigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloNFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JLabel();
        tituloFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        fondoBtnComprar = new javax.swing.JPanel();
        btnComprar = new javax.swing.JLabel();
        tituloCodigoProveedor = new javax.swing.JLabel();
        txtCProveedor = new javax.swing.JLabel();
        fondoOpciones = new javax.swing.JPanel();
        tituloCDGProducto = new javax.swing.JLabel();
        cboxProductos = new javax.swing.JComboBox<>();
        tituloCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        tituloPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        fondoBtnGuardarCompra = new javax.swing.JPanel();
        btnGuardarCompra = new javax.swing.JLabel();
        lblCambiante = new javax.swing.JLabel();
        tituloTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        fondoCompras = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloNFactura.setForeground(new java.awt.Color(255, 255, 255));
        tituloNFactura.setText("Nº FACTURA:");
        jPanel1.add(tituloNFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        txtFactura.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 20));

        tituloFecha.setForeground(new java.awt.Color(255, 255, 255));
        tituloFecha.setText("FECHA:");
        jPanel1.add(tituloFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 50, 20));

        txtFecha.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 100, 20));

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setForeground(new java.awt.Color(0, 0, 0));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 540, 210));

        fondoBtnComprar.setBackground(new java.awt.Color(255, 255, 255));

        btnComprar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnComprar.setText("COMPRAR");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnComprarLayout = new javax.swing.GroupLayout(fondoBtnComprar);
        fondoBtnComprar.setLayout(fondoBtnComprarLayout);
        fondoBtnComprarLayout.setHorizontalGroup(
            fondoBtnComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        fondoBtnComprarLayout.setVerticalGroup(
            fondoBtnComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 100, 40));

        tituloCodigoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        tituloCodigoProveedor.setText("CODIGO PROVEEDOR:");
        jPanel1.add(tituloCodigoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        txtCProveedor.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtCProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 190, 20));

        fondoOpciones.setBackground(new java.awt.Color(255, 255, 255));

        tituloCDGProducto.setForeground(new java.awt.Color(0, 0, 0));
        tituloCDGProducto.setText("Cdg. Producto:");

        cboxProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboxProductosMouseEntered(evt);
            }
        });

        tituloCantidad.setForeground(new java.awt.Color(0, 0, 0));
        tituloCantidad.setText("CANTIDAD:");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloPrecio.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrecio.setText("PRECIO:");

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCDGProducto)
                    .addComponent(cboxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(tituloPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidad)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        fondoOpcionesLayout.setVerticalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addComponent(tituloCDGProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tituloPrecio)
                            .addComponent(cboxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );

        jPanel1.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 310, 70));

        fondoBtnGuardarCompra.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardarCompra.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardarCompra.setText("GUARDAR COMPRA");
        btnGuardarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarCompraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnGuardarCompraLayout = new javax.swing.GroupLayout(fondoBtnGuardarCompra);
        fondoBtnGuardarCompra.setLayout(fondoBtnGuardarCompraLayout);
        fondoBtnGuardarCompraLayout.setHorizontalGroup(
            fondoBtnGuardarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        fondoBtnGuardarCompraLayout.setVerticalGroup(
            fondoBtnGuardarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnGuardarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 30));

        lblCambiante.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 420, 20));

        tituloTotal.setBackground(new java.awt.Color(255, 255, 255));
        tituloTotal.setForeground(new java.awt.Color(255, 255, 255));
        tituloTotal.setText("TOTAL:");
        jPanel1.add(tituloTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 50, -1));

        txtTotal.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 100, 20));

        fondoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCompras.png"))); // NOI18N
        fondoCompras.setText("jLabel2");
        jPanel1.add(fondoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseEntered
        this.fondoBtnComprar.setBackground(Color.blue);
        this.btnComprar.setForeground(Color.white);
    }//GEN-LAST:event_btnComprarMouseEntered

    private void btnComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseExited
        this.fondoBtnComprar.setBackground(Color.white);
        this.btnComprar.setForeground(Color.black);
    }//GEN-LAST:event_btnComprarMouseExited

    private void btnGuardarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCompraMouseEntered
        this.fondoBtnGuardarCompra.setBackground(Color.blue);
        this.btnGuardarCompra.setForeground(Color.white);
    }//GEN-LAST:event_btnGuardarCompraMouseEntered

    private void btnGuardarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCompraMouseExited
        this.fondoBtnGuardarCompra.setBackground(Color.white);
        this.btnGuardarCompra.setForeground(Color.black);
    }//GEN-LAST:event_btnGuardarCompraMouseExited

    private void btnGuardarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCompraMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            try {
                if (this.txtTotal.getText().isBlank()) {
                    this.lblCambiante.setText("No puede agregar facturas vacias");
                } else {
                    this.controlcompras.AgregarCompra(this.txtFactura.getText(), this.txtFecha.getText(), this.txtCProveedor.getText(), Double.parseDouble(this.txtTotal.getText()), this.lblCambiante);
                    this.controlcompras.GuardarInventario();
                    this.controlcompras.GuardarKardex(this.txtFecha.getText(), this.txtFactura.getText());
                    this.controlcompras.EliminarProductos();
                    this.tblProductos.setModel(this.controlcompras.MostrarProductosCompra());
                    this.txtFactura.setText(this.ObtenerCCompra());
                    this.con.Desconectar();
                    this.txtCantidad.setText("");
                    this.txtPrecio.setText("");
                    this.txtTotal.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarCompraMouseClicked

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        double total = 0;
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (!(this.txtCantidad.getText().isEmpty() || this.txtPrecio.getText().isEmpty())) {
                try {
                    total = (Integer.valueOf(this.txtCantidad.getText()) * Double.parseDouble(this.controlcompras.ControlComaPrecio(this.txtPrecio.getText())));
                } catch (NumberFormatException e) {
                    this.lblCambiante.setText("NO INGRESE CARACTERES ESPECIALES");
                }
                if (total <= 999999.99) {
                    if (this.controlcompras.ControlPrecio(this.controlcompras.ControlComaPrecio(this.txtPrecio.getText()), this.lblCambiante)) {
                        if (this.controlcompras.ControlCantidad(this.txtCantidad.getText(), this.lblCambiante)) {
                            try {
                                this.controlcompras.GuardarProductosCompra(String.valueOf(this.cboxProductos.getSelectedItem()), Integer.valueOf(this.txtCantidad.getText()), Double.valueOf(this.controlcompras.ControlComaPrecio(this.txtPrecio.getText())), this.lblCambiante);
                                this.tblProductos.setModel(this.controlcompras.MostrarProductosCompra());
                                this.txtTotal.setText(String.valueOf(this.controlcompras.CalcularTotal()));
                                this.con.Desconectar();
                            } catch (SQLException ex) {
                                Logger.getLogger(MenuCompra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        this.lblCambiante.setText("Ingrese un precio valido");
                    }
                } else {
                    this.lblCambiante.setText("El total sobrepasa el precio accesible");
                }
            } else {
                this.lblCambiante.setText("Existen campos vacios");
            }
        }

    }//GEN-LAST:event_btnComprarMouseClicked

    private void cboxProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxProductosMouseEntered
        if (this.con.BuscarConexion()) {
            this.cboxProductos.setEnabled(false);
        } else {
            this.cboxProductos.setEnabled(true);
        }
    }//GEN-LAST:event_cboxProductosMouseEntered
    public void ControlLimites() {
        ((AbstractDocument) this.txtCantidad.getDocument()).setDocumentFilter(new ControlLimites(6));
        ((AbstractDocument) this.txtPrecio.getDocument()).setDocumentFilter(new ControlLimites(9));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnComprar;
    private javax.swing.JLabel btnGuardarCompra;
    private javax.swing.JComboBox<String> cboxProductos;
    private javax.swing.JPanel fondoBtnComprar;
    private javax.swing.JPanel fondoBtnGuardarCompra;
    private javax.swing.JLabel fondoCompras;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCambiante;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel tituloCDGProducto;
    private javax.swing.JLabel tituloCantidad;
    private javax.swing.JLabel tituloCodigoProveedor;
    private javax.swing.JLabel tituloFecha;
    private javax.swing.JLabel tituloNFactura;
    private javax.swing.JLabel tituloPrecio;
    private javax.swing.JLabel tituloTotal;
    private javax.swing.JLabel txtCProveedor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtFactura;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

    @Override
    public String ControlSimbolos(String palabra) {
        StringBuilder cadenaModificada = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            if (caracter == '\'') {
                cadenaModificada.append('\\'); // Agregar barra diagonal inversa antes de la comilla
            }
            if (caracter == '\\') {
                cadenaModificada.append('\\'); // Agregar barra diagonal inversa antes de la comilla
            }

            cadenaModificada.append(caracter);
        }
        return cadenaModificada.toString();
    }

    @Override
    public boolean ControlPalabra(String palabra) {
        boolean a = false;
        this.ControlSimbolos(palabra);
        if (palabra.matches("[^(0|[1-9]\\d{0,6})([.,]\\d{2})?$]")) {
            a = true;
        }
        return a;
    }
}
