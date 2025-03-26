
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
    ///Metodo mostrar amigos
    public ArrayList<Amigo> getAmigos(){
        return this.amigos;
    }
    
///////////////////////////////////////////////////////////////////////
    ///Metodo ageregar Amigo    
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
///Metodo actualizar amigo 
    public boolean actualizarAmigo(Amigo amigo, String correo) throws CorreoInvalidoException, TelefonoInvalidoException, AmigoNoEncontradoException {
        int indice = this.buscarIndiceAmigo(correo);
        
        if (amigo.getCorreoElectronico().indexOf("@") == -1) {
            throw new CorreoInvalidoException();
        }

        String telefonoStr = String.valueOf(amigo.getTelefono());
        if (indice == -1) {
            throw new AmigoNoEncontradoException();
        }
        // se  verifica que el nuevo correo no pertenezca a otro amigo
        for (int i = 0; i < amigos.size(); i++) {
            if (i != indice && amigos.get(i).getCorreoElectronico().equals(amigo.getCorreoElectronico())) {
                throw new AmigoduplicadoException();
            }
        }
    // Verifica que el numero solo tenga digitos y tenga 10 dígitos y empiece con 30 o 606
        if (!telefonoStr.matches("^(30\\d{8}|606\\d{7})$")) {  
            throw new TelefonoInvalidoException();
        }
        this.amigos.set(indice, amigo);
        return true; 
    }
///////////////////////////////////////////////////////////////////////
    ///Metodo buscar amigo
    public Amigo buscarAmigo(String correo) throws AmigoNoEncontradoException, CorreoInvalidoException {
    ///Se hace una validacion para comprobar si tiene o no el "@"
        if (correo.indexOf("@") == -1) {
           throw new CorreoInvalidoException();
       }

       for (Amigo a : amigos) {
           if (a.getCorreoElectronico().equals(correo)) {
               return a;
           }
       }
       throw new AmigoNoEncontradoException();
   }

///////////////////////////////////////////////////////////////////////
    ///Metodo eliminar amigo
    public boolean eliminarAmigo(String correoElectronico) throws AmigoNoEncontradoException{
       for(int i = 0; i < amigos.size(); i++){
           if (amigos.get(i).getCorreoElectronico().equals(correoElectronico)){
                amigos.remove(i);
                return true;
            }
        }
          throw new AmigoNoEncontradoException();
    }
          
///////////////////////////////////////////////////////////////////////
    ///Metodo privado para encontrar la posición del amigo en la lista.
    private int buscarIndiceAmigo(String correo) {
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreoElectronico().equals(correo)) {
                return i; 
            }
        }
        return -1; 
    }

}
