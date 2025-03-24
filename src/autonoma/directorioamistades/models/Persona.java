package autonoma.directorioamistades.models;

/**
 *
 * @author PABLO VI
 */
public abstract class  Persona {
    private String nombres;
    private int telefono;
    private String correoElectronico;

    public Persona(String nombres, int telefono, String correoElectronico) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    
    public String getNombres() {
        return nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
