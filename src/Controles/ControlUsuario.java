package Controles;

import ConexionMySQL.Conexion;
import Encriptaciones.EncriptacionDatos;
import Objetos.*;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ControlUsuario implements Controles_Palabra {

    private Conexion con = new Conexion();
    private EncriptacionDatos md = new EncriptacionDatos();

    public int ControlLogin(String Usuario, String clave, JLabel txc) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        int cont = 0;
        this.con.Conectar();
        if (this.con.BuscarConexion()) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base");
        } else {
            int conterror = 0;
            con.SeleccionarTodo("usuariosbloqueados where usuario='" + this.ControlSimbolos(Usuario) + "'");
            PreparedStatement ps, ts;
            ResultSet rs, rc;
            ps = this.con.getCon().prepareStatement("select usuario, clave from usuarios where usuario = '" + this.ControlSimbolos(Usuario) + "'");
            rs = ps.executeQuery();
            ts = this.con.getCon().prepareStatement("select pIntentos from usuarios where usuario ='" + this.ControlSimbolos(Usuario) + "';");
            rc = ts.executeQuery();
            if (rc.next()) {
                conterror = rc.getInt("pIntentos");
            }
            if (con.getRs().next()) {
                txc.setText("USUARIO BLOQUEADO");
            } else {
                try {
                    if (rs.next()) {
                        cont++;
                        String claveDB = md.Desencriptar(rs.getString("clave"));
                        if (clave.equals(claveDB)) {
                            cont++;
                            this.con.Actualizar("usuarios", "pIntentos", 0, "usuario", this.ControlSimbolos(Usuario));
                        } else {
                            if (conterror == 2) {
                                txc.setText("USUARIO BLOQUEADO");
                                ps = this.con.getCon().prepareStatement("insert into usuariosbloqueados (usuario) values ('" + this.ControlSimbolos(Usuario) + "');");
                                ps.executeUpdate();
                                ps.executeUpdate("delete from usuarios where usuario = '" + this.ControlSimbolos(Usuario) + "'");
                            } else {
                                conterror++;
                                this.con.Actualizar("usuarios", "pIntentos", conterror, "usuario", this.ControlSimbolos(Usuario));
                                txc.setText("CLAVE INCORRECTA");
                            }
                        }
                    } else {
                        txc.setText("USUARIO NO ENCONTRADO");
                    }
                    this.con.Desconectar();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "No hay conexion con la base");
                }
            }
        }
        return cont;
    }

    public void AgregarUsuario(Usuario u, JLabel j) throws SQLException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        this.con.Conectar();
        String columnas = ("usuario='" + this.ControlSimbolos(u.getUsuario()) + "', clave='" + md.Encriptar(u.getClave()) + "', pProducto="
                + u.ispProducto() + ", pClientes=" + u.ispClientes() + ", pProveedor=" + u.ispProveedor()
                + ", pFactura=" + u.ispFactura() + ", pCompra=" + u.ispCompra() + ", pKardex=" + u.ispKardex()
                + ", pProvincias=" + u.ispProvincias() + ", pCiudades=" + u.ispCiudades() + ", pListaVenta="
                + u.ispListaVenta() + ", pListaCompra=" + u.ispListaCompra() + ", pGestorUsuario=" + u.ispGestorUsuario() + ";");
        if (this.con.Insertar("usuarios", columnas) == 1) {
            j.setForeground(Color.red);
            j.setText("USUARIO YA EXISTENTE");
        } else {
            j.setForeground(Color.green);
            j.setText("USUARIO CREADO EXITOSAMENTE");
        }
    }

    @Override
    public String ControlSimbolos(String palabra) {
        StringBuilder cadenaModificada = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            if (caracter == '\'') {
                cadenaModificada.append('\\'); // Agregar barra diagonal inversa antes de la comilla
            }
            if (caracter == '\\') {
                cadenaModificada.append('\\'); // Agregar barra diagonal inversa antes de la comilla
            }

            cadenaModificada.append(caracter);
        }
        return cadenaModificada.toString();
    }

    @Override
    public boolean ControlPalabra(String palabra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
