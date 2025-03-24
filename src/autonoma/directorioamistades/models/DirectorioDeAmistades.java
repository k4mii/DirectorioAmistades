
package autonoma.directorioamistades.models;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author johan 
 */


public class DirectorioDeAmistades {
    private List<Amigo> amigos;

    public DirectorioDeAmistades() {
        this.amigos = new ArrayList<>();
    }

    public void agregarAmigo(Amigo a) {
        //Verificacion (? excepción (?
        amigos.add(a);
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

    public String verInfoAmigo(String correoElectronico) {
      for (Amigo a : amigos){
          if(a.getCorreoElectronico().equals(correoElectronico)){
              return a.toString();
          }
      }
      return "No encontrado";
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
           
}
