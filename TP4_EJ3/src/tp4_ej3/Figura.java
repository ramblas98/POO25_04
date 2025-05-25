
package tp4_ej3;

abstract class Figura {
    
    abstract double Area();
    
    abstract double Perimetro();
    
    public boolean MismaArea(Figura f) {
        
        return this.Area() == f.Area();
        
    } 
    
}
