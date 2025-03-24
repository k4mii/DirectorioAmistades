package autonoma.directorioamistades.models;

/**
 *
 * @author johan villada yu camila prada 
 * version 1.0.0
 * 3/24/25
 */
public class Amigo extends Persona {
    public Amigo(String nombres, int telefono, String correoElectronico) {
        super(nombres, telefono, correoElectronico);
    } 
    
    @Override
    public String toString(){
        return "Nombres: "+ getNombres()+
               "Telefono: "+ getTelefono()+
               "Correo Electronico :"+ getCorreoElectronico();
    }
}
