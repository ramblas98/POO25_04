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
 abstract class Auto {
     protected double combustible;
     protected double km;
     
     
    //Constructores
    public Auto(double combustible, double km) {
        this.combustible = combustible;
        this.km = km;
    }

    public Auto() {
    }
    
    //GETTERS

    public double getCombustible() {
        return combustible;
    }

    public double getKm() {
        return km;
    }
    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    //SETTERS
    public void setKm(double km) {
        this.km = km;
    }
    
    //CARGAR
    public abstract void cargar(double importe);
    
    //RECORRER
    abstract public void recorrer(double kilometraje);
    
    //CONSUMO
    abstract public double consumo(double kilometraje);
    
    //PRECIO UNIDAD COMBUSTIBLE
    abstract public double precioUnidadCombustible();
    
    //ToString

    @Override
    public String toString() {
        return "Auto{" + "combustible=" + combustible + ", km=" + km + '}';
    }
    
}
