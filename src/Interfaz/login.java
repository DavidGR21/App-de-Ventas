package Interfaz;

import ConexionMySQL.Conexion;
import Controles.ControlLimites;
import Controles.ControlUsuario;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.text.AbstractDocument;

public class login extends javax.swing.JFrame implements KeyListener, FocusListener {

    private int xMouse, yMouse; //variables para guardar la posicion del mouse
    private Conexion con = new Conexion(); //Objeto de la Clase Conexion
    private ControlUsuario cu = new ControlUsuario(); //Objeto de la clase ControlUsuario
    private MenuPrincipal mp = new MenuPrincipal(); //Objeto de la clase MenuPrincipal

    public MenuPrincipal getMp() {
        return this.mp;
    }

    public login() {
        initComponents();
        this.setLocationRelativeTo(this); //Metodo para la aparicion de la pantalla en medio
        this.ControlLimites(); //Metodo para controlar el maximo de caracteres de los jtextfields
        txtUsuario.addKeyListener(this);
        txtUsuario.addFocusListener(this);
        txtContraseña.addKeyListener(this);
        txtContraseña.addFocusListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        background = new javax.swing.JPanel();
        ToyotaLogin = new javax.swing.JLabel();
        iconoToyota = new javax.swing.JLabel();
        ImagenLogin = new javax.swing.JLabel();
        iconoLogin = new javax.swing.JLabel();
        TituloIniciarSesion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JLabel();
        Separador2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        fondoBotonEntrar = new javax.swing.JPanel();
        Entrar = new javax.swing.JLabel();
        BarraNavegacion = new javax.swing.JPanel();
        FondoBtnSalir = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JLabel();
        textocambiante = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ToyotaLogin.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ToyotaLogin.setForeground(new java.awt.Color(0, 102, 102));
        ToyotaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ToyotaLogin.setText("TOYOTA");
        background.add(ToyotaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 150, 40));

