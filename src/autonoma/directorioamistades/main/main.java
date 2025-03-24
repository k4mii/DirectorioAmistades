
package autonoma.directorioamistades.main;

import autonoma.directorioamistades.models.DirectorioDeAmistades;
import autonoma.directorioamistades.views.VentanaPrincipal;



/**
 *
 * @author PABLO VI
 */
public class main {
    public static void main(String[] args) {
        
        DirectorioDeAmistades  directorio = new DirectorioDeAmistades();
        VentanaPrincipal ventana = new VentanaPrincipal(directorio);
        ventana.setVisible(true);
        


    }
}
