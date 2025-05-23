/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej3;

/**
 *
 * @author nicor
 */
public class Cuadrilatero extends Figura{
    private double base;
    private double altura;
    
    public Cuadrilatero(){
        
    }
    
    public Cuadrilatero(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //GETTERS
    public double getBase(){
        return base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    //SETTERS
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    //------------------------------------------------------------------------------------------------
    
    @Override
    double area() {
        return(base*altura);
    }
    
    @Override 
    double perimetro(){
        return(2*base+2*altura);
    }
    
}
