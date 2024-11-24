package Objetos;

public class Proveedor extends Persona {

    private String telefono, nProvincia, nCiudad;

    public Proveedor(String telefono, String nProvincia, String nCiudad, String nombre, String id, String direccion) {
        super(nombre, id, direccion);
        this.telefono = telefono;
        this.nProvincia = nProvincia;
        this.nCiudad = nCiudad;
    }

    public Proveedor(String telefono, String nCiudad, String nombre, String id, String direccion) {
        super(nombre, id, direccion);
        this.telefono = telefono;
        this.nCiudad = nCiudad;
    }
    
    

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getnProvincia() {
        return this.nProvincia;
    }

    public void setnProvincia(String nProvincia) {
        this.nProvincia = nProvincia;
    }

    public String getnCiudad() {
        return this.nCiudad;
    }

    public void setnCiudad(String nCiudad) {
        this.nCiudad = nCiudad;
    }

}
