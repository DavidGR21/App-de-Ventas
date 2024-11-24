package Interfaz;

import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import Controles.ControlClientes;
import Controles.ControlLimites;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

public class MenuClientes extends javax.swing.JPanel {

    private GuardarDatosTablas gdt = new GuardarDatosTablas();
    private ControlClientes cc = new ControlClientes();
    private Conexion con = new Conexion();

    public MenuClientes() throws SQLException {
        initComponents();
        this.fondoOpciones.setVisible(false);
        this.gdt.GuardarClientes();
        this.tblClientes.setModel(this.gdt.MostrarDatosClientes());
        this.cboxProvincia.setModel(cc.GuardarProv());
        this.ControlLimites();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondoAñadir = new javax.swing.JPanel();
        BtnAñadir = new javax.swing.JLabel();
        fondoModificar = new javax.swing.JPanel();
        BtnModificar = new javax.swing.JLabel();
        fondoEliminar = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        fondoOpciones = new javax.swing.JPanel();
        fondoBtnAccion = new javax.swing.JPanel();
        BtnAccion = new javax.swing.JLabel();
        titulocedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        tituloNuevoNombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        tituloNuevaDireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        tituloNuevaCiudad = new javax.swing.JLabel();
        txtCciudad = new javax.swing.JTextField();
        tituloProvincia = new javax.swing.JLabel();
        cboxProvincia = new javax.swing.JComboBox<>();
        textoCambiante = new javax.swing.JLabel();
        fondoClientes = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoAñadir.setBackground(new java.awt.Color(255, 255, 255));

        BtnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        BtnAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAñadir.setText("AÑADIR CLIENTE");
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
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(fondoAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoAñadirLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondoAñadirLayout.setVerticalGroup(
            fondoAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(fondoAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoAñadirLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(fondoAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 40));

        fondoModificar.setBackground(new java.awt.Color(255, 255, 255));

        BtnModificar.setForeground(new java.awt.Color(0, 0, 0));
        BtnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnModificar.setText("MODIFICAR CLIENTE");
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
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoModificarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondoModificarLayout.setVerticalGroup(
            fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoModificarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(fondoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 40));

        fondoEliminar.setBackground(new java.awt.Color(255, 255, 255));

        BtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setText("ELIMINAR CLIENTE");
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
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoEliminarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondoEliminarLayout.setVerticalGroup(
            fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoEliminarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(fondoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 610, 230));

        fondoOpciones.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BtnAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
        );
        fondoBtnAccionLayout.setVerticalGroup(
            fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BtnAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        titulocedula.setForeground(new java.awt.Color(0, 0, 0));
        titulocedula.setText("Ingrese cedula:");

        txtcedula.setBackground(new java.awt.Color(255, 255, 255));
        txtcedula.setForeground(new java.awt.Color(0, 0, 0));
        txtcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloNuevoNombre.setForeground(new java.awt.Color(0, 0, 0));
        tituloNuevoNombre.setText("Ingrese nombre:");

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        tituloNuevaDireccion.setForeground(new java.awt.Color(0, 0, 0));
        tituloNuevaDireccion.setText("Ingrese direccion:");

        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        tituloNuevaCiudad.setForeground(new java.awt.Color(0, 0, 0));
        tituloNuevaCiudad.setText("Ingrese Cdg. Ciudad:");

        txtCciudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCciudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloProvincia.setForeground(new java.awt.Color(0, 0, 0));
        tituloProvincia.setText("Cdg. Provincia:");

        cboxProvincia.setBackground(new java.awt.Color(255, 255, 255));
        cboxProvincia.setForeground(new java.awt.Color(0, 0, 0));
        cboxProvincia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fondoBtnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tituloNuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(titulocedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloNuevaDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                                .addComponent(tituloProvincia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloNuevaCiudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        fondoOpcionesLayout.setVerticalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulocedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNuevoNombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNuevaDireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNuevaCiudad)
                    .addComponent(txtCciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloProvincia)
                    .addComponent(cboxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoBtnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 390, -1));

        textoCambiante.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textoCambiante.setForeground(new java.awt.Color(0, 204, 0));
        textoCambiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(textoCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 390, 20));

        fondoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoClientes.jpg"))); // NOI18N
        jPanel1.add(fondoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

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

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

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
        this.txtcedula.setVisible(true);
        this.txtcedula.setText("");
        this.titulocedula.setVisible(true);
        this.txtCciudad.setVisible(true);
        this.txtCciudad.setText("");
        this.tituloNuevaCiudad.setVisible(true);
        this.txtdireccion.setVisible(true);
        this.txtdireccion.setText("");
        this.tituloNuevaDireccion.setVisible(true);
        this.txtnombre.setVisible(true);
        this.txtnombre.setText("");
        this.tituloNuevoNombre.setVisible(true);
        this.BtnAccion.setText("AÑADIR");
        this.BtnAccion.setVisible(true);
    }//GEN-LAST:event_BtnAñadirMouseClicked

    private void BtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseClicked
        this.fondoOpciones.setVisible(true);
        this.txtcedula.setVisible(false);
        this.txtcedula.setText("");
        this.titulocedula.setVisible(false);
        this.txtCciudad.setVisible(true);
        this.txtCciudad.setText("");
        this.tituloNuevaCiudad.setVisible(true);
        this.txtdireccion.setVisible(true);
        this.txtdireccion.setText("");
        this.tituloNuevaDireccion.setVisible(true);
        this.txtnombre.setVisible(true);
        this.txtnombre.setText("");
        this.tituloNuevoNombre.setVisible(true);
        this.BtnAccion.setText("MODIFICAR");
        this.BtnAccion.setVisible(true);
    }//GEN-LAST:event_BtnModificarMouseClicked

    private void BtnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAccionMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (this.BtnAccion.getText().equals("AÑADIR")) {
                try {
                    cc.AgregarCliente(this.txtcedula.getText(), this.txtnombre.getText(), this.txtdireccion.getText(), this.txtCciudad.getText(), String.valueOf(this.cboxProvincia.getSelectedItem()), this.textoCambiante);
                    this.gdt.GuardarClientes();
                    this.tblClientes.setModel(this.gdt.MostrarDatosClientes());
                    this.txtcedula.setText("");
                    this.txtCciudad.setText("");
                    this.txtdireccion.setText("");
                    this.txtnombre.setText("");
                    this.cc.getCon().Desconectar();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (this.BtnAccion.getText().equals("MODIFICAR")) {
                int filasseleccionadas = this.tblClientes.getSelectedRow();
                if (filasseleccionadas != -1) {
                    String cedula = (String) this.tblClientes.getValueAt(filasseleccionadas, 0);
                    try {
                        this.cc.ModificarClientes(this.txtnombre.getText(), this.txtdireccion.getText(), this.txtCciudad.getText(), cedula, String.valueOf(this.cboxProvincia.getSelectedItem()), this.textoCambiante);
                        this.gdt.GuardarClientes();
                        this.tblClientes.setModel(gdt.MostrarDatosClientes());
                        this.txtnombre.setText("");
                        this.txtCciudad.setText("");
                        this.txtdireccion.setText("");
                        this.cc.getCon().Desconectar();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    this.textoCambiante.setForeground(Color.white);
                    this.textoCambiante.setText("SELECCIONE UN CLIENTE");
                }
            }
        }
    }//GEN-LAST:event_BtnAccionMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        this.fondoOpciones.setVisible(false);
        this.textoCambiante.setText("");
        this.tituloNuevoNombre.setVisible(false);
        this.txtnombre.setVisible(false);
        this.tituloNuevaCiudad.setVisible(false);
        this.txtCciudad.setVisible(false);
        this.titulocedula.setVisible(false);
        this.txtcedula.setVisible(false);
        this.txtdireccion.setVisible(false);
        this.tituloNuevaDireccion.setVisible(false);
        this.BtnAccion.setText("ELIMINAR");
        this.BtnAccion.setVisible(false);
        int filasseleccionadas = this.tblClientes.getSelectedRow();
        if (filasseleccionadas != -1) {
            String cedula = (String) this.tblClientes.getValueAt(filasseleccionadas, 0);
            try {
                if (this.con.BuscarConexion()) {
                    JOptionPane.showMessageDialog(null, "No hay conexion con la base");
                } else {
                    this.cc.EliminarClientes(cedula, this.textoCambiante);
                    this.gdt.GuardarClientes();
                    this.tblClientes.setModel(gdt.MostrarDatosClientes());
                    this.txtnombre.setText("");
                    this.txtdireccion.setText("");
                    this.txtCciudad.setText("");
                    this.txtcedula.setText("");
                    this.cc.getCon().Desconectar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.textoCambiante.setForeground(Color.white);
            this.textoCambiante.setText("SELECCIONE UN CLIENTE");
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed
    public void ControlLimites() {
        ((AbstractDocument) this.txtCciudad.getDocument()).setDocumentFilter(new ControlLimites(5));
        ((AbstractDocument) this.txtcedula.getDocument()).setDocumentFilter(new ControlLimites(10));
        ((AbstractDocument) this.txtdireccion.getDocument()).setDocumentFilter(new ControlLimites(50));
        ((AbstractDocument) this.txtnombre.getDocument()).setDocumentFilter(new ControlLimites(50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAccion;
    private javax.swing.JLabel BtnAñadir;
    private javax.swing.JLabel BtnEliminar;
    private javax.swing.JLabel BtnModificar;
    private javax.swing.JComboBox<String> cboxProvincia;
    private javax.swing.JPanel fondoAñadir;
    private javax.swing.JPanel fondoBtnAccion;
    private javax.swing.JLabel fondoClientes;
    private javax.swing.JPanel fondoEliminar;
    private javax.swing.JPanel fondoModificar;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JLabel textoCambiante;
    private javax.swing.JLabel tituloNuevaCiudad;
    private javax.swing.JLabel tituloNuevaDireccion;
    private javax.swing.JLabel tituloNuevoNombre;
    private javax.swing.JLabel tituloProvincia;
    private javax.swing.JLabel titulocedula;
    private javax.swing.JTextField txtCciudad;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
