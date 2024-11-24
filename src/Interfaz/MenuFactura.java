package Interfaz;

import ConexionMySQL.Conexion;
import Controles.ControlFactura;
import Controles.ControlLimites;
import static Interfaz.MenuPrincipal.dato2;
import Objetos.Factura;
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
public class MenuFactura extends javax.swing.JPanel {

    private Conexion con = new Conexion();
    private ControlFactura cf = new ControlFactura();

    public MenuFactura() throws SQLException {
        initComponents();
        this.GuardarDatos();
        this.cboxProductos.setModel(this.cf.MostrarProductos());
        this.tblProductosventa.setModel(this.cf.MostrarProductosVenta());
        this.cf.actualizarStock(cboxProductos, this.txtStock);
        this.ControlLimites();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosventa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboxProductos = new javax.swing.JComboBox<>();
        titulofactura = new javax.swing.JLabel();
        titulofecha = new javax.swing.JLabel();
        titulocedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        tituloCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        tituloPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        fondobtnComprar = new javax.swing.JPanel();
        btnComprar = new javax.swing.JLabel();
        lblCambiante = new javax.swing.JLabel();
        tituloTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        tituloStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JLabel();
        fondoBtnGuardar = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        fondoFacturas = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductosventa.setBackground(new java.awt.Color(255, 255, 255));
        tblProductosventa.setForeground(new java.awt.Color(0, 0, 0));
        tblProductosventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductosventa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 630, 220));

        jPanel2.setBackground(new java.awt.Color(0, 51, 82));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODIGO DEL PRODUCTO:");

        cboxProductos.setBackground(new java.awt.Color(255, 255, 255));
        cboxProductos.setForeground(new java.awt.Color(0, 0, 0));
        cboxProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboxProductosMouseEntered(evt);
            }
        });

        titulofactura.setForeground(new java.awt.Color(255, 255, 255));
        titulofactura.setText("N° FACTURA:");

        titulofecha.setForeground(new java.awt.Color(255, 255, 255));
        titulofecha.setText("FECHA:");

        titulocedula.setForeground(new java.awt.Color(255, 255, 255));
        titulocedula.setText("CODIGO DEL CLIENTE:");

        txtCedula.setBackground(new java.awt.Color(0, 51, 82));
        txtCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtCedula.setBorder(null);
        txtCedula.setCaretColor(new java.awt.Color(255, 255, 255));

        txtfecha.setBackground(new java.awt.Color(0, 51, 82));
        txtfecha.setForeground(new java.awt.Color(255, 255, 255));
        txtfecha.setBorder(null);

        txtFactura.setBackground(new java.awt.Color(0, 51, 82));
        txtFactura.setForeground(new java.awt.Color(255, 255, 255));
        txtFactura.setBorder(null);
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });

        tituloCantidad.setForeground(new java.awt.Color(255, 255, 255));
        tituloCantidad.setText("CANTIDAD:");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));

        tituloPrecio.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrecio.setText("PRECIO:");

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(titulocedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(titulofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titulofecha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tituloCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboxProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulofactura)
                    .addComponent(titulofecha)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulocedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 100));

        fondobtnComprar.setBackground(new java.awt.Color(0, 51, 82));
        fondobtnComprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout fondobtnComprarLayout = new javax.swing.GroupLayout(fondobtnComprar);
        fondobtnComprar.setLayout(fondobtnComprarLayout);
        fondobtnComprarLayout.setHorizontalGroup(
            fondobtnComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        fondobtnComprarLayout.setVerticalGroup(
            fondobtnComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(fondobtnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, 40));

        lblCambiante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 470, 20));

        tituloTotal.setForeground(new java.awt.Color(255, 255, 255));
        tituloTotal.setText("TOTAL:");
        jPanel1.add(tituloTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        txtTotal.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 90, 20));

        tituloStock.setForeground(new java.awt.Color(255, 255, 255));
        tituloStock.setText("STOCK:");
        jPanel1.add(tituloStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 50, 20));

        fondoBtnGuardar.setBackground(new java.awt.Color(0, 51, 82));
        fondoBtnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnGuardarLayout = new javax.swing.GroupLayout(fondoBtnGuardar);
        fondoBtnGuardar.setLayout(fondoBtnGuardarLayout);
        fondoBtnGuardarLayout.setHorizontalGroup(
            fondoBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        fondoBtnGuardarLayout.setVerticalGroup(
            fondoBtnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, 40));

        fondoFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2 (1).png"))); // NOI18N
        jPanel1.add(fondoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void btnComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseEntered
        this.fondobtnComprar.setBackground(new Color(204, 203, 210));
        this.btnComprar.setForeground(new Color(0, 51, 82));
    }//GEN-LAST:event_btnComprarMouseEntered

    private void btnComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseExited
        this.fondobtnComprar.setBackground(new Color(0, 51, 82));
        this.btnComprar.setForeground(Color.white);
    }//GEN-LAST:event_btnComprarMouseExited

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        double total = 0;
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (!(this.txtCantidad.getText().isEmpty() || this.txtPrecio.getText().isEmpty())) {
                try {
                    total = (Integer.valueOf(this.txtCantidad.getText()) * Double.parseDouble(this.cf.ControlComaPrecio(this.txtPrecio.getText())));
                } catch (NumberFormatException e) {
                    this.lblCambiante.setText("NO INGRESE CARACTERES ESPECIALES");
                }
                if (total <= 999999.99) {
                    if (this.cf.ControlPrecio(this.cf.ControlComaPrecio(this.txtPrecio.getText()), this.lblCambiante)) {
                        if (this.cf.ControlCantidad(this.txtCantidad.getText(), this.lblCambiante)) {
                            try {
                                this.cf.GuardarProductosCompra(String.valueOf(this.cboxProductos.getSelectedItem()), Integer.valueOf(this.txtCantidad.getText()), Double.valueOf(this.cf.ControlComaPrecio(this.txtPrecio.getText())), this.lblCambiante, this.txtStock);
                                this.tblProductosventa.setModel(this.cf.MostrarProductosVenta());
                                this.txtTotal.setText(String.valueOf(this.cf.CalcularTotal()));
                                this.con.Desconectar();
                            } catch (SQLException ex) {
                                Logger.getLogger(MenuFactura.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                } else {
                    this.lblCambiante.setForeground(Color.red);
                    this.lblCambiante.setText("El total sobrepasa el precio accesible");
                }
            } else {
                this.lblCambiante.setForeground(Color.red);
                this.lblCambiante.setText("Existen campos vacios");
            }
        }
    }//GEN-LAST:event_btnComprarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        this.fondoBtnGuardar.setBackground(new Color(204, 203, 210));
        this.btnGuardar.setForeground(new Color(0, 51, 82));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        this.fondoBtnGuardar.setBackground(new Color(0, 51, 82));
        this.btnGuardar.setForeground(Color.white);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            try {
                if (this.txtTotal.getText().isBlank()) {
                    this.lblCambiante.setForeground(Color.red);
                    this.lblCambiante.setText("No puede agregar facturas vacias");
                } else {
                    this.cf.AgregarFactura(this.txtFactura.getText(), this.txtfecha.getText(), this.txtCedula.getText(), Double.parseDouble(this.txtTotal.getText()), this.lblCambiante);
                    this.cf.GuardarInventario();
                    this.cf.GuardarKardex(this.txtfecha.getText(), this.txtFactura.getText());
                    this.cf.EliminarProductos();
                    this.tblProductosventa.setModel(this.cf.MostrarProductosVenta());
                    this.txtFactura.setText(this.ObtenerCFactura());
                    this.cboxProductos.setModel(this.cf.MostrarProductos());
                    this.cf.actualizarStock(cboxProductos, this.txtStock);
                    this.txtCantidad.setText("");
                    this.txtPrecio.setText("");
                    this.txtTotal.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void cboxProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxProductosMouseClicked

    }//GEN-LAST:event_cboxProductosMouseClicked

    private void cboxProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxProductosMouseEntered
        if (this.con.BuscarConexion()) {
            this.cboxProductos.setEnabled(false);
        } else {
            this.cboxProductos.setEnabled(true);
        }
    }//GEN-LAST:event_cboxProductosMouseEntered
    public void GuardarDatos() throws SQLException {
        Factura f = new Factura(this.ObtenerCFactura(), dato2, String.valueOf(LocalDate.now()));
        this.txtCedula.setText(dato2);
        this.txtfecha.setText(String.valueOf(f.getFecha()));
        this.txtFactura.setText(f.getCodigoFactura());
    }

    public String ObtenerCFactura() throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        String autocodigo = "";
        int cod;
        this.con.Conectar();
        try {
            ps = this.con.getCon().prepareStatement("select codigoFactura from factura where codigoFactura like 'FV%' order by codigoFactura desc limit 1;");
            rs = ps.executeQuery();
            while (rs.next()) {
                autocodigo = rs.getString("codigoFactura");
                cod = 1 + Integer.parseInt(autocodigo.substring(2, 10));
                autocodigo = "FV" + String.format("%08d", cod);
            }
            if (autocodigo.isBlank()) {
                autocodigo = "FV00000001";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return autocodigo;
    }

    public boolean ControlCliente(String clien, JLabel j) throws SQLException {
        boolean a = false;
        this.con.Conectar();
        this.con.SeleccionarTodo("clientes");
        if (clien != null) {
            while (this.con.getRs().next()) {
                String cliente = this.con.getRs().getString("cedula");
                if (clien.equals(cliente)) {
                    a = true;
                }
            }
        } else {
            j.setForeground(Color.red);
            j.setText("NO INGRESO RUC");
        }
        return a;
    }

    public void ControlLimites() {
        ((AbstractDocument) this.txtCantidad.getDocument()).setDocumentFilter(new ControlLimites(6));
        ((AbstractDocument) this.txtPrecio.getDocument()).setDocumentFilter(new ControlLimites(9));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnComprar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JComboBox<String> cboxProductos;
    private javax.swing.JPanel fondoBtnGuardar;
    private javax.swing.JLabel fondoFacturas;
    private javax.swing.JPanel fondobtnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCambiante;
    private javax.swing.JTable tblProductosventa;
    private javax.swing.JLabel tituloCantidad;
    private javax.swing.JLabel tituloPrecio;
    private javax.swing.JLabel tituloStock;
    private javax.swing.JLabel tituloTotal;
    private javax.swing.JLabel titulocedula;
    private javax.swing.JLabel titulofactura;
    private javax.swing.JLabel titulofecha;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtStock;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
