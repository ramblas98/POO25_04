/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej1;

/**
 *
 * @author Administrador
 */
public abstract class Circulo extends Figura {
    private double radio;
    
    //Constructores

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //Getters

    final public double getRadio() {
        return radio;
    }
    
    //Setters

    final public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Area
    @Override
    final public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
 
    //Perimetro
    @Override
    final public double perimetro(){
        double diametro = 2*radio;
        
        return diametro * Math.PI;
    }
    
    //toString
    @Override
    final public String toString(){
        return String.format("Circulo de : Radio: %.2f, Area: %.2f, Perimetro: %.2f", radio,area(),perimetro());
    }
}
