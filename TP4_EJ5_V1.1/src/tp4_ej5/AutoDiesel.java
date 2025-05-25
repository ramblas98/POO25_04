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
public class AutoDiesel extends Auto{
    private static final double precioDiesel = 155;

    @Override
    public void cargar(double importe) {
        double unidades = importe / precioDiesel;
        agregarCombustible(unidades);
        System.out.println("AutoDiesel cargó: " + String.format("%.2f", unidades) + " Lts");
    }

    @Override
    public void recorrer(double kilometros) {
        double necesario = consumo(kilometros);
        if (consumirCombustible(necesario)) {
            sumarKm(kilometros);
            System.out.println("AutoDiesel recorrió " + kilometros + " km.");
        } else {
            System.out.println("AutoDiesel no tiene suficiente combustible.");
        }
    }

    @Override
    public double consumo(double kilometros) {
        return (kilometros / 16.0) / 2.0;
    }

    @Override
    public double precioUnidadCombustible() {
        return precioDiesel;
    }
}
