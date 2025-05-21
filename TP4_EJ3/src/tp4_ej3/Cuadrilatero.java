/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_ej3;

/**
 *
 * @author aldia
 */
public class Cuadrilatero extends Figura {
    protected double base;
    protected double altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    final double area(){
     return base * altura;   
    }
    
    final double perimetro(){
        return (base * 2) + (altura * 2);
    }
}
