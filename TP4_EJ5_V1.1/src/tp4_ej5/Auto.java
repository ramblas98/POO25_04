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
    private double combustible;
    private double km;

    protected void agregarCombustible(double unidades) {
        this.combustible += unidades;
    }

    protected boolean consumirCombustible(double unidades) {
        if (combustible >= unidades) {
            combustible -= unidades;
            return true;
        }
        return false;
    }

    protected void sumarKm(double kms) {
        this.km += kms;
    }

    protected double getCombustible() {
        return combustible;
    }

    protected double getKm() {
        return km;
    }

    public abstract void cargar(double importe);
    public abstract void recorrer(double kilometros);
    public abstract double consumo(double kilometros);
    public abstract double precioUnidadCombustible();
    
}