        iconoToyota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoToyota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-Toyota (1).png"))); // NOI18N
        background.add(iconoToyota, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 150, -1));

        ImagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoLogin.jpg"))); // NOI18N
        background.add(ImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 300));

        iconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        background.add(iconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        TituloIniciarSesion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TituloIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        TituloIniciarSesion.setText("INICIAR SESION");
        background.add(TituloIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("USUARIO:");
        background.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        background.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));
        background.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 10));

        Contraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("CONTRASEÑA:");
        background.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        background.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 20));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("**********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        background.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        fondoBotonEntrar.setBackground(new java.awt.Color(137, 77, 129));

        Entrar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entrar.setText("ENTRAR");
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondoBotonEntrarLayout = new javax.swing.GroupLayout(fondoBotonEntrar);
        fondoBotonEntrar.setLayout(fondoBotonEntrarLayout);
        fondoBotonEntrarLayout.setHorizontalGroup(
            fondoBotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        fondoBotonEntrarLayout.setVerticalGroup(
            fondoBotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        background.add(fondoBotonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

        BarraNavegacion.setBackground(new java.awt.Color(255, 255, 255));
        BarraNavegacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraNavegacionMouseDragged(evt);
            }
        });
        BarraNavegacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraNavegacionMousePressed(evt);
            }
        });

        FondoBtnSalir.setBackground(new java.awt.Color(255, 255, 255));

        BtnSalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        BtnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnSalir.setText("X");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnSalirLayout = new javax.swing.GroupLayout(FondoBtnSalir);
        FondoBtnSalir.setLayout(FondoBtnSalirLayout);
        FondoBtnSalirLayout.setHorizontalGroup(
            FondoBtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FondoBtnSalirLayout.setVerticalGroup(
            FondoBtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BarraNavegacionLayout = new javax.swing.GroupLayout(BarraNavegacion);
        BarraNavegacion.setLayout(BarraNavegacionLayout);
        BarraNavegacionLayout.setHorizontalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addComponent(FondoBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 379, Short.MAX_VALUE))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBtnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(BarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        textocambiante.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        textocambiante.setForeground(new java.awt.Color(51, 0, 51));
        textocambiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(textocambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void BarraNavegacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMousePressed
        //Obtener las posiciones de Pantalla del mouse
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_BarraNavegacionMousePressed

    private void BarraNavegacionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMouseDragged
        //Mover la pantalla en direccion del mouse 
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - this.xMouse, y - this.yMouse); //Resta la posicion de la pantalla del mouse, con la del mouse en la pantalla
    }//GEN-LAST:event_BarraNavegacionMouseDragged

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0); //Cerrar la pantalla de login
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        //Cambiar el color del fondo y de las letras de un boton
        this.FondoBtnSalir.setBackground(Color.red);
        this.BtnSalir.setForeground(Color.white);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        //Cambiar el color del fondo y de las letras de un boton
        this.FondoBtnSalir.setBackground(Color.white);
        this.BtnSalir.setForeground(Color.black);
    }//GEN-LAST:event_BtnSalirMouseExited

    private void EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseEntered
        //Cambiar el color del fondo y de las letras de un boton
        this.fondoBotonEntrar.setBackground(new Color(105, 62, 99));
    }//GEN-LAST:event_EntrarMouseEntered

    private void EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseExited
        //Cambiar el color del fondo y de las letras de un boton
        this.fondoBotonEntrar.setBackground(new Color(137, 77, 129));
    }//GEN-LAST:event_EntrarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        //Metodo al presionar el mouse en el jtextfield borra las letras de este
        if (this.txtUsuario.getText().equals("Ingrese su Usuario")) {
            this.txtUsuario.setText("");
            this.txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(this.txtContraseña.getPassword()).isEmpty()) {
            this.txtContraseña.setText("**********");
            this.txtContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        //Metodo al presionar el mouse en el jtextfield borra las letras de este
        if (String.valueOf(this.txtContraseña.getPassword()).equals("**********")) {
            this.txtContraseña.setText("");
            this.txtContraseña.setForeground(Color.black);
        }
        if (this.txtUsuario.getText().isEmpty()) {
            this.txtUsuario.setText("Ingrese su Usuario");
            this.txtUsuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtContraseñaMousePressed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        //Método control del login
        IniciarSesion();
    }//GEN-LAST:event_EntrarMouseClicked
    public void ControlLimites() {
        //Control para el maximo de caracteres dentro de un jtextfield
        ((AbstractDocument) this.txtUsuario.getDocument()).setDocumentFilter(new ControlLimites(20));
        ((AbstractDocument) this.txtContraseña.getDocument()).setDocumentFilter(new ControlLimites(20));
    }

    public void IniciarSesion() {
        String usuario = this.txtUsuario.getText();
        String clave = this.txtContraseña.getText();
        ControlUsuario cu = new ControlUsuario();
        try {
            try {
                if (cu.ControlLogin(usuario, clave, this.textocambiante) == 2) { //Controlo con el metodo control login de que la clave y el usuario sean correctos
                    this.mp.setDato(usuario);
                    this.mp.setVisible(true);
                    dispose();
                    this.con.Desconectar();
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Entrar;
    private javax.swing.JPanel FondoBtnSalir;
    private javax.swing.JLabel ImagenLogin;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel TituloIniciarSesion;
    private javax.swing.JLabel ToyotaLogin;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel background;
    private javax.swing.JPanel fondoBotonEntrar;
    private javax.swing.JLabel iconoLogin;
    private javax.swing.JLabel iconoToyota;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel textocambiante;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        //NO USO
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_TAB) {
            if (e.getSource() == txtUsuario) {
                txtContraseña.requestFocus(); // Cambia el foco al campo de contraseña al presionar Tab desde el campo de usuario
            } else if (e.getSource() == txtContraseña) {
                txtUsuario.requestFocus(); // Cambia el foco al campo de usuario al presionar Tab desde el campo de contraseña
            }
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (e.getSource() == txtUsuario || e.getSource() == txtContraseña) {
                IniciarSesion(); // Realiza la acción de inicio de sesión al presionar Enter en los campos de texto
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //NO USO
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == txtUsuario) {
            if (txtUsuario.getText().equals("Ingrese su Usuario")) {
                txtUsuario.setText("");
                txtUsuario.setForeground(Color.black);
            }
        } else if (e.getSource() == txtContraseña) {
            if (String.valueOf(txtContraseña.getPassword()).equals("**********")) {
                txtContraseña.setText("");
                txtContraseña.setForeground(Color.black);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == txtUsuario) {
            if (txtUsuario.getText().isEmpty()) {
                txtUsuario.setText("Ingrese su Usuario");
                txtUsuario.setForeground(Color.gray);
            }
        } else if (e.getSource() == txtContraseña) {
            if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
                txtContraseña.setText("**********");
                txtContraseña.setForeground(Color.gray);
            }
        }
    }

}
