package Interfaz;

import ConexionMySQL.Conexion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private Conexion con = new Conexion();
    private String dato;
    public static String dato1, dato2; //variables para obtener la cedula y el ruc para las opciones de factura y compra

    public String getDato() {
        return this.dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        FondoBtnProductos = new javax.swing.JPanel();
        iconoProductos = new javax.swing.JLabel();
        FondoBtnClientes = new javax.swing.JPanel();
        iconoClientes = new javax.swing.JLabel();
        FondoBtnProveedor = new javax.swing.JPanel();
        iconoProveedor = new javax.swing.JLabel();
        FondoBtnFactura = new javax.swing.JPanel();
        iconoFactura = new javax.swing.JLabel();
        FondoBtnCompra = new javax.swing.JPanel();
        iconoCompra = new javax.swing.JLabel();
        FondoBtnKardex = new javax.swing.JPanel();
        iconoKardex = new javax.swing.JLabel();
        FondoBtnProvincia = new javax.swing.JPanel();
        iconoProvincias = new javax.swing.JLabel();
        FondoBtnCiudades = new javax.swing.JPanel();
        iconoCiudades = new javax.swing.JLabel();
        FondoBtnLisVentas = new javax.swing.JPanel();
        iconoLisVentas = new javax.swing.JLabel();
        FondoBtnLisCompra = new javax.swing.JPanel();
        iconoLisCompra = new javax.swing.JLabel();
        FondoBtnGestorUsuario = new javax.swing.JPanel();
        iconoGestorUsuario = new javax.swing.JLabel();
        fonfoFondoBtnAnimado = new javax.swing.JPanel();
        btnFondoAnimado = new javax.swing.JLabel();
        FondoTitMenu = new javax.swing.JPanel();
        TitMenu = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        logoToyota = new javax.swing.JLabel();
        PanelCambiante = new javax.swing.JPanel();
        fondoVideo = new javax.swing.JLabel();
        TituloToyota = new javax.swing.JLabel();
        BarraNavegacion = new javax.swing.JPanel();
        FondoBtnX = new javax.swing.JPanel();
        BtnX = new javax.swing.JLabel();
        lblCambiante = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(80, 77, 96));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBtnProductos.setBackground(new java.awt.Color(158, 89, 146));
        FondoBtnProductos.setToolTipText("");

        iconoProductos.setBackground(new java.awt.Color(158, 89, 146));
        iconoProductos.setForeground(new java.awt.Color(0, 0, 0));
        iconoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan-de-molde (2).png"))); // NOI18N
        iconoProductos.setText("PRODUCTOS");
        iconoProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoProductosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnProductosLayout = new javax.swing.GroupLayout(FondoBtnProductos);
        FondoBtnProductos.setLayout(FondoBtnProductosLayout);
        FondoBtnProductosLayout.setHorizontalGroup(
            FondoBtnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnProductosLayout.setVerticalGroup(
            FondoBtnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoProductos))
        );

        background.add(FondoBtnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 30));

        FondoBtnClientes.setBackground(new java.awt.Color(158, 89, 146));

        iconoClientes.setForeground(new java.awt.Color(0, 0, 0));
        iconoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio-al-cliente (1).png"))); // NOI18N
        iconoClientes.setText("CLIENTES");
        iconoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnClientesLayout = new javax.swing.GroupLayout(FondoBtnClientes);
        FondoBtnClientes.setLayout(FondoBtnClientesLayout);
        FondoBtnClientesLayout.setHorizontalGroup(
            FondoBtnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnClientesLayout.setVerticalGroup(
            FondoBtnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(FondoBtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 30));

        FondoBtnProveedor.setBackground(new java.awt.Color(158, 89, 146));

        iconoProveedor.setForeground(new java.awt.Color(0, 0, 0));
        iconoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/repartidor (1).png"))); // NOI18N
        iconoProveedor.setText("PROVEEDOR");
        iconoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoProveedorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnProveedorLayout = new javax.swing.GroupLayout(FondoBtnProveedor);
        FondoBtnProveedor.setLayout(FondoBtnProveedorLayout);
        FondoBtnProveedorLayout.setHorizontalGroup(
            FondoBtnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnProveedorLayout.setVerticalGroup(
            FondoBtnProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnProveedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoProveedor))
        );

        background.add(FondoBtnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 150, 30));

        FondoBtnFactura.setBackground(new java.awt.Color(158, 89, 146));

        iconoFactura.setForeground(new java.awt.Color(0, 0, 0));
        iconoFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura (1).png"))); // NOI18N
        iconoFactura.setText("FACTURA");
        iconoFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoFacturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoFacturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnFacturaLayout = new javax.swing.GroupLayout(FondoBtnFactura);
        FondoBtnFactura.setLayout(FondoBtnFacturaLayout);
        FondoBtnFacturaLayout.setHorizontalGroup(
            FondoBtnFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnFacturaLayout.setVerticalGroup(
            FondoBtnFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnFacturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoFactura))
        );

        background.add(FondoBtnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 30));

        FondoBtnCompra.setBackground(new java.awt.Color(158, 89, 146));

        iconoCompra.setForeground(new java.awt.Color(0, 0, 0));
        iconoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/metodo-de-pago (1).png"))); // NOI18N
        iconoCompra.setText("COMPRA");
        iconoCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoCompraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnCompraLayout = new javax.swing.GroupLayout(FondoBtnCompra);
        FondoBtnCompra.setLayout(FondoBtnCompraLayout);
        FondoBtnCompraLayout.setHorizontalGroup(
            FondoBtnCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnCompraLayout.setVerticalGroup(
            FondoBtnCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnCompraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoCompra))
        );

        background.add(FondoBtnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 30));

        FondoBtnKardex.setBackground(new java.awt.Color(158, 89, 146));

        iconoKardex.setForeground(new java.awt.Color(0, 0, 0));
        iconoKardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario-disponible (1).png"))); // NOI18N
        iconoKardex.setText("KARDEX");
        iconoKardex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoKardex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoKardexMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoKardexMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoKardexMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnKardexLayout = new javax.swing.GroupLayout(FondoBtnKardex);
        FondoBtnKardex.setLayout(FondoBtnKardexLayout);
        FondoBtnKardexLayout.setHorizontalGroup(
            FondoBtnKardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoKardex, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnKardexLayout.setVerticalGroup(
            FondoBtnKardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnKardexLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoKardex))
        );

        background.add(FondoBtnKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 30));

        FondoBtnProvincia.setBackground(new java.awt.Color(158, 89, 146));

        iconoProvincias.setForeground(new java.awt.Color(0, 0, 0));
        iconoProvincias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/colombia (1).png"))); // NOI18N
        iconoProvincias.setText("PROVINCIAS");
        iconoProvincias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoProvincias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoProvinciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoProvinciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoProvinciasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnProvinciaLayout = new javax.swing.GroupLayout(FondoBtnProvincia);
        FondoBtnProvincia.setLayout(FondoBtnProvinciaLayout);
        FondoBtnProvinciaLayout.setHorizontalGroup(
            FondoBtnProvinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoProvincias, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnProvinciaLayout.setVerticalGroup(
            FondoBtnProvinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnProvinciaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoProvincias)
                .addGap(36, 36, 36))
        );

        background.add(FondoBtnProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 150, 30));

        FondoBtnCiudades.setBackground(new java.awt.Color(158, 89, 146));

        iconoCiudades.setForeground(new java.awt.Color(0, 0, 0));
        iconoCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ciudad (1).png"))); // NOI18N
        iconoCiudades.setText("CIUDADES");
        iconoCiudades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoCiudadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoCiudadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoCiudadesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnCiudadesLayout = new javax.swing.GroupLayout(FondoBtnCiudades);
        FondoBtnCiudades.setLayout(FondoBtnCiudadesLayout);
        FondoBtnCiudadesLayout.setHorizontalGroup(
            FondoBtnCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoCiudades, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnCiudadesLayout.setVerticalGroup(
            FondoBtnCiudadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBtnCiudadesLayout.createSequentialGroup()
                .addComponent(iconoCiudades)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(FondoBtnCiudades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 30));

        FondoBtnLisVentas.setBackground(new java.awt.Color(158, 89, 146));

        iconoLisVentas.setForeground(new java.awt.Color(0, 0, 0));
        iconoLisVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedido (1).png"))); // NOI18N
        iconoLisVentas.setText("LISTA VENTAS");
        iconoLisVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoLisVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoLisVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoLisVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoLisVentasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnLisVentasLayout = new javax.swing.GroupLayout(FondoBtnLisVentas);
        FondoBtnLisVentas.setLayout(FondoBtnLisVentasLayout);
        FondoBtnLisVentasLayout.setHorizontalGroup(
            FondoBtnLisVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoLisVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnLisVentasLayout.setVerticalGroup(
            FondoBtnLisVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnLisVentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoLisVentas))
        );

        background.add(FondoBtnLisVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 30));

        FondoBtnLisCompra.setBackground(new java.awt.Color(158, 89, 146));

        iconoLisCompra.setForeground(new java.awt.Color(0, 0, 0));
        iconoLisCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-deseos (1).png"))); // NOI18N
        iconoLisCompra.setText("LISTA COMPRAS");
        iconoLisCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoLisCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoLisCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoLisCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoLisCompraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnLisCompraLayout = new javax.swing.GroupLayout(FondoBtnLisCompra);
        FondoBtnLisCompra.setLayout(FondoBtnLisCompraLayout);
        FondoBtnLisCompraLayout.setHorizontalGroup(
            FondoBtnLisCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoLisCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnLisCompraLayout.setVerticalGroup(
            FondoBtnLisCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnLisCompraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoLisCompra))
        );

        background.add(FondoBtnLisCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 150, -1));

        FondoBtnGestorUsuario.setBackground(new java.awt.Color(158, 89, 146));

        iconoGestorUsuario.setForeground(new java.awt.Color(0, 0, 0));
        iconoGestorUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil (1).png"))); // NOI18N
        iconoGestorUsuario.setText("GESTION USUARIO");
        iconoGestorUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoGestorUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoGestorUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconoGestorUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconoGestorUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnGestorUsuarioLayout = new javax.swing.GroupLayout(FondoBtnGestorUsuario);
        FondoBtnGestorUsuario.setLayout(FondoBtnGestorUsuarioLayout);
        FondoBtnGestorUsuarioLayout.setHorizontalGroup(
            FondoBtnGestorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoGestorUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoBtnGestorUsuarioLayout.setVerticalGroup(
            FondoBtnGestorUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnGestorUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoGestorUsuario))
        );

        background.add(FondoBtnGestorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 150, -1));

        fonfoFondoBtnAnimado.setBackground(new java.awt.Color(158, 89, 146));

        btnFondoAnimado.setForeground(new java.awt.Color(0, 0, 0));
        btnFondoAnimado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFondoAnimado.setText("PANTALLA PRINCIPAL");
        btnFondoAnimado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFondoAnimadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFondoAnimadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFondoAnimadoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fonfoFondoBtnAnimadoLayout = new javax.swing.GroupLayout(fonfoFondoBtnAnimado);
        fonfoFondoBtnAnimado.setLayout(fonfoFondoBtnAnimadoLayout);
        fonfoFondoBtnAnimadoLayout.setHorizontalGroup(
            fonfoFondoBtnAnimadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFondoAnimado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        fonfoFondoBtnAnimadoLayout.setVerticalGroup(
            fonfoFondoBtnAnimadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fonfoFondoBtnAnimadoLayout.createSequentialGroup()
                .addComponent(btnFondoAnimado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(fonfoFondoBtnAnimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 150, 40));

        FondoTitMenu.setBackground(new java.awt.Color(132, 74, 122));

        TitMenu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TitMenu.setForeground(new java.awt.Color(0, 0, 0));
        TitMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitMenu.setText("MENU");

        javax.swing.GroupLayout FondoTitMenuLayout = new javax.swing.GroupLayout(FondoTitMenu);
        FondoTitMenu.setLayout(FondoTitMenuLayout);
        FondoTitMenuLayout.setHorizontalGroup(
            FondoTitMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoTitMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        FondoTitMenuLayout.setVerticalGroup(
            FondoTitMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTitMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TitMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(FondoTitMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        logoToyota.setForeground(new java.awt.Color(255, 255, 255));
        logoToyota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-Toyota (1).png"))); // NOI18N
        background.add(logoToyota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 50, 40));

        fondoVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondocambiante.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelCambianteLayout = new javax.swing.GroupLayout(PanelCambiante);
        PanelCambiante.setLayout(PanelCambianteLayout);
        PanelCambianteLayout.setHorizontalGroup(
            PanelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, Short.MAX_VALUE)
        );
        PanelCambianteLayout.setVerticalGroup(
            PanelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(PanelCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 650, 440));

        TituloToyota.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TituloToyota.setForeground(new java.awt.Color(255, 255, 255));
        TituloToyota.setText("TOYOTA");
        background.add(TituloToyota, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 40));

        BarraNavegacion.setBackground(new java.awt.Color(80, 77, 96));
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

        FondoBtnX.setBackground(new java.awt.Color(80, 77, 96));

        BtnX.setBackground(new java.awt.Color(255, 255, 255));
        BtnX.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BtnX.setForeground(new java.awt.Color(0, 0, 0));
        BtnX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnX.setText("X");
        BtnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoBtnXLayout = new javax.swing.GroupLayout(FondoBtnX);
        FondoBtnX.setLayout(FondoBtnXLayout);
        FondoBtnXLayout.setHorizontalGroup(
            FondoBtnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnXLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoBtnXLayout.setVerticalGroup(
            FondoBtnXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoBtnXLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BarraNavegacionLayout = new javax.swing.GroupLayout(BarraNavegacion);
        BarraNavegacion.setLayout(BarraNavegacionLayout);
        BarraNavegacionLayout.setHorizontalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraNavegacionLayout.createSequentialGroup()
                .addGap(0, 770, Short.MAX_VALUE)
                .addComponent(FondoBtnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addComponent(FondoBtnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(BarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        lblCambiante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCambiante.setForeground(new java.awt.Color(255, 0, 0));
        lblCambiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(lblCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 320, 30));

        jPanel1.setBackground(new java.awt.Color(158, 89, 146));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 150, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProductosMouseClicked
        MenuProductos mp = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                mp = new MenuProductos();
                this.Permisos("pProducto", mp);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoProductosMouseClicked

    private void BarraNavegacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_BarraNavegacionMousePressed

    private void BarraNavegacionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraNavegacionMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraNavegacionMouseDragged

    private void BtnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnXMouseClicked

    private void BtnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnXMouseEntered
        this.FondoBtnX.setBackground(Color.red);
        this.BtnX.setForeground(Color.white);
    }//GEN-LAST:event_BtnXMouseEntered

    private void BtnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnXMouseExited
        this.FondoBtnX.setBackground(new Color(80, 77, 96));
        this.BtnX.setForeground(Color.black);
    }//GEN-LAST:event_BtnXMouseExited

    private void iconoProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProductosMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pProducto", this.FondoBtnProductos);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoProductosMouseEntered

    private void iconoProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProductosMouseExited
        this.FondoBtnProductos.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoProductosMouseExited

    private void iconoClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoClientesMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pClientes", this.FondoBtnClientes);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoClientesMouseEntered

    private void iconoClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoClientesMouseExited
        this.FondoBtnClientes.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoClientesMouseExited

    private void iconoProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProveedorMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pProveedor", this.FondoBtnProveedor);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoProveedorMouseEntered

    private void iconoProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProveedorMouseExited
        this.FondoBtnProveedor.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoProveedorMouseExited

    private void iconoFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoFacturaMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pFactura", this.FondoBtnFactura);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoFacturaMouseEntered

    private void iconoFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoFacturaMouseExited
        this.FondoBtnFactura.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoFacturaMouseExited

    private void iconoCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCompraMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pCompra", this.FondoBtnCompra);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoCompraMouseEntered

    private void iconoCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCompraMouseExited
        this.FondoBtnCompra.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoCompraMouseExited

    private void iconoKardexMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoKardexMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pKardex", this.FondoBtnKardex);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoKardexMouseEntered

    private void iconoKardexMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoKardexMouseExited
        this.FondoBtnKardex.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoKardexMouseExited

    private void iconoProvinciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProvinciasMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pProvincias", this.FondoBtnProvincia);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoProvinciasMouseEntered

    private void iconoProvinciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProvinciasMouseExited
        this.FondoBtnProvincia.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoProvinciasMouseExited

    private void iconoCiudadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCiudadesMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pCiudades", this.FondoBtnCiudades);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoCiudadesMouseEntered

    private void iconoCiudadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCiudadesMouseExited
        this.FondoBtnCiudades.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoCiudadesMouseExited

    private void iconoLisVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLisVentasMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pListaVenta", this.FondoBtnLisVentas);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoLisVentasMouseEntered

    private void iconoLisVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLisVentasMouseExited
        this.FondoBtnLisVentas.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoLisVentasMouseExited

    private void iconoLisCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLisCompraMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pListaCompra", this.FondoBtnLisCompra);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoLisCompraMouseEntered

    private void iconoLisCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLisCompraMouseExited
        this.FondoBtnLisCompra.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoLisCompraMouseExited

    private void iconoGestorUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoGestorUsuarioMouseEntered
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.ColorFondoPermisos("pGestorUsuario", this.FondoBtnGestorUsuario);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoGestorUsuarioMouseEntered

    private void iconoGestorUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoGestorUsuarioMouseExited
        this.FondoBtnGestorUsuario.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_iconoGestorUsuarioMouseExited

    private void iconoClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoClientesMouseClicked
        MenuClientes mc = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                mc = new MenuClientes();
                this.Permisos("pClientes", mc);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoClientesMouseClicked

    private void iconoProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProveedorMouseClicked
        MenuProvedores mp = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                mp = new MenuProvedores();
                this.Permisos("pProveedor", mp);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoProveedorMouseClicked

    private void iconoProvinciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoProvinciasMouseClicked
        MenuProvincias mp = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                mp = new MenuProvincias();
                this.Permisos("pProvincias", mp);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoProvinciasMouseClicked

    private void iconoCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCiudadesMouseClicked
        MenuCiudades mc = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                mc = new MenuCiudades();
                this.Permisos("pCiudades", mc);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoCiudadesMouseClicked

    private void iconoGestorUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoGestorUsuarioMouseClicked
        MenuGestionUsuario mgu = new MenuGestionUsuario();
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                this.Permisos("pGestorUsuario", mgu);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoGestorUsuarioMouseClicked

    private void iconoCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCompraMouseClicked
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                if (this.Permisos("pCompra")) {
                    dato1 = (JOptionPane.showInputDialog("INGRESE SU RUC DE PROVEEDOR", null));
                    MenuCompra mc = new MenuCompra();
                    if (mc.ControlProveedor(dato1, this.lblCambiante)) {
                        this.Permisos("pCompra", mc);
                        this.lblCambiante.setText("");
                    } else {
                        this.lblCambiante.setText("PROVEEDOR INVALIDO");
                    }
                }
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoCompraMouseClicked

    private void btnFondoAnimadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFondoAnimadoMouseClicked
        MenuDefecto mf = new MenuDefecto();
        this.CambiarPanel(mf);
        this.lblCambiante.setText("");
    }//GEN-LAST:event_btnFondoAnimadoMouseClicked

    private void btnFondoAnimadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFondoAnimadoMouseEntered
        this.fonfoFondoBtnAnimado.setBackground(new Color(132, 74, 122));
    }//GEN-LAST:event_btnFondoAnimadoMouseEntered

    private void btnFondoAnimadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFondoAnimadoMouseExited
        this.fonfoFondoBtnAnimado.setBackground(new Color(158, 89, 146));
    }//GEN-LAST:event_btnFondoAnimadoMouseExited

    private void iconoLisCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLisCompraMouseClicked
        ListaCompras lc = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                lc = new ListaCompras();
                this.Permisos("pListaCompra", lc);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoLisCompraMouseClicked

    private void iconoKardexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoKardexMouseClicked
        Kardex kx = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                kx = new Kardex();
                this.Permisos("pKardex", kx);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoKardexMouseClicked

    private void iconoFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoFacturaMouseClicked
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                if (this.Permisos("pFactura")) {
                    dato2 = (JOptionPane.showInputDialog("INGRESE SU CODIGO DE CLIENTE:", null));
                    MenuFactura mf = new MenuFactura();
                    if (mf.ControlCliente(dato2, this.lblCambiante)) {
                        this.Permisos("pFactura", mf);
                        this.lblCambiante.setText("");
                    } else {
                        this.lblCambiante.setForeground(new Color(255, 0, 0));
                        this.lblCambiante.setText("CLIENTE INVALIDO");
                    }
                }
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_iconoFacturaMouseClicked

    private void iconoLisVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLisVentasMouseClicked
        ListaVentas lv = null;
        try {
            if (this.con.BuscarConexion()) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base");
            } else {
                lv = new ListaVentas();
                this.Permisos("pListaVenta", lv);
                this.con.Desconectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconoLisVentasMouseClicked

    public void Permisos(String nombrePermiso, JPanel p) throws SQLException {
        //Metodo General que compara si el usuario tiene permisos o no a esa opcion
        try {
            if (con.SeleccionarPermisos("usuarios", dato, nombrePermiso)) {
                this.CambiarPanel(p);
                this.lblCambiante.setText("");
            } else {
                this.lblCambiante.setForeground(new Color(255, 0, 0));
                this.lblCambiante.setText("NO TIENES PERMISO");
            }
            this.con.Desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean Permisos(String nombrePermiso) throws SQLException {
        boolean a = false;
        try {
            if (con.SeleccionarPermisos("usuarios", dato, nombrePermiso)) {
                a = true;
                this.lblCambiante.setText("");
            } else {
                this.lblCambiante.setForeground(new Color(255, 0, 0));
                this.lblCambiante.setText("NO TIENES PERMISO");
            }
            this.con.Desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public void ColorFondoPermisos(String nombrePermiso, JPanel j) throws SQLException {
        try {
            if (con.SeleccionarPermisos("usuarios", dato, nombrePermiso)) {
                j.setBackground(new Color(132, 74, 122));
            } else {
                j.setBackground(new Color(203, 50, 52));
            }
            this.con.Desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void MostrarMenuPrincipal() {
        this.setVisible(true);
    }

    private void CambiarPanel(JPanel p) {
        //Metodo para cambiar y adaptar el fondo para la pantalla principal del menu
        p.setSize(650, 440);
        p.setLocation(0, 0);
        this.PanelCambiante.removeAll();
        this.PanelCambiante.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        this.PanelCambiante.revalidate();
        this.PanelCambiante.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JLabel BtnX;
    private javax.swing.JPanel FondoBtnCiudades;
    private javax.swing.JPanel FondoBtnClientes;
    private javax.swing.JPanel FondoBtnCompra;
    private javax.swing.JPanel FondoBtnFactura;
    private javax.swing.JPanel FondoBtnGestorUsuario;
    private javax.swing.JPanel FondoBtnKardex;
    private javax.swing.JPanel FondoBtnLisCompra;
    private javax.swing.JPanel FondoBtnLisVentas;
    private javax.swing.JPanel FondoBtnProductos;
    private javax.swing.JPanel FondoBtnProveedor;
    private javax.swing.JPanel FondoBtnProvincia;
    private javax.swing.JPanel FondoBtnX;
    private javax.swing.JPanel FondoTitMenu;
    private javax.swing.JPanel PanelCambiante;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JLabel TitMenu;
    private javax.swing.JLabel TituloToyota;
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnFondoAnimado;
    private javax.swing.JLabel fondoVideo;
    private javax.swing.JPanel fonfoFondoBtnAnimado;
    private javax.swing.JLabel iconoCiudades;
    private javax.swing.JLabel iconoClientes;
    private javax.swing.JLabel iconoCompra;
    private javax.swing.JLabel iconoFactura;
    private javax.swing.JLabel iconoGestorUsuario;
    private javax.swing.JLabel iconoKardex;
    private javax.swing.JLabel iconoLisCompra;
    private javax.swing.JLabel iconoLisVentas;
    private javax.swing.JLabel iconoProductos;
    private javax.swing.JLabel iconoProveedor;
    private javax.swing.JLabel iconoProvincias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCambiante;
    private javax.swing.JLabel logoToyota;
    // End of variables declaration//GEN-END:variables
}
