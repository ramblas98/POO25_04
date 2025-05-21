/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej1;

/**
 *
 * @author nicor
 */
public class Circulo extends Figura{
    private float radio;

    public Circulo(){
        
    }
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    //GETTERS
    public float getRadio() {
        return radio;
    }
    
    //SETTERS
    public void setRadio(float radio){
        this.radio = radio;
    }
    
    //-----------------------------------------------------------------------------------------------------
    
    //AREA
    @Override
    float area(){
        return(float) (3.1415*radio*radio);
    }
    
    @Override
    float perimetro(){
        return(float) (2*3.1415*radio);
    }
    
    
    
}
