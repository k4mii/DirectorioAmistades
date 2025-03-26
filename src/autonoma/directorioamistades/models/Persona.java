package autonoma.directorioamistades.models;

/**
 * @author johan villada yu camila prada 
 * version 1.0.0
 * 3/24/25
 */
public abstract class Persona {
    private String nombres;
    private long telefono;
    private String correoElectronico;

    public Persona(String nombres, long telefono, String correoElectronico) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    
    public String getNombres() {
        return nombres;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
