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
public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    //Constructores

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    //Getters

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    
    //Setters

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    //Altura
    public double altura(){
       
        
        double s = (ladoA + ladoB + ladoC) / 2;
        
        double area = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        
        double alt = (2 * area) /ladoA;
        
        
        return alt;
    }
    
    @Override
    public double area(){
        
        double alt = altura();
        
        double ar = (ladoC * alt) / 2;
        
        return ar;
    }
    
    @Override
    public double perimetro(){
        return (ladoA + ladoB + ladoC);
    }
    
    //¿Es equilatero?
    static boolean equilatero(Triangulo f){
        if(f.ladoA==f.ladoB && f.ladoB==f.ladoC){
           return true;
        } else return false;
    }
    
    
    //¿Es isosceles?
    static boolean isosceles(Triangulo f){
        if(f.ladoA==f.ladoB && f.ladoB!=f.ladoC){
           return true;
        } else return false;
    }
    
    //¿Es escaleno?
    static boolean escaleno(Triangulo f){
        if(f.ladoA!=f.ladoB && f.ladoA!=f.ladoC && f.ladoB!=f.ladoC){
           return true;
        } else return false;
    }
    
}
