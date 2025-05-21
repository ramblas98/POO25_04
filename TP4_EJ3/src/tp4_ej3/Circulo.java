/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_ej3;

/**
 *
 * @author aldia
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return 3.14 * Math.pow(radio, 2);   
    }
    
    @Override
    public double perimetro(){
        return 2 * 3.14 * radio;
    }
    
    
    
    
}
