package Interfaz;

import CodigoQR.QRCodigos;
import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import Controles.ControlLimites;
import Controles.ControlProductos;
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
public class MenuProductos extends javax.swing.JPanel {

    private GuardarDatosTablas gdt = new GuardarDatosTablas();
    private ControlProductos cp = new ControlProductos();
    private Conexion con = new Conexion();

    public MenuProductos() throws SQLException {
        initComponents();
        this.fondoOpciones.setVisible(false);
        this.gdt.GuardarProductos();
        this.tblProductos.setModel(this.gdt.MostrarDatosProductos());
        this.ControlLimites();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        fondoBtnAñadir = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JLabel();
        fondoBtnModificar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JLabel();
        fondoBtnEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        fondoOpciones = new javax.swing.JPanel();
        tituloNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        tituloCProducto = new javax.swing.JLabel();
        txtCProducto = new javax.swing.JTextField();
        tituloCProveedor = new javax.swing.JLabel();
        txtCProveedor = new javax.swing.JTextField();
        fondoBtnAccion = new javax.swing.JPanel();
        btnAccion = new javax.swing.JLabel();
        fondoQR = new javax.swing.JPanel();
        lblCodigoQR = new javax.swing.JLabel();
        textoCambiante = new javax.swing.JLabel();
        fondoGenerarQR = new javax.swing.JPanel();
        btnGenerarQR = new javax.swing.JLabel();
        fondoProductos = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tblProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblProductos.setForeground(new java.awt.Color(0, 0, 0));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 270));

        fondoBtnAñadir.setBackground(new java.awt.Color(255, 255, 255));
        fondoBtnAñadir.setForeground(new java.awt.Color(0, 0, 0));

        btnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAñadir.setText("AÑADIR PRODUCTO");
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnAñadirLayout = new javax.swing.GroupLayout(fondoBtnAñadir);
        fondoBtnAñadir.setLayout(fondoBtnAñadirLayout);
        fondoBtnAñadirLayout.setHorizontalGroup(
            fondoBtnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        fondoBtnAñadirLayout.setVerticalGroup(
            fondoBtnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 40));

        fondoBtnModificar.setBackground(new java.awt.Color(255, 255, 255));

        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.setText("MODIFICAR PRODUCTO");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnModificarLayout = new javax.swing.GroupLayout(fondoBtnModificar);
        fondoBtnModificar.setLayout(fondoBtnModificarLayout);
        fondoBtnModificarLayout.setHorizontalGroup(
            fondoBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        fondoBtnModificarLayout.setVerticalGroup(
            fondoBtnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 40));

        fondoBtnEliminar.setBackground(new java.awt.Color(255, 255, 255));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("ELIMINAR PRODUCTO");
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
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        fondoBtnEliminarLayout.setVerticalGroup(
            fondoBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, 40));

        fondoOpciones.setBackground(new java.awt.Color(102, 102, 102));

        tituloNombre.setForeground(new java.awt.Color(0, 0, 0));
        tituloNombre.setText("Ingrese nombre del producto:");

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloCProducto.setForeground(new java.awt.Color(0, 0, 0));
        tituloCProducto.setText("Ingrese codigo del producto:");

        txtCProducto.setBackground(new java.awt.Color(102, 102, 102));
        txtCProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtCProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tituloCProveedor.setForeground(new java.awt.Color(0, 0, 0));
        tituloCProveedor.setText("Ingrese codigo del proveedor:");

        txtCProveedor.setBackground(new java.awt.Color(102, 102, 102));
        txtCProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtCProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fondoBtnAccion.setBackground(new java.awt.Color(102, 102, 102));

        btnAccion.setForeground(new java.awt.Color(0, 0, 0));
        btnAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBtnAccionLayout = new javax.swing.GroupLayout(fondoBtnAccion);
        fondoBtnAccion.setLayout(fondoBtnAccionLayout);
        fondoBtnAccionLayout.setHorizontalGroup(
            fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        fondoBtnAccionLayout.setVerticalGroup(
            fondoBtnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAccion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tituloCProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloCProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtCProducto)
                            .addComponent(txtCProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
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
                    .addComponent(tituloNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCProducto)
                    .addComponent(txtCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCProveedor)
                    .addComponent(txtCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoBtnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 410, 120));

        fondoQR.setBackground(new java.awt.Color(102, 102, 102));

        lblCodigoQR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout fondoQRLayout = new javax.swing.GroupLayout(fondoQR);
        fondoQR.setLayout(fondoQRLayout);
        fondoQRLayout.setHorizontalGroup(
            fondoQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCodigoQR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        fondoQRLayout.setVerticalGroup(
            fondoQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCodigoQR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jPanel1.add(fondoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 130, 130));

        textoCambiante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel1.add(textoCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 410, 20));

        fondoGenerarQR.setBackground(new java.awt.Color(255, 255, 255));

        btnGenerarQR.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarQR.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarQR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerarQR.setText("GENERAR QR");
        btnGenerarQR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarQRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarQRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarQRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoGenerarQRLayout = new javax.swing.GroupLayout(fondoGenerarQR);
        fondoGenerarQR.setLayout(fondoGenerarQRLayout);
        fondoGenerarQRLayout.setHorizontalGroup(
            fondoGenerarQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGenerarQR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        fondoGenerarQRLayout.setVerticalGroup(
            fondoGenerarQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGenerarQR, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(fondoGenerarQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 130, 40));

        fondoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondosProductos.jpg"))); // NOI18N
        jPanel1.add(fondoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));

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

    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
        this.fondoBtnAñadir.setBackground(Color.blue);
        this.btnAñadir.setForeground(Color.white);
    }//GEN-LAST:event_btnAñadirMouseEntered

    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
        this.fondoBtnAñadir.setBackground(Color.white);
        this.btnAñadir.setForeground(Color.black);
    }//GEN-LAST:event_btnAñadirMouseExited

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        this.fondoBtnModificar.setBackground(Color.blue);
        this.btnModificar.setForeground(Color.white);
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        this.fondoBtnModificar.setBackground(Color.white);
        this.btnModificar.setForeground(Color.black);
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        this.fondoBtnEliminar.setBackground(Color.blue);
        this.btnEliminar.setForeground(Color.white);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        this.fondoBtnEliminar.setBackground(Color.white);
        this.btnEliminar.setForeground(Color.black);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnGenerarQRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarQRMouseEntered
        this.fondoGenerarQR.setBackground(Color.blue);
        this.btnGenerarQR.setForeground(Color.white);
    }//GEN-LAST:event_btnGenerarQRMouseEntered

    private void btnGenerarQRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarQRMouseExited
        this.fondoGenerarQR.setBackground(Color.white);
        this.btnGenerarQR.setForeground(Color.black);
    }//GEN-LAST:event_btnGenerarQRMouseExited

    private void btnAccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseEntered
        this.fondoBtnAccion.setBackground(Color.blue);
        this.btnAccion.setForeground(Color.white);
    }//GEN-LAST:event_btnAccionMouseEntered

    private void btnAccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseExited
        this.fondoBtnAccion.setBackground(new Color(102, 102, 102));
        this.btnAccion.setForeground(Color.black);
    }//GEN-LAST:event_btnAccionMouseExited

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        this.fondoOpciones.setVisible(true);
        this.tituloCProducto.setVisible(true);
        this.txtCProducto.setVisible(true);
        this.txtCProducto.setText("");
        this.tituloCProveedor.setVisible(true);
        this.txtCProveedor.setVisible(true);
        this.txtCProveedor.setText("");
        this.tituloNombre.setVisible(true);
        this.txtNombre.setVisible(true);
        this.txtNombre.setText("");
        this.btnAccion.setVisible(true);
        this.lblCodigoQR.setVisible(false);
        this.textoCambiante.setText("");
        this.btnAccion.setText("AÑADIR");
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        this.fondoOpciones.setVisible(true);
        this.tituloCProducto.setVisible(false);
        this.txtCProducto.setVisible(false);
        this.txtCProducto.setText("");
        this.tituloCProveedor.setVisible(true);
        this.txtCProveedor.setVisible(true);
        this.txtCProveedor.setText("");
        this.tituloNombre.setVisible(true);
        this.txtNombre.setVisible(true);
        this.txtNombre.setText("");
        this.btnAccion.setVisible(true);
        this.lblCodigoQR.setVisible(false);
        this.textoCambiante.setText("");
        this.btnAccion.setText("MODIFICAR");
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        this.fondoOpciones.setVisible(false);
        this.tituloCProducto.setVisible(false);
        this.txtCProducto.setVisible(false);
        this.txtCProducto.setText("");
        this.tituloCProveedor.setVisible(false);
        this.txtCProveedor.setVisible(false);
        this.txtCProveedor.setText("");
        this.tituloNombre.setVisible(false);
        this.txtNombre.setVisible(false);
        this.txtNombre.setText("");
        this.btnAccion.setVisible(false);
        this.lblCodigoQR.setVisible(false);
        this.textoCambiante.setText("");
        int filasseleccionadas = this.tblProductos.getSelectedRow();
        if (filasseleccionadas != -1) {
            String codigo = (String) this.tblProductos.getValueAt(filasseleccionadas, 0);
            try {
                if (this.con.BuscarConexion()) {
                    JOptionPane.showMessageDialog(null, "No hay conexion con la base");
                } else {
                    this.cp.EliminarProducto(codigo, this.textoCambiante);
                    this.gdt.GuardarProductos();
                    this.tblProductos.setModel(gdt.MostrarDatosProductos());
                    this.txtCProducto.setText("");
                    this.txtCProveedor.setText("");
                    this.txtNombre.setText("");
                    this.cp.getCon().Desconectar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.textoCambiante.setForeground(Color.red);
            this.textoCambiante.setText("SELECCIONE UN PRODUCTO");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (this.btnAccion.getText().equals("AÑADIR")) {
                try {
                    cp.AgregarProducto(this.txtCProducto.getText(), this.txtNombre.getText(), this.txtCProveedor.getText(), this.textoCambiante);
                    this.gdt.GuardarProductos();
                    this.tblProductos.setModel(this.gdt.MostrarDatosProductos());
                    this.txtCProducto.setText("");
                    this.txtCProveedor.setText("");
                    this.txtNombre.setText("");
                    this.cp.getCon().Desconectar();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (this.btnAccion.getText().equals("MODIFICAR")) {
                int filasseleccionadas = this.tblProductos.getSelectedRow();
                if (filasseleccionadas != -1) {
                    String codigo = (String) this.tblProductos.getValueAt(filasseleccionadas, 0);
                    try {
                        this.cp.ModificarProducto(this.txtNombre.getText(), this.txtCProveedor.getText(), codigo, this.textoCambiante);
                        this.gdt.GuardarProductos();
                        this.tblProductos.setModel(gdt.MostrarDatosProductos());
                        this.txtCProducto.setText("");
                        this.txtCProveedor.setText("");
                        this.txtNombre.setText("");
                        this.cp.getCon().Desconectar();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuCiudades.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    this.textoCambiante.setForeground(Color.red);
                    this.textoCambiante.setText("SELECCIONE UN PRODUCTO");
                }
            }
        }
    }//GEN-LAST:event_btnAccionMouseClicked

    private void btnGenerarQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarQRMouseClicked
        this.fondoOpciones.setVisible(false);
        this.textoCambiante.setText("");
        int filasseleccionadas = this.tblProductos.getSelectedRow();
        if (filasseleccionadas != -1) {
            String codigo = (String) this.tblProductos.getValueAt(filasseleccionadas, 0);
            String nombre = (String) this.tblProductos.getValueAt(filasseleccionadas, 1);
            String nProveedor = (String) this.tblProductos.getValueAt(filasseleccionadas, 2);
            QRCodigos qr = new QRCodigos();
            this.lblCodigoQR.setVisible(true);
            this.lblCodigoQR.setIcon(qr.GenerarCodigoQRProductos(codigo, nombre, nProveedor));
        } else {
            this.textoCambiante.setForeground(Color.red);
            this.textoCambiante.setText("SELECCIONE UN PODUCTO");
        }
    }//GEN-LAST:event_btnGenerarQRMouseClicked
    public void ControlLimites() {
        ((AbstractDocument) this.txtCProducto.getDocument()).setDocumentFilter(new ControlLimites(5));
        ((AbstractDocument) this.txtCProveedor.getDocument()).setDocumentFilter(new ControlLimites(13));
        ((AbstractDocument) this.txtNombre.getDocument()).setDocumentFilter(new ControlLimites(50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAccion;
    private javax.swing.JLabel btnAñadir;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGenerarQR;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JPanel fondoBtnAccion;
    private javax.swing.JPanel fondoBtnAñadir;
    private javax.swing.JPanel fondoBtnEliminar;
    private javax.swing.JPanel fondoBtnModificar;
    private javax.swing.JPanel fondoGenerarQR;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JLabel fondoProductos;
    private javax.swing.JPanel fondoQR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoQR;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel textoCambiante;
    private javax.swing.JLabel tituloCProducto;
    private javax.swing.JLabel tituloCProveedor;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JTextField txtCProducto;
    private javax.swing.JTextField txtCProveedor;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
