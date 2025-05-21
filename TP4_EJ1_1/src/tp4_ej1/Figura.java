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
public abstract class Figura {
    
    
    abstract public double area();
    
    static boolean mismaArea (Figura f) {
        return true;
    }
    
    abstract public double perimetro ();
    
    public String toString(){
        return "Soy " + this.getClass().getSimpleName();
    }
}
