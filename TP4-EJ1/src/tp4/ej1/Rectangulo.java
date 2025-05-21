/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej1;

/**
 *
 * @author nicor
 */
public class Rectangulo extends Figura{
    private float base;
    private float altura;
    
    public Rectangulo(){
        
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //GETTERS
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    //SETTERS
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //------------------------------------------------------------------------------------------------------------------------
    
    //AREA
    @Override
    float area(){
        return(base*altura);
    }
    
    //PERIMETRO
    @Override
    float perimetro(){
        return(2*base+2*altura);
    }
    
    
    
}
