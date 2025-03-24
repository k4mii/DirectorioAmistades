
package autonoma.directorioamistades.models;
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
    
    
    public void agregarAmigo(Amigo a) {
        //Verificacion (? excepción (?
        amigos.add(a);
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
    
    public Amigo buscarAmigo(String correo) {
        //Excepción (?
        for (Amigo a : amigos) {
            if (a.getCorreoElectronico().equals(correo)) {
                return a;
            }
        }
        return null;
    }

    public boolean eliminarAmigo(String correoElectronico) {
       for(int i = 0; i < amigos.size(); i++){
           if (amigos.get(i).getCorreoElectronico().equals(correoElectronico)){
                amigos.remove(i);
                return true;
            }
        }
        return false;
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
