/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej2;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class TP4_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Entrenamiento> lista = new ArrayList();
        lista.add(new BoxeoVirtual("User223") {});
        lista.forEach((lis) -> {
            lis.realizar();
        });
        
    }
    
}
