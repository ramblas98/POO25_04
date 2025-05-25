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
public class AutoNaftero extends Auto {
    private static final double precioNafta = 127;

    @Override
    public void cargar(double importe) {
        double importeConPromo = importe * 1.10;
        double unidades = importeConPromo / precioNafta;
        agregarCombustible(unidades);
        System.out.println("AutoNafta cargó: " + String.format("%.2f", unidades) + " Lts");
    }

    @Override
    public void recorrer(double kilometros) {
        double necesario = consumo(kilometros);
        if (consumirCombustible(necesario)) {
            sumarKm(kilometros);
            System.out.println("AutoNafta recorrió " + kilometros + " km.");
        } else {
            System.out.println("AutoNafta no tiene suficiente combustible.");
        }
    }

    @Override
    public double consumo(double kilometros) {
        return kilometros / 16.0;
    }

    @Override
    public double precioUnidadCombustible() {
        return precioNafta;
    }
}