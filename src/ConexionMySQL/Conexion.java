package ConexionMySQL;

import Almacen.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

    private String user, clave;
    private static final String url = config("DB_URL", "jdbc:mysql://localhost:3306/proyecto");
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private Arrays ar = new Arrays();

    public PreparedStatement getPs() {
        return this.ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return this.rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Arrays getAr() {
        return this.ar;
    }

    public void setAr(Arrays ar) {
        this.ar = ar;
    }

    public Connection getCon() {
        return this.con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    /** Lee la variable de entorno o, si no existe, el archivo .env del directorio de trabajo. */
    private static String config(String clave, String porDefecto) {
        String valor = System.getenv(clave);
        if (valor != null) {
            return valor;
        }
        java.io.File env = new java.io.File(".env");
        if (env.exists()) {
            try {
                for (String linea : java.nio.file.Files.readAllLines(env.toPath())) {
                    linea = linea.trim();
                    if (linea.startsWith(clave + "=")) {
                        return linea.substring(clave.length() + 1).trim();
                    }
                }
            } catch (java.io.IOException e) {
                System.out.println("No se pudo leer .env");
            }
        }
        return porDefecto;
    }

    public void Conectar() {
        con = null;
        setUser(config("DB_USER", "root"));
        setClave(config("DB_PASSWORD", ""));
        try {
            Class.forName(driver);
            DriverManager.setLoginTimeout(2);
            con = (Connection) DriverManager.getConnection(url, getUser(), getClave());
            if (con != null) {
                System.out.println("Correcta Respuesa de Conexion");
            } else {
                System.out.println("No se conecto");
            }
        } catch (Exception e) {
            con = null;
            System.out.println("Error de conexion");
        }
    }

    public boolean BuscarConexion() {
        boolean a = false;
        this.Conectar();
        if (con == null) {
            a = true;
        }
        return a;
    }

    public void SeleccionarTodo(String tabla) throws SQLException {
        this.Conectar();
        if (this.BuscarConexion()) {

        } else {
            ps = con.prepareStatement("select * from " + tabla);
            this.rs = ps.executeQuery();
        }
    }

    public boolean SeleccionarPermisos(String tabla, String usuario, String permiso) throws SQLException {
        boolean per = false;
        this.Conectar();
        this.ps = con.prepareStatement("select * from " + tabla + " where usuario='" + this.ControlSimbolos(usuario) + "' and " + permiso + "=" + 1 + ";");
        this.rs = ps.executeQuery();
        if (this.rs.next()) {
            per = true;
        }
        return per;
    }

    public void SubSeleccion(String nombreColumna, String tabla, String n1, String n2, String tabla2, String nombreNuevaColumna) throws SQLException {
        this.Conectar();
        ps = con.prepareStatement("select *,\n"
                + "(select " + nombreColumna + " from " + tabla + " where " + n1 + "=" + n2 + ")as " + nombreNuevaColumna + "\n"
                + "from " + tabla2 + ";");
        this.rs = ps.executeQuery();
    }

    public int Insertar(String tabla, String columnas) throws SQLException {
        this.Conectar();
        int controlador = 0;
        try {
            Statement st = con.createStatement();
            st.executeUpdate("insert into " + tabla + " set " + columnas);
        } catch (SQLException ex) {
            controlador = 1;
        }
        return controlador;
    }
    
    public void Actualizar(String tabla, String columna, int dato, String ubi, String codigo) throws SQLException {
        this.Conectar();
        Statement st = con.createStatement();
        st.executeUpdate("update " + tabla + " set " + columna + "='" + dato + "' where " + ubi + "='" + codigo + "';");
    }

    public void Desconectar() throws SQLException {
        this.con.close();
//        System.out.println("Desconectado");
    }

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
}
