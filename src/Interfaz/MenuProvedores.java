/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import Controles.ControlLimites;
import Controles.ControlProveedor;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

public class MenuProvedores extends javax.swing.JPanel {

    private GuardarDatosTablas gdt = new GuardarDatosTablas();
    private ControlProveedor cp = new ControlProveedor();
    private Conexion con = new Conexion();

    public MenuProvedores() throws SQLException {
        initComponents();
        this.fondoOpciones.setVisible(false);
        this.gdt.GuardarProveedores();
        this.tblProovedores.setModel(this.gdt.MostrarDatosProveedor());
        this.ControlLimites();
        this.cboxProvincia.setModel(cp.GuardarProv());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProovedores = new javax.swing.JTable();
        fondoAñadir = new javax.swing.JPanel();
        BtnAñadir = new javax.swing.JLabel();
        fondoModificar = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JLabel();
        fondoEliminar = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JLabel();
        fondoOpciones = new javax.swing.JPanel();
        tituloRUC = new javax.swing.JLabel();
        txtNuevoRuc = new javax.swing.JTextField();
        tituloNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        tituloTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        tituloDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        tituloProvincia = new javax.swing.JLabel();
        fondoBtnAccion = new javax.swing.JPanel();
        BtnAccion = new javax.swing.JLabel();
        cboxProvincia = new javax.swing.JComboBox<>();
        tituloCdgCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        textoCambiante = new javax.swing.JLabel();
        fondoProveedores = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblProovedores.setBackground(new java.awt.Color(255, 255, 255));
        tblProovedores.setForeground(new java.awt.Color(0, 0, 0));
        tblProovedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tblProovedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblProovedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 240));

        fondoAñadir.setBackground(new java.awt.Color(255, 255, 255));

        BtnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        BtnAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAñadir.setText("AÑADIR PROVEEDOR");
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

        javax.swing.GroupLayout fondoAñadirLayout = new javax.swing.GroupLayout(fondoAñadir);
        fondoAñadir.setLayout(fondoAñadirLayout);
        fondoAñadirLayout.setHorizontalGroup(
            fondoAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        fondoAñadirLayout.setVerticalGroup(
            fondoAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(fondoAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 50));

        fondoModificar.setBackground(new java.awt.Color(255, 255, 255));

        BtnModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnModificar.setText("MODIFICAR PROVEEDOR");
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

        javax.swing.GroupLayout fondoModificarLayout = new javax.swing.GroupLayout(fondoModificar);
        fondoModificar.setLayout(fondoModificarLayout);
        fondoModificarLayout.setHorizontalGroup(
            fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        fondoModificarLayout.setVerticalGroup(
            fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(fondoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 50));

        fondoEliminar.setBackground(new java.awt.Color(255, 255, 255));

        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setText("ELIMINAR PROVEEDOR");
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

        javax.swing.GroupLayout fondoEliminarLayout = new javax.swing.GroupLayout(fondoEliminar);
        fondoEliminar.setLayout(fondoEliminarLayout);
        fondoEliminarLayout.setHorizontalGroup(
            fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        fondoEliminarLayout.setVerticalGroup(
            fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(fondoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 50));

        fondoOpciones.setBackground(new java.awt.Color(255, 255, 255));

        tituloRUC.setForeground(new java.awt.Color(0, 0, 0));
        tituloRUC.setText("Ingrese RUC:");

        txtNuevoRuc.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoRuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloNombre.setForeground(new java.awt.Color(0, 0, 0));
        tituloNombre.setText("Ingrese nombre:");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloTelefono.setForeground(new java.awt.Color(0, 0, 0));
        tituloTelefono.setText("Ingrese Teléfono:");

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloDireccion.setForeground(new java.awt.Color(0, 0, 0));
        tituloDireccion.setText("Ingrese dirección:");

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloProvincia.setForeground(new java.awt.Color(0, 0, 0));
        tituloProvincia.setText("Seleccione Provincia:");

        fondoBtnAccion.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout fondoBtnAccionLayout = new javax.swing.GroupLayout(fondoBtnAccion);
        fondoBtnAccion.setLayout(fondoBtnAccionLayout);
        fondoBtnAccionLayout.setHorizontalGroup(
            fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
            .addGroup(fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BtnAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );
        fondoBtnAccionLayout.setVerticalGroup(
            fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
            .addGroup(fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BtnAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
        );

        cboxProvincia.setBackground(new java.awt.Color(255, 255, 255));
        cboxProvincia.setForeground(new java.awt.Color(0, 0, 0));
        cboxProvincia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tituloCdgCiudad.setForeground(new java.awt.Color(0, 0, 0));
        tituloCdgCiudad.setText("Cdg. Ciudad:");

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tituloDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloRUC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloProvincia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                                .addGap(0, 26, Short.MAX_VALUE)
                                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNuevoRuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                                .addComponent(cboxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloCdgCiudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCiudad))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOpcionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fondoBtnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fondoOpcionesLayout.setVerticalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloRUC)
                    .addComponent(txtNuevoRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloProvincia)
                    .addComponent(cboxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloCdgCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fondoBtnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jPanel1.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 410, 160));

        textoCambiante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoCambiante.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(textoCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 410, 20));

        fondoProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoProveedor.jpg"))); // NOI18N
        jPanel1.add(fondoProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

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

    private void BtnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAñadirMouseEntered
        this.fondoAñadir.setBackground(Color.blue);
        this.BtnAñadir.setForeground(Color.white);
    }//GEN-LAST:event_BtnAñadirMouseEntered

    private void BtnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAñadirMouseExited
        this.fondoAñadir.setBackground(Color.white);
        this.BtnAñadir.setForeground(Color.black);
    }//GEN-LAST:event_BtnAñadirMouseExited

    private void BtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseEntered
        this.fondoModificar.setBackground(Color.blue);
        this.BtnModificar.setForeground(Color.white);
    }//GEN-LAST:event_BtnModificarMouseEntered

    private void BtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseExited
        this.fondoModificar.setBackground(Color.white);
        this.BtnModificar.setForeground(Color.black);
    }//GEN-LAST:event_BtnModificarMouseExited

    private void BtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseEntered
        this.fondoEliminar.setBackground(Color.blue);
        this.BtnEliminar.setForeground(Color.white);
    }//GEN-LAST:event_BtnEliminarMouseEntered

    private void BtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseExited
        this.fondoEliminar.setBackground(Color.white);
        this.BtnEliminar.setForeground(Color.black);
    }//GEN-LAST:event_BtnEliminarMouseExited

    private void BtnAccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseEntered
        this.fondoBtnAccion.setBackground(Color.blue);
        this.BtnAccion.setForeground(Color.white);
    }//GEN-LAST:event_BtnAccionMouseEntered

    private void BtnAccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseExited
        this.fondoBtnAccion.setBackground(Color.white);
        this.BtnAccion.setForeground(Color.black);
    }//GEN-LAST:event_BtnAccionMouseExited

    private void BtnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAñadirMouseClicked
        this.fondoOpciones.setVisible(true);
        this.tituloRUC.setVisible(true);
        this.txtNuevoRuc.setVisible(true);
        this.txtNuevoRuc.setText("");
        this.tituloNombre.setVisible(true);
        this.txtNombre.setVisible(true);
        this.txtNombre.setText("");
        this.tituloDireccion.setVisible(true);
        this.txtDireccion.setVisible(true);
        this.txtDireccion.setText("");
        this.tituloTelefono.setVisible(true);
        this.txtTelefono.setVisible(true);
        this.txtTelefono.setText("");
        this.tituloProvincia.setVisible(true);
        this.txtCiudad.setVisible(true);
        this.txtCiudad.setText("");
        this.tituloCdgCiudad.setVisible(true);
        this.cboxProvincia.setVisible(true);
        this.BtnAccion.setVisible(true);
        this.BtnAccion.setText("AÑADIR");
    }//GEN-LAST:event_BtnAñadirMouseClicked

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked
        this.fondoOpciones.setVisible(true);
        this.tituloRUC.setVisible(false);
        this.txtNuevoRuc.setVisible(false);
        this.txtNuevoRuc.setText("");
        this.tituloNombre.setVisible(true);
        this.txtNombre.setVisible(true);
        this.txtNombre.setText("");
        this.tituloDireccion.setVisible(true);
        this.txtDireccion.setVisible(true);
        this.txtDireccion.setText("");
        this.tituloTelefono.setVisible(true);
        this.txtTelefono.setVisible(true);
        this.txtTelefono.setText("");
        this.tituloProvincia.setVisible(true);
        this.txtCiudad.setVisible(true);
        this.txtCiudad.setText("");
        this.tituloCdgCiudad.setVisible(true);
        this.cboxProvincia.setVisible(true);
        this.BtnAccion.setVisible(true);
        this.BtnAccion.setText("MODIFICAR");
    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        this.fondoOpciones.setVisible(false);
        this.tituloRUC.setVisible(false);
        this.txtNuevoRuc.setVisible(false);
        this.txtNuevoRuc.setText("");
        this.tituloNombre.setVisible(false);
        this.txtNombre.setVisible(false);
        this.txtNombre.setText("");
        this.tituloDireccion.setVisible(false);
        this.txtDireccion.setVisible(false);
        this.txtDireccion.setText("");
        this.tituloTelefono.setVisible(false);
        this.txtTelefono.setVisible(false);
        this.txtTelefono.setText("");
        this.tituloProvincia.setVisible(false);
        this.txtCiudad.setVisible(false);
        this.txtCiudad.setText("");
        this.tituloCdgCiudad.setVisible(false);
        this.cboxProvincia.setVisible(false);
        this.BtnAccion.setVisible(false);
        int filasseleccionadas = this.tblProovedores.getSelectedRow();
        if (filasseleccionadas != -1) {
            String codigo = (String) this.tblProovedores.getValueAt(filasseleccionadas, 0);
            try {
                if (this.con.BuscarConexion()) {
                    JOptionPane.showMessageDialog(null, "No hay conexion con la base");
                } else {
                    this.cp.EliminarProveedor(codigo, this.textoCambiante);
                    this.gdt.GuardarProveedores();
                    this.tblProovedores.setModel(gdt.MostrarDatosProveedor());
                    this.cp.getCon().Desconectar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.textoCambiante.setForeground(new Color(255, 51, 51));
            this.textoCambiante.setText("Seleccione un Proveedor");
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (this.BtnAccion.getText().equals("AÑADIR")) {
                try {
                    cp.AgregarProveedor(this.txtNuevoRuc.getText(), this.txtNombre.getText(), this.txtDireccion.getText(), this.txtTelefono.getText(), this.txtCiudad.getText(), String.valueOf(this.cboxProvincia.getSelectedItem()), this.textoCambiante);
                    this.gdt.GuardarProveedores();
                    this.tblProovedores.setModel(gdt.MostrarDatosProveedor());
                    this.txtCiudad.setText("");
                    this.txtDireccion.setText("");
                    this.txtNombre.setText("");
                    this.txtNuevoRuc.setText("");
                    this.txtTelefono.setText("");
                    this.cp.getCon().Desconectar();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuProvedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (this.BtnAccion.getText().equals("MODIFICAR")) {
                int filasseleccionadas = this.tblProovedores.getSelectedRow();
                if (filasseleccionadas != -1) {
                    String ruc = (String) this.tblProovedores.getValueAt(filasseleccionadas, 0);
                    try {
                        this.cp.ModificarProveedor(this.txtNombre.getText(), this.txtDireccion.getText(), this.txtTelefono.getText(), this.txtCiudad.getText(), ruc, String.valueOf(this.cboxProvincia.getSelectedItem()), this.textoCambiante);
                        this.gdt.GuardarProveedores();
                        this.tblProovedores.setModel(gdt.MostrarDatosProveedor());
                        this.txtCiudad.setText("");
                        this.txtDireccion.setText("");
                        this.txtNombre.setText("");
                        this.txtTelefono.setText("");
                        this.cp.getCon().Desconectar();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    this.textoCambiante.setForeground(new Color(255, 51, 51));
                    this.textoCambiante.setText("Selecciona un Proveedor");
                }
            }
        }
    }//GEN-LAST:event_BtnAccionMouseClicked
    public void ControlLimites() {
        ((AbstractDocument) this.txtCiudad.getDocument()).setDocumentFilter(new ControlLimites(5));
        ((AbstractDocument) this.txtDireccion.getDocument()).setDocumentFilter(new ControlLimites(50));
        ((AbstractDocument) this.txtNombre.getDocument()).setDocumentFilter(new ControlLimites(50));
        ((AbstractDocument) this.txtNuevoRuc.getDocument()).setDocumentFilter(new ControlLimites(13));
        ((AbstractDocument) this.txtTelefono.getDocument()).setDocumentFilter(new ControlLimites(10));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAccion;
    private javax.swing.JLabel BtnAñadir;
    private javax.swing.JLabel BtnEliminar;
    private javax.swing.JLabel BtnModificar;
    private javax.swing.JComboBox<String> cboxProvincia;
    private javax.swing.JPanel fondoAñadir;
    private javax.swing.JPanel fondoBtnAccion;
    private javax.swing.JPanel fondoEliminar;
    private javax.swing.JPanel fondoModificar;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JLabel fondoProveedores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProovedores;
    private javax.swing.JLabel textoCambiante;
    private javax.swing.JLabel tituloCdgCiudad;
    private javax.swing.JLabel tituloDireccion;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloProvincia;
    private javax.swing.JLabel tituloRUC;
    private javax.swing.JLabel tituloTelefono;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNuevoRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
