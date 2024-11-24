package Controles;

import ConexionMySQL.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JLabel;

public class ControlProvincia implements Controles_Palabra {

    private Conexion con = new Conexion();

    public Conexion getCon() {
        return this.con;
    }

    public void AgregarProvincia(String codigo, String nombre, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ControlPalabra(codigo)) {
            String columnas = ("codigoProvincia='" + this.ControlSimbolos(codigo) + "', nombreProvincia='" + this.ControlSimbolos(nombre) + "';");
            if (this.con.Insertar("provincias", columnas) == 1) {
                j.setForeground(new Color(255, 51, 51));
                j.setText("Provincia Existente");
            } else {
                j.setForeground(Color.green);
                j.setText("Provincia Creada");
            }
        } else {
            j.setForeground(new Color(255, 51, 51));
            j.setText("Codigo Invalido, ejemplo valido: (TU001)");
        }
    }

    public void ModificarProvincia(String nombre, String codigo, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "update provincias set nombreProvincia='" + this.ControlSimbolos(nombre) + "' where codigoProvincia='" + this.ControlSimbolos(codigo) + "'";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("Provincia Modificada");
        } catch (Exception e) {
        }
    }

    public void Eliminar(String codigo, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "delete from provincias where codigoProvincia='" + this.ControlSimbolos(codigo) + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("Provincia Eliminada");
        } catch (Exception e) {
            j.setForeground(new Color(255, 51, 51));
            j.setText("La Provincia esta en uso");
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
