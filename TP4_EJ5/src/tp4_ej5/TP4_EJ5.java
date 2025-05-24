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
        
        System.out.println("AutoNaftero");
        System.out.println(c1);
        c1.cargar(300);
        c1.recorrer(100);
        System.out.println("Precio de Nafta: "+ String.format("%.2f",c1.precioUnidadCombustible()));
        double consu = c1.consumo(100);
        System.out.println("Consumo de combustible por 100km"+ String.format(" %.2f Lts",consu));
        System.out.println(c1);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("AutoDiesel");
        System.out.println(c2);
        c2.cargar(300);
        c2.recorrer(20);
        System.out.println("Precio de Diesel: "+ String.format("%.2f",c2.precioUnidadCombustible()));
        double consu2 = c2.consumo(100);
        System.out.println("Consumo de combustible por 100 km" + String.format(" %.2f Lts",consu2));
        System.out.println(c2);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("AutoGNC");
        System.out.println(c3);
        c3.cargar(300);
        c3.recorrer(20);
        System.out.println("Precio de GNC: "+ String.format("%.2f",c3.precioUnidadCombustible()));
        double consu3 = c3.consumo(100);
        System.out.println("Consumo de combustible por 100 km" + String.format(" %.2f Lts",consu3));
        System.out.println(c3);
    }
    
    
    
}
