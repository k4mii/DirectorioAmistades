package autonoma.directorioamistades.models;

/**
 *
 * @author johan villada yu camila prada 
 * version 1.0.0
 * 3/24/25
 */
public class Amigo extends Persona {
    private String redSocial;
    public Amigo(String nombres, long telefono, String correoElectronico, String redSocial) {
        super(nombres, telefono, correoElectronico);
        this.redSocial = redSocial;
    } 

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }
    
    
    
    @Override
    public String toString(){
        return "Nombres: "+ getNombres()+
               "Telefono: "+ getTelefono()+
               "Correo Electronico :"+ getCorreoElectronico();
    }
}
