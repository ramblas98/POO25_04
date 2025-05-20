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
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    //Constructores

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    //Setters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //AREA
    @Override
    public double area(){
        return base * altura;
    }
    
    //Perimetro
    @Override
    public double perimetro(){
        return 2 * (base + altura);
    }
    
    //toString
    @Override
    public String toString(){
        return String.format("Rectangulo de: Area: %.2f, Perimetro: %.2f",area(), perimetro());
    }
}
