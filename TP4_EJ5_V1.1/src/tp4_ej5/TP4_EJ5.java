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
        Auto[] autos = {
            new AutoNaftero(),
            new AutoDiesel(),
            new AutoGNC()
        };

        for (Auto auto : autos) {
            auto.cargar(300);
            auto.recorrer(100);
            System.out.println("Combustible restante: " + String.format("%.2f", auto.getCombustible()));
            System.out.println("Kilómetros recorridos: " + String.format("%.2f", auto.getKm()));
            System.out.println("---------------");
        }
    }
}
