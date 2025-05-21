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
public class Rectangulo extends Cuadrilatero {
    private double base;
    private double altura;
    
    //Constructores

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    
    
    //Getters

    @Override
    final public double getBase() {
        return base;
    }

    @Override
    final public double getAltura() {
        return altura;
    }
    
    //Setters

    @Override
    final public void setBase(double base) {
        this.base = base;
    }

    @Override
     final public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //AREA

 /*
    @Override
     public double area(){
        return base * altura;
    }
    
    //Perimetro
    @Override
    final public double perimetro(){
        return 2 * (base + altura);
    }
    
    //toString
    @Override
    final public String toString(){
        return String.format("Rectangulo de: Area: %.2f, Perimetro: %.2f",area(), perimetro());
    } */ //ESTO NO SE PUEDE HACER !!
}
