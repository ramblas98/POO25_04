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
    
    private final double precioNafta = 127;
    
    
    
    
    //CONSTRUCTOR
    public AutoNaftero(double combustible, double km) {
        super(combustible, km);
    }
    
    //CONSTRUCTOR SIN PARAMETRO
    public AutoNaftero() {
    }
    
    
    //GETTERS

    public double getPrecioNafta() {
        return precioNafta;
    }
    
    //PRECIO POR UNIDAD DE COMBUSTIBLE
    @Override
    final public double precioUnidadCombustible(){
        return precioNafta;
    }
    
    
    //CARGAR
    @Override
    final public void cargar(double importe){
        double nuevoImporte = importe * 1.1; //AUMENTO PROMO "Mundial 2022"
        this.combustible += nuevoImporte/precioNafta;
        System.out.println("Por "+ importe +"$"+ " Al vehiculo se le cargó: " + String.format("%.2f", nuevoImporte / precioNafta) + " Lts");
    }
    
    //CONSUMO
    @Override
    final public double consumo(double kilometraje){
        return kilometraje/16;
    }
    
    //RECORRER
    @Override
    public void recorrer(double kilometros) {
        double necesario = consumo(kilometros);
        if (combustible >= necesario) { //ANALIZO SI EL VEHICULO TIENE SUFICIENTE COMBUSTIBLE
            combustible -= necesario;
            km += kilometros;
            System.out.println("Se incrementó los: " + kilometros + " km.");
        } else {
            System.out.println("Insuficiente combustible para recorrer " + kilometros + " km");
        }
    }
    
    //ToString
    @Override
    public String toString() {
        return String.format("Nafta disponible: %.2f, Km recorrido: %.2f", this.combustible, this.km);
    }
}
