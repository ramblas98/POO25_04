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
    private final double precioDiesel = 155;
    
    //Constructor

    public AutoDiesel(double combustible, double km) {
        super(combustible, km);
    }
    
    
    //CONSTRUCTOR SIN PARAMETRO
    public AutoDiesel() {
    }
    
    //CARGAR
    @Override
    final public void cargar(double importe){
        double litros = importe/precioDiesel; //Calculo la cantidad de litros que compro con el importe
        combustible += litros; //Incremento la cantidad de combustible
        System.out.println("Por "+ importe +"$"+" Al vehiculo se le cargó: "+ String.format("%.2f",litros) + " Lts");
    }
    
    //RECORRER
    @Override
    final public void recorrer(double kilometraje){
        
        km += kilometraje; //Incremento los kilometros del vehiculo
        
        double necesario = consumo(kilometraje); //DISMINUYO EL COMBUSTIBLE
        this.combustible -= necesario;
        
        System.out.println("Se incremento: "+ kilometraje + " Km");
        System.out.println("Se decremento: "+ necesario + " Lts");
    }
    
    //CONSUMO
    @Override
    final public double consumo(double kilometraje){
        return (kilometraje/16)/2.0; //La mitad de consumo de Auto [DEVUELVE LITROS]
    }
    
    //PRECIO COMBISTIBLE
    @Override
    final public double precioUnidadCombustible(){
        return precioDiesel;
    }
    
    //ToString
    @Override
    public String toString() {
        return String.format("Nafta disponible: %.2f, Km recorrido: %.2f", this.combustible, this.km);
    }
    
    
}
