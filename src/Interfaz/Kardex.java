/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import ConexionMySQL.Conexion;
import ConexionMySQL.GuardarDatosTablas;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Kardex extends javax.swing.JPanel {

    GuardarDatosTablas gdt = new GuardarDatosTablas();
    Conexion con = new Conexion();

    public Kardex() throws SQLException {
        initComponents();
        this.gdt.GuardarDatosKardex();
        this.tblKardex.setModel(this.gdt.MostrarDatosKardex());
        this.ModificarCeldas();
        this.cboxProductos.setModel(this.gdt.MostrarProductosKardex());
    }

    public void ModificarCeldas() {
        this.tblKardex.getColumnModel().getColumn(0).setPreferredWidth(25);
        this.tblKardex.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.tblKardex.getColumnModel().getColumn(2).setPreferredWidth(125);
        this.tblKardex.getColumnModel().getColumn(3).setPreferredWidth(20);
        this.tblKardex.getColumnModel().getColumn(4).setPreferredWidth(5);
        this.tblKardex.getColumnModel().getColumn(5).setPreferredWidth(5);
        this.tblKardex.getColumnModel().getColumn(6).setPreferredWidth(5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKardex = new javax.swing.JTable();
        tituloProducto = new javax.swing.JLabel();
        cboxProductos = new javax.swing.JComboBox<>();
        fondobtnBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        fondoKardex = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblKardex.setBackground(new java.awt.Color(255, 255, 255));
        tblKardex.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblKardex.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        tblKardex.setForeground(new java.awt.Color(0, 0, 0));
        tblKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tblKardex.setSelectionBackground(new java.awt.Color(102, 102, 255));
        tblKardex.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblKardex);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 590, 220));

        tituloProducto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloProducto.setForeground(new java.awt.Color(255, 255, 255));
        tituloProducto.setText("BUSCAR POR CODIGO DE PRODUCTO:");
        jPanel1.add(tituloProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 30));

        cboxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cboxProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 160, -1));

        fondobtnBuscar.setBackground(new java.awt.Color(0, 0, 0));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        fondobtnBuscarLayout.setVerticalGroup(
            fondobtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(fondobtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 30));

        fondoKardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/KARDEX! (1).png"))); // NOI18N
        jPanel1.add(fondoKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

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

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        this.fondobtnBuscar.setBackground(Color.white);
        this.btnBuscar.setForeground(Color.black);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        this.fondobtnBuscar.setBackground(Color.black);
        this.btnBuscar.setForeground(Color.white);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            try {
                this.gdt.GuardarKardexCodigo(String.valueOf(this.cboxProductos.getSelectedItem()));
                this.tblKardex.setModel(this.gdt.MostrarDatosKardex());
                this.ModificarCeldas();
                this.con.Desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JComboBox<String> cboxProductos;
    private javax.swing.JLabel fondoKardex;
    private javax.swing.JPanel fondobtnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKardex;
    private javax.swing.JLabel tituloProducto;
    // End of variables declaration//GEN-END:variables
}
