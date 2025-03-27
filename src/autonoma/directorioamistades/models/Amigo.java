package autonoma.directorioamistades.models;

/**
 *
 * @author johan villada 
 * version 1.0.0
 * 3/24/25
 */
public class Amigo extends Persona {
    //Atributos
    private String redSocial;

    //Constructor
    public Amigo(String nombres, long telefono, String correoElectronico, String redSocial) {
        super(nombres, telefono, correoElectronico);
        this.redSocial = redSocial;
    } 

    // Getters & Setters
    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }
    
    
}
