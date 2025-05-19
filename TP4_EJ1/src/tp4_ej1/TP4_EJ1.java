/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej1;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class TP4_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> lista = new ArrayList();
        lista.add(new Rectangulo(10,20));
        lista.add(new Triangulo(10,10,10));
        //lista.add(new Circulo(10,20));
        
        for(int i = 0 ; i<lista.size(); i++){
            if(lista.get(i) instanceof Rectangulo){
               System.out.println("El elemento " + i + "Es un rectangulo");
               System.out.println("Su area es " + lista.get(i).area());
            }
        }
    }
    
}
