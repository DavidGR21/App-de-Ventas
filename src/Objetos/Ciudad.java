package Objetos;

public class Ciudad extends Lugar {

    private String codigoProvincia;
    private String nombreProvincia;

    public Ciudad(String codigoProvincia, String nombreProvincia, String codigo, String nombre) {
        super(codigo, nombre);
        this.codigoProvincia = codigoProvincia;
        this.nombreProvincia = nombreProvincia;
    }

    public String getCodigoProvincia() {
        return this.codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNombreProvincia() {
        return this.nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

}
