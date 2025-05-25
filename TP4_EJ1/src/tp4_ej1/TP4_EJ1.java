
package tp4_ej1;

import java.util.ArrayList;

public class TP4_EJ1 {

    public static void main(String[] args) {
        
        ArrayList<Figura> lista = new ArrayList();
        
        lista.add(new Rectangulo(10, 20));
        lista.add(new Circulo (30));
        lista.add(new Triangulo(10, 20, 10));
        lista.add(new Rectangulo(17, 27));
        lista.add(new Circulo (40));
        lista.add(new Triangulo(11, 90, 18));
        lista.add(new Rectangulo(18, 46));
        lista.add(new Circulo (90));
        lista.add(new Triangulo(78, 23, 12));
        lista.add(new Rectangulo(35,25));
        
        for (int i=0; i<lista.size(); i++) {
            
            if (lista.get(i) instanceof Rectangulo rectangulo) {
                
                System.out.println("El Elemento [" + i + "] es Rectangulo");
                System.out.println("Su Area es: " + lista.get(i).Area());
                Rectangulo r = rectangulo;
                System.out.println(r);
                
            }
            
        }
        
    }
    
}
