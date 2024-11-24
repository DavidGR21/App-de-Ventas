package Objetos;

public class Cliente extends Persona {

    private String nCiudad;
    private String nProvincia;

    public Cliente(String nCiudad, String nProvincia, String nombre, String id, String direccion) {
        super(nombre, id, direccion);
        this.nCiudad = nCiudad;
        this.nProvincia = nProvincia;
    }

    public Cliente(String nCiudad, String nombre, String id, String direccion) {
        super(nombre, id, direccion);
        this.nCiudad = nCiudad;
    }

    public String getnCiudad() {
        return this.nCiudad;
    }

    public void setnCiudad(String nCiudad) {
        this.nCiudad = nCiudad;
    }

    public String getnProvincia() {
        return this.nProvincia;
    }

    public void setnProvincia(String nProvincia) {
        this.nProvincia = nProvincia;
    }

}
