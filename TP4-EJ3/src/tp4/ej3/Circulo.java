/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej3;

/**
 *
 * @author nicor
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    //-----------------------------------------------------------------------------------------------------------------------
    
    @Override 
    double area(){
        return(3.1415 * radio * radio);
    }
    
    @Override 
    double perimetro(){
        return (2 * 3.1415 * radio);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
