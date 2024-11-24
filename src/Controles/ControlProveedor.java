package Controles;

import ConexionMySQL.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class ControlProveedor implements Controles_Palabra {

    private Conexion con = new Conexion();

    public Conexion getCon() {
        return this.con;
    }

    public void AgregarProveedor(String ruc, String nombre, String direccion, String telefono, String cCiudad, String cProv, JLabel j) throws SQLException {
        this.con.Conectar();
        if (this.ControlPalabra(ruc)) {
            if (this.ControlNombre(nombre)) {
                if (this.ControlDireccion(direccion)) {
                    if (this.ControlTelefono(telefono)) {
                        if (this.ControlCCiudad(cProv, cCiudad)) {
                            String columnas = "RUC ='" + ruc + "', nombre_apellido = '" + this.ControlSimbolos(nombre) + "', "
                                    + "telefono = '" + telefono + "', direccion = '" + this.ControlSimbolos(direccion) + "', "
                                    + "codigoCiudad='" + cCiudad + "';";
                            if (this.con.Insertar("proveedores", columnas) == 1) {
                                j.setForeground(new Color(255, 51, 51));
                                j.setText("Ingresar un RUC y codigo de ciudad validos");
                            } else {
                                j.setForeground(Color.green);
                                j.setText("Proveedor agregado con exito");
                            }
                        } else {
                            j.setForeground(new Color(255, 51, 51));
                            j.setText("CodigoCiudad inválido");
                        }
                    } else {
                        j.setForeground(new Color(255, 51, 51));
                        j.setText("Teléfono inválido ejemplo: (0987598197)");
                    }
                } else {
                    j.setForeground(new Color(255, 51, 51));
                    j.setText("Dirección invalida ejemplo: (Avenida Atahualpa)");
                }
            } else {
                j.setForeground(new Color(255, 51, 51));
                j.setText("Nombre Invalido ejemplo: (David Giler)");
            }
        } else {
            j.setForeground(new Color(255, 51, 51));
            j.setText("RUC invalido");
        }
    }

    public void ModificarProveedor(String nombre, String direccion, String telefono, String cCiudad, String ruc, String cProv, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            if (this.ControlNombre(nombre)) {
                if (this.ControlDireccion(direccion)) {
                    if (this.ControlTelefono(telefono)) {
                        if (this.ControlCCiudad(cProv, cCiudad)) {
                            String sql = "update proveedores set nombre_apellido='" + this.ControlSimbolos(nombre) + "', direccion='" + this.ControlSimbolos(direccion) + "', telefono ='" + telefono + "', "
                                    + "codigoCiudad ='" + cCiudad + "' where RUC='" + ruc + "';";
                            ps = this.con.getCon().prepareStatement(sql);
                            ps.executeUpdate();
                            j.setForeground(Color.green);
                            j.setText("Proveedor Modificado");
                        } else {
                            j.setForeground(new Color(255, 51, 51));
                            j.setText("CodigoCiudad inválido");
                        }
                    } else {
                        j.setForeground(new Color(255, 51, 51));
                        j.setText("Teléfono inválido ejemplo: (0987598197)");
                    }
                } else {
                    j.setForeground(new Color(255, 51, 51));
                    j.setText("direccion invalida ejemplo:(Avenida Atahualpa)");
                }
            } else {
                j.setForeground(new Color(255, 51, 51));
                j.setText("Nombre invalido ejemplo: (David Giler)");
            }
        } catch (Exception e) {
            j.setForeground(new Color(255, 51, 51));
            j.setText("Codigo de Ciudad invalido");
        }
    }

    public void EliminarProveedor(String ruc, JLabel j) {
        this.con.Conectar();
        PreparedStatement ps = null;
        try {
            String sql = "delete from proveedores where RUC='" + ruc + "';";
            ps = this.con.getCon().prepareStatement(sql);
            ps.executeUpdate();
            j.setForeground(Color.green);
            j.setText("Proveedor Eliminado");
        } catch (Exception e) {
            j.setForeground(new Color(255, 51, 51));
            j.setText("Proveedor en Uso");
        }
    }

    public boolean ControlTelefono(String telefono) {
        boolean comp = false;
        if (telefono.length() != 10) {
            return false;
        }
        if (!telefono.matches("\\d+")) {
            return false;
        }
        String primerosDigitos = telefono.substring(0, 2);
        if (!primerosDigitos.equals("09")) {
            return false;
        }
        return true;
    }

    public DefaultComboBoxModel GuardarProv() throws SQLException {
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        this.con.Conectar();
        PreparedStatement ps;
        this.con.SeleccionarTodo("provincias");
        ResultSet rs;
        rs = this.con.getRs();
        while (rs.next()) {
            String prov = rs.getString("codigoProvincia");
            dcb.addElement(prov);
        }
        return dcb;
    }

    public boolean ControlDireccion(String dire) {
        boolean comp = false;
        if (dire.matches("^[\\S]+\\s[\\S]+$")) {
            comp = true;
        } else {
            comp = false;
        }
        return comp;
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

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

    @Override
    public boolean ControlPalabra(String ruc) {
        boolean verf = false;
        // Verificar si el RUC tiene 13 dígitos
        if (ruc.length() != 13) {
            return verf;
        }

        // Verificar si el RUC es válido para personas naturales (cedula + 001)
        if (ruc.endsWith("001") && esNumerico(ruc.substring(0, 10)) && (validadorDeCedula(ruc.substring(0, 10))) == true) {
            verf = true;
            return verf;
        }

        // Verificar si el RUC es válido para sociedades privadas y extranjeros no residentes
        if (esNumerico(ruc.substring(0, 2)) && ruc.charAt(2) == '9' && esNumerico(ruc.substring(3, 9)) && esNumerico(ruc.substring(9, 10)) && ruc.endsWith("001")) {
            verf = true;
            return verf;
        }

        // Verificar si el RUC es válido para sociedades públicas
        if (esNumerico(ruc.substring(0, 2)) && ruc.charAt(2) == '6' && esNumerico(ruc.substring(3, 8)) && esNumerico(ruc.substring(8, 9)) && ruc.charAt(9) == '0' && ruc.endsWith("001")) {
            verf = true;
            return verf;
        }

        return verf;
    }

    public boolean esNumerico(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
