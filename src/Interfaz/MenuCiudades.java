/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import Controles.ControlCiudades;
import Controles.ControlLimites;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author HP
 */
public class MenuCiudades extends javax.swing.JPanel {

    private GuardarDatosTablas gdt = new GuardarDatosTablas();
    private ControlCiudades cc = new ControlCiudades();
    private Conexion con = new Conexion();

    public MenuCiudades() throws SQLException {
        initComponents();
        this.fondoAcciones.setVisible(false);
        this.gdt.GuardarCiudades();
        this.tblCiudades.setModel(this.gdt.MostrarDatosCiudades());
        this.ControlLimites();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCiudades = new javax.swing.JTable();
        fondoBtnAñadir = new javax.swing.JPanel();
        BtnAñadir = new javax.swing.JLabel();
        fondoBtnModificar = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JLabel();
        fondoBtnEliminar = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JLabel();
        fondoAcciones = new javax.swing.JPanel();
        tituloNuevoNombre = new javax.swing.JLabel();
        tituloNuevoCodigoCiudad = new javax.swing.JLabel();
        tituloNuevoCodigoProvincia = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoCodigoCiudad = new javax.swing.JTextField();
        txtNuevoCodigoProvincia = new javax.swing.JTextField();
        fondoBtnAccion = new javax.swing.JPanel();
        BtnAccion = new javax.swing.JLabel();
        textoCambiante = new javax.swing.JLabel();
        lblFondoCiudades = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblCiudades.setBackground(new java.awt.Color(255, 255, 255));
        tblCiudades.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCiudades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblCiudades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 220));

        fondoBtnAñadir.setBackground(new java.awt.Color(255, 255, 255));

        BtnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        BtnAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAñadir.setText("AÑADIR NUEVA CIUDAD");
        BtnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAñadirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnAñadirLayout = new javax.swing.GroupLayout(fondoBtnAñadir);
        fondoBtnAñadir.setLayout(fondoBtnAñadirLayout);
        fondoBtnAñadirLayout.setHorizontalGroup(
            fondoBtnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        fondoBtnAñadirLayout.setVerticalGroup(
            fondoBtnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, 40));

        fondoBtnModificar.setBackground(new java.awt.Color(255, 255, 255));

        BtnModificar.setBackground(new java.awt.Color(255, 255, 255));
        BtnModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnModificar.setText("MODIFICAR CIUDAD");
        BtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnModificarLayout = new javax.swing.GroupLayout(fondoBtnModificar);
        fondoBtnModificar.setLayout(fondoBtnModificarLayout);
        fondoBtnModificarLayout.setHorizontalGroup(
            fondoBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        fondoBtnModificarLayout.setVerticalGroup(
            fondoBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        fondoBtnEliminar.setBackground(new java.awt.Color(255, 255, 255));

        BtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setText("ELIMINAR CIUDAD");
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnEliminarLayout = new javax.swing.GroupLayout(fondoBtnEliminar);
        fondoBtnEliminar.setLayout(fondoBtnEliminarLayout);
        fondoBtnEliminarLayout.setHorizontalGroup(
            fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        fondoBtnEliminarLayout.setVerticalGroup(
            fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        fondoAcciones.setBackground(new java.awt.Color(255, 255, 255));

        tituloNuevoNombre.setForeground(new java.awt.Color(0, 0, 0));
        tituloNuevoNombre.setText("Ingresa Nuevo Nombre:");

        tituloNuevoCodigoCiudad.setForeground(new java.awt.Color(0, 0, 0));
        tituloNuevoCodigoCiudad.setText("Ingresa Nuevo Codigo:");

        tituloNuevoCodigoProvincia.setForeground(new java.awt.Color(0, 0, 0));
        tituloNuevoCodigoProvincia.setText("Ingresa Codigo Provincia:");

        txtNuevoNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoNombreActionPerformed(evt);
            }
        });

        txtNuevoCodigoCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoCodigoCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNuevoCodigoProvincia.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoCodigoProvincia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fondoBtnAccion.setBackground(new java.awt.Color(255, 255, 255));
        fondoBtnAccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAccion.setBackground(new java.awt.Color(255, 255, 255));
        BtnAccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnAccion.setForeground(new java.awt.Color(0, 0, 0));
        BtnAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnAccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAccionMouseExited(evt);
            }
        });
        fondoBtnAccion.add(BtnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        javax.swing.GroupLayout fondoAccionesLayout = new javax.swing.GroupLayout(fondoAcciones);
        fondoAcciones.setLayout(fondoAccionesLayout);
        fondoAccionesLayout.setHorizontalGroup(
            fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fondoBtnAccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondoAccionesLayout.createSequentialGroup()
                        .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloNuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloNuevoCodigoCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloNuevoCodigoProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoAccionesLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoAccionesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNuevoCodigoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNuevoCodigoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        fondoAccionesLayout.setVerticalGroup(
            fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNuevoCodigoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevoCodigoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNuevoCodigoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevoCodigoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(fondoBtnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(fondoAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 390, 150));

        textoCambiante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoCambiante.setForeground(new java.awt.Color(255, 51, 51));
        textoCambiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(textoCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 390, 30));

        lblFondoCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCiudades1.jpg"))); // NOI18N
        jPanel1.add(lblFondoCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

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

    private void txtNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoNombreActionPerformed

    private void BtnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAñadirMouseClicked
        this.fondoAcciones.setVisible(true);
        this.textoCambiante.setText("");
        this.tituloNuevoCodigoCiudad.setVisible(true);
        this.txtNuevoCodigoCiudad.setVisible(true);
        this.txtNuevoCodigoCiudad.setText("");
        this.txtNuevoCodigoProvincia.setVisible(true);
        this.txtNuevoCodigoProvincia.setText("");
        this.txtNuevoNombre.setVisible(true);
        this.txtNuevoNombre.setText("");
        this.tituloNuevoCodigoProvincia.setVisible(true);
        this.tituloNuevoNombre.setVisible(true);
        this.BtnAccion.setText("AÑADIR");
        this.BtnAccion.setVisible(true);
    }//GEN-LAST:event_BtnAñadirMouseClicked

    private void BtnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAñadirMouseEntered
        this.fondoBtnAñadir.setBackground(Color.blue);
        this.BtnAñadir.setForeground(Color.white);
    }//GEN-LAST:event_BtnAñadirMouseEntered

    private void BtnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAñadirMouseExited
        this.fondoBtnAñadir.setBackground(Color.white);
        this.BtnAñadir.setForeground(Color.black);
    }//GEN-LAST:event_BtnAñadirMouseExited

    private void BtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseEntered
        this.fondoBtnModificar.setBackground(Color.blue);
        this.BtnModificar.setForeground(Color.white);
    }//GEN-LAST:event_BtnModificarMouseEntered

    private void BtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseExited
        this.fondoBtnModificar.setBackground(Color.white);
        this.BtnModificar.setForeground(Color.black);
    }//GEN-LAST:event_BtnModificarMouseExited

    private void BtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseEntered
        this.fondoBtnEliminar.setBackground(Color.blue);
        this.BtnEliminar.setForeground(Color.white);
    }//GEN-LAST:event_BtnEliminarMouseEntered

    private void BtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseExited
        this.fondoBtnEliminar.setBackground(Color.white);
        this.BtnEliminar.setForeground(Color.black);
    }//GEN-LAST:event_BtnEliminarMouseExited

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked
        this.fondoAcciones.setVisible(true);
        this.textoCambiante.setText("");
        this.tituloNuevoNombre.setVisible(true);
        this.txtNuevoNombre.setVisible(true);
        this.txtNuevoNombre.setText("");
        this.tituloNuevoCodigoCiudad.setVisible(false);
        this.txtNuevoCodigoCiudad.setVisible(false);
        this.txtNuevoCodigoCiudad.setText("");
        this.txtNuevoCodigoProvincia.setVisible(true);
        this.txtNuevoCodigoProvincia.setText("");
        this.tituloNuevoCodigoProvincia.setVisible(true);
        this.BtnAccion.setText("MODIFICAR");
        this.BtnAccion.setVisible(true);
    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnAccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseEntered
        this.fondoBtnAccion.setBackground(Color.blue);
        this.BtnAccion.setForeground(Color.white);
    }//GEN-LAST:event_BtnAccionMouseEntered

    private void BtnAccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseExited
        this.fondoBtnAccion.setBackground(Color.white);
        this.BtnAccion.setForeground(Color.black);
    }//GEN-LAST:event_BtnAccionMouseExited

    private void BtnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (this.BtnAccion.getText().equals("AÑADIR")) {
                try {
                    cc.AgregarCiudad(this.txtNuevoCodigoCiudad.getText(), this.txtNuevoNombre.getText(), this.txtNuevoCodigoProvincia.getText(), this.textoCambiante);
                    this.gdt.GuardarCiudades();
                    this.tblCiudades.setModel(gdt.MostrarDatosCiudades());
                    this.txtNuevoCodigoCiudad.setText("");
                    this.txtNuevoCodigoProvincia.setText("");
                    this.txtNuevoNombre.setText("");
                    this.cc.getCon().Desconectar();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (this.BtnAccion.getText().equals("MODIFICAR")) {
                int filasseleccionadas = this.tblCiudades.getSelectedRow();
                if (filasseleccionadas != -1) {
                    String codigo = (String) this.tblCiudades.getValueAt(filasseleccionadas, 0);
                    try {
                        this.cc.ModificarCiudad(this.txtNuevoNombre.getText(), this.txtNuevoCodigoProvincia.getText(), codigo, this.textoCambiante);
                        this.gdt.GuardarCiudades();
                        this.tblCiudades.setModel(gdt.MostrarDatosCiudades());
                        this.txtNuevoNombre.setText("");
                        this.txtNuevoCodigoProvincia.setText("");
                        this.cc.getCon().Desconectar();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    this.textoCambiante.setForeground(new Color(255, 51, 51));
                    this.textoCambiante.setText("Selecciona una Ciudad");
                }
            }
        }
    }//GEN-LAST:event_BtnAccionMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        this.fondoAcciones.setVisible(false);
        this.textoCambiante.setText("");
        this.tituloNuevoNombre.setVisible(false);
        this.txtNuevoNombre.setVisible(false);
        this.txtNuevoNombre.setText("");
        this.tituloNuevoCodigoCiudad.setVisible(false);
        this.txtNuevoCodigoCiudad.setVisible(false);
        this.txtNuevoCodigoCiudad.setText("");
        this.txtNuevoCodigoProvincia.setVisible(false);
        this.txtNuevoCodigoProvincia.setText("");
        this.tituloNuevoCodigoProvincia.setVisible(false);
        this.BtnAccion.setText("ELIMINAR");
        this.BtnAccion.setVisible(false);
        int filasseleccionadas = this.tblCiudades.getSelectedRow();
        if (filasseleccionadas != -1) {
            String codigo = (String) this.tblCiudades.getValueAt(filasseleccionadas, 0);
            try {
                if (this.con.BuscarConexion()) {
                    JOptionPane.showMessageDialog(null, "No hay conexion con la base");
                } else {
                    this.cc.Eliminar(codigo, this.textoCambiante);
                    this.gdt.GuardarCiudades();
                    this.tblCiudades.setModel(gdt.MostrarDatosCiudades());
                    this.cc.getCon().Desconectar();
                }
                this.txtNuevoNombre.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.textoCambiante.setForeground(new Color(255, 51, 51));
            this.textoCambiante.setText("Seleccione una ciudad");
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked
    public void ControlLimites() {
        ((AbstractDocument) this.txtNuevoCodigoCiudad.getDocument()).setDocumentFilter(new ControlLimites(5));
        ((AbstractDocument) this.txtNuevoCodigoProvincia.getDocument()).setDocumentFilter(new ControlLimites(5));
        ((AbstractDocument) this.txtNuevoNombre.getDocument()).setDocumentFilter(new ControlLimites(50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAccion;
    private javax.swing.JLabel BtnAñadir;
    private javax.swing.JLabel BtnEliminar;
    private javax.swing.JLabel BtnModificar;
    private javax.swing.JPanel fondoAcciones;
    private javax.swing.JPanel fondoBtnAccion;
    private javax.swing.JPanel fondoBtnAñadir;
    private javax.swing.JPanel fondoBtnEliminar;
    private javax.swing.JPanel fondoBtnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondoCiudades;
    private javax.swing.JTable tblCiudades;
    private javax.swing.JLabel textoCambiante;
    private javax.swing.JLabel tituloNuevoCodigoCiudad;
    private javax.swing.JLabel tituloNuevoCodigoProvincia;
    private javax.swing.JLabel tituloNuevoNombre;
    private javax.swing.JTextField txtNuevoCodigoCiudad;
    private javax.swing.JTextField txtNuevoCodigoProvincia;
    private javax.swing.JTextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables
}
