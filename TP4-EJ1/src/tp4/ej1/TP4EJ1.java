/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.ej1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author nicor
 */
public class TP4EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Figura> lista = new ArrayList();
        
        lista.add(new Rectangulo(10,20));
        lista.add(new Triangulo(10, 10, 10));
        lista.add(new Circulo(30));
        lista.add(new Triangulo(10, 20, 30));
        lista.add(new Rectangulo(30, 10));
        lista.add(new Triangulo(10, 20, 10));
        lista.add(new Circulo(10));
        lista.add(new Rectangulo(40, 40));
        lista.add(new Triangulo(12, 17, 21));
        lista.add(new Triangulo(3, 6, 8));
        // agregar 10 elementos
        
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i) instanceof Rectangulo){
                System.out.println("El elemento " + (i+1) + " es un RECTANGULO");
                System.out.println("Su area es: " + lista.get(i).area());
                System.out.println("Su perimetro es: " + lista.get(i).perimetro());
                Rectangulo r1 = (Rectangulo) lista.get(i);
                System.out.println(r1);
                System.out.println();
            
            }else if(lista.get(i) instanceof Triangulo){
                System.out.println("El elemento " + (i+1) + " es un TRIANGULO");
                System.out.println("Su area es: " + lista.get(i).area());
                System.out.println("Su perimetro es: " + lista.get(i).perimetro());
                Triangulo t1 = (Triangulo) lista.get(i);
                System.out.println(t1);
                System.out.println();
            
            }else if(lista.get(i) instanceof Circulo){
                System.out.println("El elemento " + (i+1) + " es un CIRCULO");
                System.out.println("Su area es: " + lista.get(i).area());
                System.out.println("Su perimetro es: " + lista.get(i).perimetro());
                Circulo c1 = (Circulo) lista.get(i);
                System.out.println(c1);
                System.out.println();
            }
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
