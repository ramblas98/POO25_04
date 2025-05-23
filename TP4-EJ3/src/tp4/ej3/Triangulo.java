/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej3;

/**
 *
 * @author nicor
 */
public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoH;
    
    public Triangulo(){
        
    }
    
    public Triangulo(double ladoA, double ladoB, double ladoH){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoH = ladoH;
    }
    
    //GETTERS
    public double getLadoA(){
        return ladoA;
    }
    
    public double getLadoB(){
        return ladoB;
    }
    
    public double getLadoH(){
        return ladoH;
    }
    
    //SETTERS
    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }
    
    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }
    
    public void setLadoH(double ladoH){
        this.ladoH = ladoH;
    }
            
    //-------------------------------------------------------------------------------------------------------
    
    @Override
    double area(){
        return((ladoA*ladoB)/2);
    }
    
    @Override
    double perimetro(){
        return(ladoA+ladoB+ladoH);
    }
}
