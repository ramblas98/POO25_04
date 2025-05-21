/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_ej3;

/**
 *
 * @author aldia
 */
public class Triangulo extends Figura {
    
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public double altura(){
        double s = perimetro() / 2;
        double ar = Math.sqrt(s * ( s - lado1) * (s - lado2) * ( s - lado3));
        double alt = (2 * ar) / lado3;  
        return alt;
    }
    
    @Override
    public double perimetro(){
        return lado1 + lado2 + lado3; 
    }
  
    @Override
    public double area(){  
        return (lado3 * altura()) / 2;
    }
    
    public boolean esIsosceles(){
        return (lado1 == lado2) || (lado1 == lado2) || (lado2 == lado3); 
    }
    
    public boolean esEquilatero(){
        return (lado1 == lado2) && (lado2 == lado3);
    }
    
    public boolean esEscaleno(){
        return esEquilatero() && esIsosceles();
    }
}
