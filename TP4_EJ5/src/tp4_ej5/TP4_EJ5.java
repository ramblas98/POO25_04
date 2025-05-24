/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej5;

/**
 *
 * @author Administrador
 */
public class TP4_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto c1 = new AutoNaftero(20,128); //Le asigno km y combustible previo
        Auto c2 = new AutoDiesel(10,10);
        Auto c3 = new AutoGNC(10,10);
        
        c1.cargar(300);
        c1.recorrer(100);
        double consu = c1.consumo(300);
        System.out.println("Consumo de combustible por 100km"+ String.format(" %.2f Lts",consu));
        System.out.println(c1);
        
        System.out.println("-----------------------------");
        
        c2.cargar(300);
        c2.recorrer(20);
        double consu2 = c2.consumo(300);
        System.out.println("Consumo de combustible por 100 km" + String.format(" %.2f Lts",consu2));
        System.out.println(c2);
        
        System.out.println("-----------------------------");
        
        c3.cargar(300);
        c3.recorrer(20);
        double consu3 = c3.consumo(300);
        System.out.println("Consumo de combustible por 100 km" + String.format(" %.2f Lts",consu3));
        System.out.println(c3);
    }
    
    
    
}
