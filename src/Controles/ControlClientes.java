package Controles;

import ConexionMySQL.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class ControlClientes implements Controles_Palabra {

    private Conexion con = new Conexion();

    public Conexion getCon() {
        return this.con;
    }

    public void AgregarCliente(String cedula, String nombre_apellido, String direccion, String cCiudad, String cProv, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ControlPalabra(cedula)) {
            if (this.ControlNombre(nombre_apellido)) {
                if (this.ControlDireccion(direccion)) {
                    if (this.ControlCCiudad(cProv, cCiudad)) {
                        String columnas = "cedula ='" + cedula + "', nombre_apellido = '" + this.ControlSimbolos(nombre_apellido) + "', direccion ='" + this.ControlSimbolos(direccion) + "', codigoCiudad ='" + cCiudad + "';";
                        if (this.con.Insertar("clientes", columnas) == 1) {
                            j.setForeground(Color.white);
                            j.setText("INGRESE UNA CEDULA Y CODIGO DE CIUDAD VALIDOS");
                        } else {
                            j.setForeground(Color.green);
                            j.setText("Cliente añadido exitosamente");
                        }
                    } else {
                        j.setForeground(Color.white);
                        j.setText("CODIGO CIUDAD INVALIDO");
                    }
                } else {
                    j.setForeground(Color.white);
                    j.setText("DIRECCION INVALIDA EJEMPLO:(Ambato Calle dos)");
                }
            } else {
                j.setForeground(Color.white);
                j.setText("NOMBRE INVALIDO EJEMPLO: (David Giler)");
            }
        } else {
            j.setForeground(Color.white);
            j.setText("CEDULA INVALIDA");
        }
    }

    public void ModificarClientes(String nombre, String direccion, String cCiudad, String cedula, String cProv, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            if (this.ControlNombre(nombre)) {
                if (this.ControlDireccion(direccion)) {
                    if (this.ControlCCiudad(cProv, cCiudad)) {
                        String sql = "update clientes set nombre_apellido='" + this.ControlSimbolos(nombre) + "', direccion='" + this.ControlSimbolos(direccion) + "', codigoCiudad ='" + cCiudad + "' where cedula='" + cedula + "';";
                        ps = this.con.getCon().prepareStatement(sql);
                        ps.executeUpdate();
                        j.setForeground(Color.green);
                        j.setText("Cliente Modificado");
                    } else {
                        j.setForeground(Color.white);
                        j.setText("CODIGO CIUDAD INVALIDO");
                    }
                } else {
                    j.setForeground(Color.white);
                    j.setText("DIRECCION INVALIDA EJEMPLO:(Ambato Calle dos)");
                }
            } else {
                j.setForeground(Color.white);
                j.setText("NOMBRE INVALIDO EJEMPLO: (David Giler)");
            }
        } catch (Exception e) {
            j.setForeground(Color.white);
            j.setText("CODIGO DE CIUDAD INVALIDO");
        }
    }

    public void EliminarClientes(String cedula, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "delete from clientes where cedula='" + cedula + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("Cliente Eliminado");
        } catch (Exception e) {
            j.setForeground(Color.white);
            j.setText("CLIENTE EN USO");
        }
    }

    public boolean ControlNombre(String nombre) {
        boolean comp = false;
        if (nombre.matches("^[\\S]+\\s[\\S]+$")) {
            comp = true;
        } else {
            comp = false;
        }
        return comp;
    }

    public boolean ControlDireccion(String dire) {
        boolean comp = false;
        if (dire.matches("^[\\S]+\\s[\\S]+\\s[\\S]+$")) {
            comp = true;
        } else {
            comp = false;
        }
        return comp;
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

    public DefaultComboBoxModel GuardarProv() throws SQLException {
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        this.con.Conectar();
        this.con.SeleccionarTodo("provincias");
        ResultSet rs;
        rs = this.con.getRs();
        while (rs.next()) {
            String prov = rs.getString("codigoProvincia");
            dcb.addElement(prov);
        }
        return dcb;
    }

    public boolean ControlCCiudad(String cProv, String cCiudad) throws SQLException {
        boolean a = false;
        this.con.Conectar();
        PreparedStatement ps;
        ResultSet rs;
        ps = this.con.getCon().prepareStatement("select codigoProvincia from ciudades where codigoCiudad = '" + cCiudad + "';");
        rs = ps.executeQuery();
        while (rs.next()) {
            if (rs.getString("codigoProvincia").equals(cProv)) {
                a = true;
            }
        }
        return a;
    }

    @Override
    public boolean ControlPalabra(String cedula) {
        boolean comp = false;
        if (cedula.matches("[0-9]{10}")) {
            // Obtener los dígitos de la cédula
            int[] digitos = new int[10];
            for (int i = 0; i < 10; i++) {
                digitos[i] = Integer.parseInt(String.valueOf(cedula.charAt(i)));
            }

            // Validar el último dígito de verificación
            int suma = 0;
            for (int i = 0; i < 9; i++) {
                int digito = digitos[i];
                if (i % 2 == 0) {
                    digito *= 2;
                    if (digito > 9) {
                        digito -= 9;
                    }
                }
                suma += digito;
            }
            int verificacion = 10 - (suma % 10);
            if (verificacion == 10) {
                verificacion = 0;
            }

            return verificacion == digitos[9];
        } else {
            comp = false;
        }
        return comp;
    }

}
