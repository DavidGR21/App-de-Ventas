package Controles;

import ConexionMySQL.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JLabel;

public class ControlCiudades implements Controles_Palabra {

    private Conexion con = new Conexion();

    public Conexion getCon() {
        return this.con;
    }

    public void AgregarCiudad(String codigo, String nombre, String cprovincia, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ControlPalabra(codigo)) {
            String columnas = ("codigoCiudad='" + this.ControlSimbolos(codigo) + "', nombreCiudad='" + this.ControlSimbolos(nombre) + "', codigoProvincia='" + cprovincia + "';");
            if (this.con.Insertar("ciudades", columnas) == 1) {
                j.setForeground(new Color(255, 51, 51));
                j.setText("Codigo de Provincia invalido");
            } else {
                j.setForeground(Color.green);
                j.setText("Ciudad Creada");
            }
        } else {
            j.setForeground(new Color(255, 51, 51));
            j.setText("Codigo Invalido, ejemplo valido: (CU001)");
        }

    }

    public void ModificarCiudad(String nombre, String codigoP, String codigo, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "update ciudades set nombreCiudad='" + this.ControlSimbolos(nombre) + "', codigoProvincia='" + codigoP + "' where codigoCiudad='" + this.ControlSimbolos(codigo) + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("Ciudad Modificada");
        } catch (Exception e) {
            j.setForeground(new Color(255, 51, 51));
            j.setText("Codigo de Provincia invalido");
        }
    }

    public void Eliminar(String codigo, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "delete from ciudades where codigoCiudad='" + this.ControlSimbolos(codigo) + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("Ciudad Eliminada");
        } catch (Exception e) {
            j.setForeground(new Color(255, 51, 51));
            j.setText("Ciudad en Uso");
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
