/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_ej3;

/**
 *
 * @author aldia
 */
public abstract class Figura {
    
    abstract double area();
    
    abstract double perimetro();
    
    public boolean mismaArea(Figura f){
        return this.area()==f.area();
    }
    
    
    
    
    
    
}
