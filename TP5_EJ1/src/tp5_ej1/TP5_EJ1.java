/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_ej1;
import java.util.ArrayList;/**
 *
 * @author Administrador
 */
public class TP5_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Rentable> lista = new ArrayList();
        
        lista.add(new Inmueble("Pasaje Belgrano", "Monoambiente", 127,0));
        lista.add(new Inmueble("Avenida Güemes", "Departamento", 500,0));
        
        lista.add(new Disfraz("Batman", 'M', 2,1500));
        lista.add(new Disfraz("Iron Man", 'L', 5,2000));
        
        for(Rentable obj: lista){
            System.out.println("Periodo a alquilar: ");
            obj.alquilar(2);
            
        }
        
    }
    
}
