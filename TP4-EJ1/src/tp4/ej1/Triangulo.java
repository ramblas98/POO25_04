/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej1;

/**
 *
 * @author nicor
 */
public class Triangulo extends Figura{
    private float ladoA;
    private float ladoB;
    private float ladoC;
    
    public Triangulo(){
        
    }
    
    public Triangulo(float ladoA, float ladoB, float ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    //GETTERS
    public float getLadoA(){
        return ladoA;
    }
    
    public float getLadoB(){
        return ladoB;
    }
    
    public float getLadoC(){
        return ladoC;
    }
    
    //SETTERS
    float setLadoA()
    
}
