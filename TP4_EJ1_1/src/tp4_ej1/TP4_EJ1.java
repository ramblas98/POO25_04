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
        lista.add(new Rectangulo(10,20) {});
        lista.add(new Triangulo(10,10,10) {});
        lista.add(new Circulo(30) {});
        
        for (int i = 0; i < 10; i++) {
            int choice = (int)(Math.random() * 3); // 0, 1 o 2 para las 3 subclases
            switch (choice) {
                case 0:
                    // Generar dimensiones aleatorias (ejemplo: entre 1 y 10)
                    lista.add(new Rectangulo(Math.random() * 10 + 1, Math.random() * 10 + 1) {});
                    break;
                case 1:
                    lista.add(new Triangulo(Math.random() * 10 + 1, Math.random() * 10 + 1,Math.random() * 10 + 1) {});
                    break;
                case 2:
                    lista.add(new Circulo(Math.random() * 10 + 1) {});
                    break;
            }
        }
        //Mostrando
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Triangulo ){
                Triangulo tri = (Triangulo) lista.get(i);
                
                //Verifico el tipo de triangulo
                if(Triangulo.equilatero(tri)){
                    System.out.println("Es equilatero");
                }else if(Triangulo.escaleno(tri)){
                    System.out.println("Es Escaleno");
                } else System.out.println("Es Isoseles");
            }
        }
        /*for(int i = 0 ; i<lista.size(); i++){
            if(lista.get(i) instanceof Rectangulo){
               System.out.println("El elemento " + i + "Es un rectangulo");
               System.out.println("Su area es " + lista.get(i).area());
            } else{
                if(lista.get(i) instanceof Triangulo){
                  System.out.println("El elemento " + i + "Es un Triangulo");
                  System.out.println("Su area es " + lista.get(i).area());
                } else{
                  System.out.println("El elemento " + i + " es un Círculo");
                  System.out.println(lista.get(i)); // Llama a toString() automáticamente
                }
            } 
        } */
    }
    
}
