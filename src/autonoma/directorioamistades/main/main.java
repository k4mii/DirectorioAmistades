
package autonoma.directorioamistades.main;

import autonoma.directorioamistades.models.DirectorioDeAmistades;
import autonoma.directorioamistades.views.VentanaPrincipal;



/**
 *
  * @author johan villada
 * version 1.0.0
 * 3/23/25
 */
public class main {
    public static void main(String[] args) {
        
        DirectorioDeAmistades  directorio = new DirectorioDeAmistades();
        VentanaPrincipal ventana = new VentanaPrincipal(directorio);
        ventana.setVisible(true);
        


    }
}
