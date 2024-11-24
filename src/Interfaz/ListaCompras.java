package Interfaz;

import CodigoQR.QRCodigos;
import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import Controles.ControlLimites;
import Controles.ControlListaCompras;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author HP
 */
public class ListaCompras extends javax.swing.JPanel {

    private GuardarDatosTablas gdt = new GuardarDatosTablas();
    private ControlListaCompras clc = new ControlListaCompras();
    private Conexion con = new Conexion();

    public ListaCompras() throws SQLException {
        initComponents();
        this.ControlLimites();
        this.gdt.GuardarDatosCompras();
        this.tblCompras.setModel(this.gdt.MostrarDatosCompras());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        fondoBtnEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        tituloCodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        tituloFecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        fondobtnBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        lblCambiante = new javax.swing.JLabel();
        fondoQR = new javax.swing.JPanel();
        CodigoQR = new javax.swing.JLabel();
        fondobtnQR = new javax.swing.JPanel();
        btnQR = new javax.swing.JLabel();
        fondoListaCompras = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblCompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 440, 340));

        fondoBtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        fondoBtnEliminar.setPreferredSize(new java.awt.Dimension(32, 32));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnEliminarLayout = new javax.swing.GroupLayout(fondoBtnEliminar);
        fondoBtnEliminar.setLayout(fondoBtnEliminarLayout);
        fondoBtnEliminarLayout.setHorizontalGroup(
            fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoBtnEliminarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondoBtnEliminarLayout.setVerticalGroup(
            fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoBtnEliminarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(fondoBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 60, 60));

        tituloCodigo.setForeground(new java.awt.Color(0, 0, 0));
        tituloCodigo.setText("BUSCAR POR CODIGO:");
        jPanel1.add(tituloCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 140, -1));

        txtcodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtcodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 140, -1));

        tituloFecha.setForeground(new java.awt.Color(0, 0, 0));
        tituloFecha.setText("BUSCAR POR FECHA:");
        jPanel1.add(tituloFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 140, -1));

        txtfecha.setBackground(new java.awt.Color(255, 255, 255));
        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 140, -1));

        fondobtnBuscar.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondobtnBuscarLayout = new javax.swing.GroupLayout(fondobtnBuscar);
        fondobtnBuscar.setLayout(fondobtnBuscarLayout);
        fondobtnBuscarLayout.setHorizontalGroup(
            fondobtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(fondobtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondobtnBuscarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondobtnBuscarLayout.setVerticalGroup(
            fondobtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(fondobtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondobtnBuscarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(fondobtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 140, 40));

        lblCambiante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 440, 30));

        javax.swing.GroupLayout fondoQRLayout = new javax.swing.GroupLayout(fondoQR);
        fondoQR.setLayout(fondoQRLayout);
        fondoQRLayout.setHorizontalGroup(
            fondoQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CodigoQR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        fondoQRLayout.setVerticalGroup(
            fondoQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CodigoQR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jPanel1.add(fondoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 130, 130));

        fondobtnQR.setBackground(new java.awt.Color(255, 255, 255));

        btnQR.setForeground(new java.awt.Color(0, 0, 0));
        btnQR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQR.setText("GENERAR QR");
        btnQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondobtnQRLayout = new javax.swing.GroupLayout(fondobtnQR);
        fondobtnQR.setLayout(fondobtnQRLayout);
        fondobtnQRLayout.setHorizontalGroup(
            fondobtnQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondobtnQRLayout.setVerticalGroup(
            fondobtnQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnQR, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondobtnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 80, 40));

        fondoListaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoListaCompras.png"))); // NOI18N
        jPanel1.add(fondoListaCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

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

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        this.fondoBtnEliminar.setBackground(Color.blue);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        this.fondoBtnEliminar.setBackground(Color.white);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        this.fondobtnBuscar.setBackground(Color.blue);
        this.btnBuscar.setForeground(Color.white);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        this.fondobtnBuscar.setBackground(Color.white);
        this.btnBuscar.setForeground(Color.black);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (this.txtcodigo.getText().isEmpty()) {
                if (this.txtfecha.getText().isEmpty()) {
                    this.lblCambiante.setForeground(Color.red);
                    this.lblCambiante.setText("LLENE UN CAMPO");
                } else {
                    if (this.clc.ControlFecha(this.txtfecha.getText(), this.lblCambiante)) {
                        try {
                            this.clc.GuardarCompraFecha(this.txtfecha.getText());
                            this.tblCompras.setModel(this.clc.MostrarDatosCompras());
                            this.lblCambiante.setText("");
                            this.txtcodigo.setText("");
                            this.txtfecha.setText("");
                            this.con.Desconectar();
                        } catch (SQLException ex) {
                            Logger.getLogger(ListaCompras.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } else {
                if (this.txtfecha.getText().isEmpty()) {
                    if (this.clc.ControlCodigo(this.txtcodigo.getText(), this.lblCambiante)) {
                        try {
                            this.clc.GuardarCompraCodigo(this.txtcodigo.getText());
                            this.tblCompras.setModel(this.clc.MostrarDatosCompras());
                            this.lblCambiante.setText("");
                            this.txtcodigo.setText("");
                            this.txtfecha.setText("");
                            this.con.Desconectar();
                        } catch (SQLException ex) {
                            Logger.getLogger(ListaCompras.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    if (this.clc.ControlCodigo(this.txtcodigo.getText(), this.lblCambiante) && this.clc.ControlFecha(this.txtfecha.getText(), this.lblCambiante)) {
                        try {
                            this.clc.GuardarCompraCodigoFecha(this.txtcodigo.getText(), this.txtfecha.getText());
                            this.tblCompras.setModel(this.clc.MostrarDatosCompras());
                            this.lblCambiante.setText("");
                            this.txtcodigo.setText("");
                            this.txtfecha.setText("");
                            this.con.Desconectar();
                        } catch (SQLException ex) {
                            Logger.getLogger(ListaCompras.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int filasseleccionadas = this.tblCompras.getSelectedRow();
        if (filasseleccionadas != -1) {
            String codigo = (String) this.tblCompras.getValueAt(filasseleccionadas, 0);
            String fecha = String.valueOf(this.tblCompras.getValueAt(filasseleccionadas, 1));
            try {
                if (this.con.BuscarConexion()) {
                    JOptionPane.showMessageDialog(null, "No hay conexion con la base");
                } else {
                    this.clc.Eliminar(codigo, String.valueOf(LocalDate.now()), this.lblCambiante);
                    this.gdt.GuardarDatosCompras();
                    this.tblCompras.setModel(gdt.MostrarDatosCompras());
                    this.txtfecha.setText("");
                    this.txtcodigo.setText("");
                    this.con.Desconectar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.lblCambiante.setForeground(Color.red);
            this.lblCambiante.setText("Seleccione una Compra");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnQRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQRMouseEntered
        this.fondobtnQR.setBackground(Color.blue);
        this.btnQR.setForeground(Color.white);
    }//GEN-LAST:event_btnQRMouseEntered

    private void btnQRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQRMouseExited
        this.fondobtnQR.setBackground(Color.white);
        this.btnQR.setForeground(Color.black);
    }//GEN-LAST:event_btnQRMouseExited

    private void btnQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQRMouseClicked
        int filasseleccionadas = this.tblCompras.getSelectedRow();
        if (filasseleccionadas != -1) {
            String codigoCompra = (String) this.tblCompras.getValueAt(filasseleccionadas, 0);
            String fecha = String.valueOf(this.tblCompras.getValueAt(filasseleccionadas, 1));
            String Proveedor = (String) this.tblCompras.getValueAt(filasseleccionadas, 2);
            String total = String.valueOf(this.tblCompras.getValueAt(filasseleccionadas, 3));
            QRCodigos qr = new QRCodigos();
            this.CodigoQR.setIcon(qr.GenerarCodigoQRFactura(codigoCompra, fecha, Proveedor, total + "$"));
            this.lblCambiante.setText("");
        } else {
            this.lblCambiante.setForeground(Color.red);
            this.lblCambiante.setText("Seleccione una Compra");
        }
    }//GEN-LAST:event_btnQRMouseClicked
    public void ControlLimites() {
        ((AbstractDocument) this.txtcodigo.getDocument()).setDocumentFilter(new ControlLimites(10));
        ((AbstractDocument) this.txtfecha.getDocument()).setDocumentFilter(new ControlLimites(10));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoQR;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnQR;
    private javax.swing.JPanel fondoBtnEliminar;
    private javax.swing.JLabel fondoListaCompras;
    private javax.swing.JPanel fondoQR;
    private javax.swing.JPanel fondobtnBuscar;
    private javax.swing.JPanel fondobtnQR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCambiante;
    private javax.swing.JTable tblCompras;
    private javax.swing.JLabel tituloCodigo;
    private javax.swing.JLabel tituloFecha;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
