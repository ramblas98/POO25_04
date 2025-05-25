
package tp4_ej3;

import java.util.ArrayList;

public class TP4_EJ3 {

    public static void main(String[] args) {
        
        ArrayList<Figura> lista = new ArrayList();
        
        lista.add(new Cuadrilatero(20, 40));
        lista.add(new Rectangulo(10, 20));
        lista.add(new Cuadrado(60, 90));
        lista.add(new Circulo(20.8));
        lista.add(new Triangulo(20, 20, 80));
        
        
        for (int i=0; i<lista.size(); i++) {
            
            if (lista.get(i) instanceof Rectangulo rectangulo) {
                
                System.out.println("El Elemento [" + i + "] es Rectangulo");
                System.out.println("Su Area es: " + lista.get(i).Area());
                System.out.println("Su Perimetro es: " + lista.get(i).Perimetro());
                Rectangulo r = rectangulo;
                System.out.println(r);
                
            }
            
        }
        
    }
    
}
