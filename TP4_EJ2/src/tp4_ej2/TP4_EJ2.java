
package tp4_ej2;

import java.util.ArrayList;

public class TP4_EJ2 {

    public static void main(String[] args) {
        
        ArrayList<Entrenamiento> lista = new ArrayList();
        
        lista.add(new BoxeoVirtual("CarlosPower"));
        lista.add(new ZumbaGalactica("LuciaDance"));
        lista.add(new LevantamientoDeComida("RamiroSnack"));
        
        for (int i=0; i<lista.size(); i++) {
            
            lista.get(i).Realizar();
            
        }
        
    }
    
}
