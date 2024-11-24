package Interfaz;

import ConexionMySQL.Conexion;
import Controles.ControlLimites;
import Controles.ControlUsuario;
import Objetos.Usuario;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author HP
 */
public class MenuGestionUsuario extends javax.swing.JPanel {

    private int pProductos = 0, pClientes = 0,
            pProveedor = 0, pFactura = 0, pCompra = 0, pKardex = 0,
            pProvincias = 0, pCiudades = 0, pListaVenta = 0, pListaCompra = 0, pGestorUsuario = 0;
    private Conexion con = new Conexion();

    public MenuGestionUsuario() {
        initComponents();
        this.lblMensajeCambiante.setForeground(new Color(0, 51, 51));
        this.ControlLimite();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloGestionUsuarios = new javax.swing.JLabel();
        FondoBlanco = new javax.swing.JPanel();
        NuevoUsuario = new javax.swing.JLabel();
        txtNuevoUsuario = new javax.swing.JTextField();
        sp1 = new javax.swing.JSeparator();
        NuevaContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        sp2 = new javax.swing.JSeparator();
        SeleccionePermisos = new javax.swing.JLabel();
        cboxPProductos = new javax.swing.JCheckBox();
        cboxPClientes = new javax.swing.JCheckBox();
        cboxPProveedor = new javax.swing.JCheckBox();
        cboxPFacturas = new javax.swing.JCheckBox();
        cboxPCompras = new javax.swing.JCheckBox();
        cboxPKardex = new javax.swing.JCheckBox();
        cboxPProvincias = new javax.swing.JCheckBox();
        cboxPCiudades = new javax.swing.JCheckBox();
        cboxPListaVentas = new javax.swing.JCheckBox();
        cboxPListaCompras = new javax.swing.JCheckBox();
        cboxPGestionUsuario = new javax.swing.JCheckBox();
        lblMensajeCambiante = new javax.swing.JLabel();
        FondoBtnCrearUsuario = new javax.swing.JPanel();
        BtnCrearUsuario = new javax.swing.JLabel();
        FondoMenuGUsuarios = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(650, 440));
        setPreferredSize(new java.awt.Dimension(650, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloGestionUsuarios.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TituloGestionUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        TituloGestionUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloGestionUsuarios.setText("Gestion Usuarios");
        add(TituloGestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        NuevoUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NuevoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        NuevoUsuario.setText("Ingrese Nuevo Usuario: ");

        txtNuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoUsuario.setText("Ingrese su nuevo Usuario");
        txtNuevoUsuario.setBorder(null);
        txtNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuevoUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNuevoUsuarioMousePressed(evt);
            }
        });
        txtNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoUsuarioActionPerformed(evt);
            }
        });

        NuevaContraseña.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NuevaContraseña.setForeground(new java.awt.Color(0, 0, 0));
        NuevaContraseña.setText("Ingrese Nueva Contraseña: ");

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setText("**********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        SeleccionePermisos.setForeground(new java.awt.Color(0, 0, 0));
        SeleccionePermisos.setText("Seleccione los permisos de este Usuario: ");

        cboxPProductos.setBackground(new java.awt.Color(255, 255, 255));
        cboxPProductos.setForeground(new java.awt.Color(153, 153, 153));
        cboxPProductos.setText("Permiso a los Productos");
        cboxPProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPProductosMouseClicked(evt);
            }
        });
        cboxPProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPProductosActionPerformed(evt);
            }
        });

        cboxPClientes.setBackground(new java.awt.Color(255, 255, 255));
        cboxPClientes.setForeground(new java.awt.Color(153, 153, 153));
        cboxPClientes.setText("Permiso a los Clientes");
        cboxPClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPClientesMouseClicked(evt);
            }
        });
        cboxPClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPClientesActionPerformed(evt);
            }
        });

        cboxPProveedor.setBackground(new java.awt.Color(255, 255, 255));
        cboxPProveedor.setForeground(new java.awt.Color(153, 153, 153));
        cboxPProveedor.setText("Permiso a los Proveedores");
        cboxPProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPProveedorMouseClicked(evt);
            }
        });
        cboxPProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPProveedorActionPerformed(evt);
            }
        });

        cboxPFacturas.setBackground(new java.awt.Color(255, 255, 255));
        cboxPFacturas.setForeground(new java.awt.Color(153, 153, 153));
        cboxPFacturas.setText("Permiso a las Facturas");
        cboxPFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPFacturasMouseClicked(evt);
            }
        });
        cboxPFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPFacturasActionPerformed(evt);
            }
        });

        cboxPCompras.setBackground(new java.awt.Color(255, 255, 255));
        cboxPCompras.setForeground(new java.awt.Color(153, 153, 153));
        cboxPCompras.setText("Permiso a las Compras");
        cboxPCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPComprasMouseClicked(evt);
            }
        });
        cboxPCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPComprasActionPerformed(evt);
            }
        });

        cboxPKardex.setBackground(new java.awt.Color(255, 255, 255));
        cboxPKardex.setForeground(new java.awt.Color(153, 153, 153));
        cboxPKardex.setText("Permiso al Kardex");
        cboxPKardex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPKardex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPKardexMouseClicked(evt);
            }
        });
        cboxPKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPKardexActionPerformed(evt);
            }
        });

        cboxPProvincias.setBackground(new java.awt.Color(255, 255, 255));
        cboxPProvincias.setForeground(new java.awt.Color(153, 153, 153));
        cboxPProvincias.setText("Permiso a las Provincias");
        cboxPProvincias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPProvincias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPProvinciasMouseClicked(evt);
            }
        });
        cboxPProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPProvinciasActionPerformed(evt);
            }
        });

        cboxPCiudades.setBackground(new java.awt.Color(255, 255, 255));
        cboxPCiudades.setForeground(new java.awt.Color(153, 153, 153));
        cboxPCiudades.setText("Permiso a las Ciudades");
        cboxPCiudades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPCiudadesMouseClicked(evt);
            }
        });
        cboxPCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPCiudadesActionPerformed(evt);
            }
        });

        cboxPListaVentas.setBackground(new java.awt.Color(255, 255, 255));
        cboxPListaVentas.setForeground(new java.awt.Color(153, 153, 153));
        cboxPListaVentas.setText("Permiso a la lista de venta");
        cboxPListaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPListaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPListaVentasMouseClicked(evt);
            }
        });
        cboxPListaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPListaVentasActionPerformed(evt);
            }
        });

        cboxPListaCompras.setBackground(new java.awt.Color(255, 255, 255));
        cboxPListaCompras.setForeground(new java.awt.Color(153, 153, 153));
        cboxPListaCompras.setText("Permiso a la lista de compra");
        cboxPListaCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPListaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPListaComprasMouseClicked(evt);
            }
        });
        cboxPListaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPListaComprasActionPerformed(evt);
            }
        });

        cboxPGestionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        cboxPGestionUsuario.setForeground(new java.awt.Color(153, 153, 153));
        cboxPGestionUsuario.setText("Permiso a la Gestion Usuarios");
        cboxPGestionUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxPGestionUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxPGestionUsuarioMouseClicked(evt);
            }
        });
        cboxPGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPGestionUsuarioActionPerformed(evt);
            }
        });

        lblMensajeCambiante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMensajeCambiante.setForeground(new java.awt.Color(0, 51, 51));
        lblMensajeCambiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        FondoBtnCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));

        BtnCrearUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnCrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        BtnCrearUsuario.setText("CREAR USUARIO");
        BtnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCrearUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCrearUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnCrearUsuarioLayout = new javax.swing.GroupLayout(FondoBtnCrearUsuario);
        FondoBtnCrearUsuario.setLayout(FondoBtnCrearUsuarioLayout);
        FondoBtnCrearUsuarioLayout.setHorizontalGroup(
            FondoBtnCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBtnCrearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCrearUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoBtnCrearUsuarioLayout.setVerticalGroup(
            FondoBtnCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnCrearUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NuevoUsuario)
                            .addComponent(NuevaContraseña))
                        .addGap(35, 35, 35)
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sp2)
                            .addComponent(sp1)
                            .addComponent(txtNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtContraseña)))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SeleccionePermisos))
                    .addComponent(cboxPFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                        .addComponent(lblMensajeCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FondoBtnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoBlancoLayout.createSequentialGroup()
                                .addComponent(cboxPProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cboxPCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboxPCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(FondoBlancoLayout.createSequentialGroup()
                                    .addComponent(cboxPProveedor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboxPProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FondoBlancoLayout.createSequentialGroup()
                                    .addComponent(cboxPClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(cboxPKardex, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)
                        .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoBlancoLayout.createSequentialGroup()
                                .addComponent(cboxPListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboxPGestionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxPListaCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoUsuario)
                    .addComponent(txtNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeleccionePermisos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxPProductos)
                    .addComponent(cboxPCompras)
                    .addComponent(cboxPListaVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxPClientes)
                    .addComponent(cboxPKardex)
                    .addComponent(cboxPListaCompras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxPProveedor)
                    .addComponent(cboxPProvincias)
                    .addComponent(cboxPGestionUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxPFacturas)
                    .addComponent(cboxPCiudades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(FondoBtnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBlancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMensajeCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 650, 280));

        FondoMenuGUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGestion_1.jpg"))); // NOI18N
        FondoMenuGUsuarios.setMaximumSize(new java.awt.Dimension(688, 440));
        FondoMenuGUsuarios.setMinimumSize(new java.awt.Dimension(688, 440));
        add(FondoMenuGUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoUsuarioMousePressed
        if (this.txtNuevoUsuario.getText().equals("Ingrese su nuevo Usuario")) {
            this.txtNuevoUsuario.setText("");
            this.txtNuevoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(this.txtContraseña.getPassword()).isEmpty()) {
            this.txtContraseña.setText("**********");
            this.txtContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNuevoUsuarioMousePressed

    private void txtNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoUsuarioActionPerformed

    }//GEN-LAST:event_txtNuevoUsuarioActionPerformed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if (String.valueOf(this.txtContraseña.getPassword()).equals("**********")) {
            this.txtContraseña.setText("");
            this.txtContraseña.setForeground(Color.black);
        }
        if (this.txtNuevoUsuario.getText().isEmpty()) {
            this.txtNuevoUsuario.setText("Ingrese su nuevo Usuario");
            this.txtNuevoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void cboxPProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPProductosMouseClicked
        this.cboxPProductos.setForeground(this.cboxPProductos.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPProductosMouseClicked

    private void cboxPProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPProductosActionPerformed

    private void cboxPClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPClientesMouseClicked
        this.cboxPClientes.setForeground(this.cboxPClientes.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPClientesMouseClicked

    private void cboxPClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPClientesActionPerformed

    private void cboxPProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPProveedorMouseClicked
        this.cboxPProveedor.setForeground(this.cboxPProveedor.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPProveedorMouseClicked

    private void cboxPProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPProveedorActionPerformed

    private void cboxPFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPFacturasMouseClicked
        this.cboxPFacturas.setForeground(this.cboxPFacturas.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPFacturasMouseClicked

    private void cboxPFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPFacturasActionPerformed

    private void cboxPComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPComprasMouseClicked
        this.cboxPCompras.setForeground(this.cboxPCompras.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPComprasMouseClicked

    private void cboxPComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPComprasActionPerformed

    private void cboxPKardexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPKardexMouseClicked
        this.cboxPKardex.setForeground(this.cboxPKardex.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPKardexMouseClicked

    private void cboxPKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPKardexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPKardexActionPerformed

    private void cboxPProvinciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPProvinciasMouseClicked
        this.cboxPProvincias.setForeground(this.cboxPProvincias.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPProvinciasMouseClicked

    private void cboxPProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPProvinciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPProvinciasActionPerformed

    private void cboxPCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPCiudadesMouseClicked
        this.cboxPCiudades.setForeground(this.cboxPCiudades.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPCiudadesMouseClicked

    private void cboxPCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPCiudadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPCiudadesActionPerformed

    private void cboxPListaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPListaVentasMouseClicked
        this.cboxPListaVentas.setForeground(this.cboxPListaVentas.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPListaVentasMouseClicked

    private void cboxPListaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPListaVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPListaVentasActionPerformed

    private void cboxPListaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPListaComprasMouseClicked
        this.cboxPListaCompras.setForeground(this.cboxPListaCompras.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPListaComprasMouseClicked

    private void cboxPListaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPListaComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPListaComprasActionPerformed

    private void cboxPGestionUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxPGestionUsuarioMouseClicked
        this.cboxPGestionUsuario.setForeground(this.cboxPGestionUsuario.isSelected() ? Color.black : Color.gray);
    }//GEN-LAST:event_cboxPGestionUsuarioMouseClicked

    private void cboxPGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPGestionUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPGestionUsuarioActionPerformed

    private void BtnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            if (!(this.txtNuevoUsuario.getText().equals("Ingrese su nuevo Usuario"))) {
                if (!(this.txtContraseña.getText().equals("**********"))) {
                    this.pProductos = (this.cboxPProductos.isSelected() ? 1 : 0);
                    this.pClientes = (this.cboxPClientes.isSelected() ? 1 : 0);
                    this.pProveedor = (this.cboxPProveedor.isSelected() ? 1 : 0);
                    this.pFactura = (this.cboxPFacturas.isSelected() ? 1 : 0);
                    this.pCompra = (this.cboxPCompras.isSelected() ? 1 : 0);
                    this.pKardex = (this.cboxPKardex.isSelected() ? 1 : 0);
                    this.pProvincias = (this.cboxPProvincias.isSelected() ? 1 : 0);
                    this.pCiudades = (this.cboxPCiudades.isSelected() ? 1 : 0);
                    this.pListaVenta = (this.cboxPListaVentas.isSelected() ? 1 : 0);
                    this.pListaCompra = (this.cboxPListaCompras.isSelected() ? 1 : 0);
                    this.pGestorUsuario = (this.cboxPGestionUsuario.isSelected() ? 1 : 0);
                    Usuario u = new Usuario(this.txtNuevoUsuario.getText(), this.txtContraseña.getText(),
                            this.pProductos, this.pClientes, this.pProveedor, this.pFactura, this.pCompra,
                            this.pKardex, this.pProvincias, this.pCiudades, this.pListaVenta, this.pListaCompra, this.pGestorUsuario);
                    ControlUsuario cu = new ControlUsuario();
                    this.txtNuevoUsuario.setText("Ingrese su nuevo Usuario");
                    this.txtNuevoUsuario.setForeground(Color.gray);
                    this.txtContraseña.setText("**********");
                    this.txtContraseña.setForeground(Color.gray);
                    this.cboxPProductos.setSelected(false);
                    this.cboxPProductos.setForeground(Color.gray);
                    this.cboxPClientes.setSelected(false);
                    this.cboxPClientes.setForeground(Color.gray);
                    this.cboxPProveedor.setSelected(false);
                    this.cboxPProveedor.setForeground(Color.gray);
                    this.cboxPCompras.setSelected(false);
                    this.cboxPCompras.setForeground(Color.gray);
                    this.cboxPFacturas.setSelected(false);
                    this.cboxPFacturas.setForeground(Color.gray);
                    this.cboxPKardex.setSelected(false);
                    this.cboxPKardex.setForeground(Color.gray);
                    this.cboxPProvincias.setSelected(false);
                    this.cboxPProvincias.setForeground(Color.gray);
                    this.cboxPCiudades.setSelected(false);
                    this.cboxPCiudades.setForeground(Color.gray);
                    this.cboxPListaCompras.setSelected(false);
                    this.cboxPListaCompras.setForeground(Color.gray);
                    this.cboxPListaVentas.setSelected(false);
                    this.cboxPListaVentas.setForeground(Color.gray);
                    this.cboxPGestionUsuario.setSelected(false);
                    this.cboxPGestionUsuario.setForeground(Color.gray);
                    try {
                        cu.AgregarUsuario(u, this.lblMensajeCambiante);
                        this.txtContraseña.setText("**********");
                        this.txtNuevoUsuario.setText("Ingrese su nuevo Usuario");
                        this.con.Desconectar();
                    } catch (SQLException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);

                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NoSuchPaddingException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvalidKeyException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalBlockSizeException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (BadPaddingException ex) {
                        Logger.getLogger(MenuGestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    this.lblMensajeCambiante.setForeground(Color.red);
                    this.lblMensajeCambiante.setText("LLENAR EL CAMPO CONTRASEÑA");
                }
            } else {
                this.lblMensajeCambiante.setForeground(Color.red);
                this.lblMensajeCambiante.setText("LLENAR EL CAMPO USUARIO");
            }
        }
    }//GEN-LAST:event_BtnCrearUsuarioMouseClicked
    public void ControlLimite() {
        ((AbstractDocument) this.txtNuevoUsuario.getDocument()).setDocumentFilter(new ControlLimites(25));
        ((AbstractDocument) this.txtContraseña.getDocument()).setDocumentFilter(new ControlLimites(25));
    }
    private void BtnCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioMouseEntered
        this.FondoBtnCrearUsuario.setBackground(Color.red);
        this.BtnCrearUsuario.setForeground(Color.white);
    }//GEN-LAST:event_BtnCrearUsuarioMouseEntered

    private void BtnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioMouseExited
        this.FondoBtnCrearUsuario.setBackground(Color.white);
        this.BtnCrearUsuario.setForeground(Color.black);
    }//GEN-LAST:event_BtnCrearUsuarioMouseExited

    private void txtNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoUsuarioMouseClicked

    }//GEN-LAST:event_txtNuevoUsuarioMouseClicked

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCrearUsuario;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JPanel FondoBtnCrearUsuario;
    private javax.swing.JLabel FondoMenuGUsuarios;
    private javax.swing.JLabel NuevaContraseña;
    private javax.swing.JLabel NuevoUsuario;
    private javax.swing.JLabel SeleccionePermisos;
    private javax.swing.JLabel TituloGestionUsuarios;
    private javax.swing.JCheckBox cboxPCiudades;
    private javax.swing.JCheckBox cboxPClientes;
    private javax.swing.JCheckBox cboxPCompras;
    private javax.swing.JCheckBox cboxPFacturas;
    private javax.swing.JCheckBox cboxPGestionUsuario;
    private javax.swing.JCheckBox cboxPKardex;
    private javax.swing.JCheckBox cboxPListaCompras;
    private javax.swing.JCheckBox cboxPListaVentas;
    private javax.swing.JCheckBox cboxPProductos;
    private javax.swing.JCheckBox cboxPProveedor;
    private javax.swing.JCheckBox cboxPProvincias;
    private javax.swing.JLabel lblMensajeCambiante;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNuevoUsuario;
    // End of variables declaration//GEN-END:variables

}
