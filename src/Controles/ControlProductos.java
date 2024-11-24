package Controles;

import ConexionMySQL.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JLabel;

public class ControlProductos implements Controles_Palabra {

    private Conexion con = new Conexion();

    public Conexion getCon() {
        return this.con;
    }

    public void AgregarProducto(String cProducto, String nombre, String cProveedor, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ControlPalabra(cProducto)) {
            String columnas = "codigoProducto ='" + cProducto + "', nombre = '" + this.ControlSimbolos(nombre) + "', codigoProveedor ='" + cProveedor + "';";
            if (this.con.Insertar("productos", columnas) == 1) {
                j.setForeground(Color.red);
                j.setText("INGRESE UN CODIGO VALIDO DE PROVEEDOR O PRODUCTO");
            } else {
                j.setForeground(Color.green);
                j.setText("PRODUCTO AÑADIDO EXITOSAMENTE");
            }
        } else {
            j.setForeground(Color.red);
            j.setText("CODIGO DE PRODUCTO INVALIDO EJEMPLO: (CH001)");
        }
        this.con.Desconectar();
    }

    public void ModificarProducto(String nombre, String cProveedor, String cProducto, JLabel j) throws SQLException {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {

            String sql = "update productos set nombre='" + this.ControlSimbolos(nombre) + "', codigoProveedor='" + cProveedor + "' where codigoProducto='" + cProducto + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("PRODUCTO MODIFICADO");
        } catch (Exception e) {
            j.setForeground(Color.red);
            j.setText("CODIGO DE PROVEEDOR INVALIDO");
        }
        this.con.Desconectar();
    }

    public void EliminarProducto(String codigo, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "delete from productos where codigoProducto='" + codigo + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("PRODUCTO ELIMINADO");
            this.con.Desconectar();
        } catch (Exception e) {
            j.setForeground(Color.red);
            j.setText("PRODUCTO EN USO");
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
        boolean comp = false;
        if (palabra.matches("[A-Z]{2}[0-9]{3}")) {
            comp = true;
        } else {
            comp = false;
        }
        return comp;
    }

}
