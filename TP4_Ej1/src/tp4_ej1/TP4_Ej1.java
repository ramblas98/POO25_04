package tp4_ej1;

import java.util.ArrayList;


public class TP4_Ej1 {

    
    public static void main(String[] args) {
        
        ArrayList<Figura> lista = new ArrayList();
        
        lista.add(new Rectangulo(10,20));
        lista.add(new Triangulo(10,10,10));
        lista.add(new Circulo(30));
        lista.add(new Triangulo(20,20,30));
        lista.add(new Triangulo(10,20,30));
        lista.add(new Cuadrado(20));
        lista.add(new Circulo(25));
        lista.add(new Rectangulo(30,40));
        lista.add(new Triangulo(30,30,30));
        lista.add(new Cuadrado(50));
        
        for(int i=0;i<lista.size();i++){
            if(lista.get(i) instanceof Rectangulo){
                if(lista.get(i) instanceof Cuadrado) System.out.println("Es un cuadrado");
                else System.out.println("Es un rectangulo");
            }
            if(lista.get(i) instanceof Triangulo) System.out.println("Es un triangulo");
            if(lista.get(i) instanceof Circulo) System.out.println("Es un circulo");
            
            System.out.println(lista.get(i).area());
        }
        
    }
    
}
