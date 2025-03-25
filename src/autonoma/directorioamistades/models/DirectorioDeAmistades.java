
package autonoma.directorioamistades.models;
import autonoma.directorioamistades.exceptions.AmigoNoEncontradoException;
import autonoma.directorioamistades.exceptions.AmigoduplicadoException;
import autonoma.directorioamistades.exceptions.CorreoInvalidoException;
import autonoma.directorioamistades.exceptions.DatosObligatoriosException;
import autonoma.directorioamistades.exceptions.TelefonoInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author johan 
 */


public class DirectorioDeAmistades {
    private ArrayList <Amigo> amigos;

    public DirectorioDeAmistades() {
        this.amigos = new ArrayList<>();
    }

    
///////////////////////////////////////////////////////////////////////
    ///Metodo mostrar libros
    public ArrayList<Amigo> getAmigos(){
        return this.amigos;
    }
    
    
    public boolean agregarAmigo(Amigo a)  throws AmigoduplicadoException, DatosObligatoriosException, CorreoInvalidoException, TelefonoInvalidoException  {
    
    if (a.getNombres().isEmpty() || a.getCorreoElectronico().isEmpty() || String.valueOf(a.getTelefono()).isEmpty()) {
        throw new DatosObligatoriosException();
    }
    
    if (a.getCorreoElectronico().indexOf("@") == -1) {
        throw new CorreoInvalidoException();
    }

    String telefonoStr = String.valueOf(a.getTelefono());
    if (!(telefonoStr.startsWith("606") || telefonoStr.startsWith("30"))) {
        throw new TelefonoInvalidoException();
    }

    for (Amigo amigoExistente : amigos) {
        if (amigoExistente.getCorreoElectronico().equals(a.getCorreoElectronico())) {
            throw new AmigoduplicadoException();
        }
    }
    
    amigos.add(a);
    return true;
    }

    
///////////////////////////////////////////////////////////////////////
///Metodo actualizar libro por id
    public boolean actualizarAmigo(Amigo amigo, String correo) {
        int indice = this.buscarIndiceAmigo(correo);
        if(indice >= 0){
            this.amigos.set(indice, amigo);
            return true;
        }
        return false; 
    }
    
    public Amigo buscarAmigo(String correo) throws AmigoNoEncontradoException {

        for (Amigo a : amigos) {
            if (a.getCorreoElectronico().equals(correo)) {
                return a;
            }
        }
        throw new AmigoNoEncontradoException();
    }

    public boolean eliminarAmigo(String correoElectronico) throws AmigoNoEncontradoException{
       for(int i = 0; i < amigos.size(); i++){
           if (amigos.get(i).getCorreoElectronico().equals(correoElectronico)){
                amigos.remove(i);
                return true;
            }
        }
          throw new AmigoNoEncontradoException();
    }
          
    
    private int buscarIndiceAmigo(String correo) {
    for (int i = 0; i < amigos.size(); i++) {
        if (amigos.get(i).getCorreoElectronico().equals(correo)) {
            return i; 
        }
    }
    return -1; 
}

}
