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
public class AutoGNC extends Auto{
    private final double precioGNC = 70;
    
    //Constructor
    
    public AutoGNC(double combustible, double km) {
        super(combustible, km);
    }

    //Constructor sin parametro
    public AutoGNC() {
    }
    
    //GETTER

    public double getPrecioGNC() {
        return precioGNC;
    }
    
    //Precio de combustible
    @Override
    final public double precioUnidadCombustible(){
        return precioGNC;
    }
    
    //CARRGAR
    @Override
    final public void cargar(double importe){
        double nuevoImporte = importe/precioGNC;
        combustible += nuevoImporte;
        System.out.println("Por "+ importe +"$"+" Al vehiculo se le cargó: "+ String.format("%.2f",nuevoImporte) + "Lts");
    }
    
    //SONSUMO
    @Override
    final public double consumo(double kilometraje){
        return (kilometraje/16.0) / 3.0; //Un tercio del consumo de Auto [DEVUELVE LITROS]
    }
    //RECORRER
    @Override
    final public void recorrer(double kilometraje){
        
        if(km >= 100.0){ //verifico que el kilometraje no exceda los 100 km
            System.out.println("No se puede realizar el recorrido, Kilometraje exedido");
        } else{
            km+= kilometraje; //Incremento kilometraje
            double necesario = consumo(kilometraje); //Calculo el consumo [DEVUELVE LITROS]
            combustible-=necesario; //Decremento el combustible
            
            if(combustible < consumo(20)){  //Pregunto si el combustible restante es insuficiente para recorrer por lo menos 20 km mas                                           
                 System.out.println("Combustible suficiente para recorrer 20 Km");
            } else System.out.println("Combustible INSUFICIENTE para recorrer 20 Km");
        }
        
      
    }
    
    //toString

    @Override
    public String toString() {
        return String.format("Combustible disponible: %.2f, Km recorridos: %.2f", combustible, km);
    }
    
}
