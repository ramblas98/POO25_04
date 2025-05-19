
package tp4_ej1;

public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double Area() {
        
        return (base * altura) / 2;
        
    }

    @Override
    public double Perimetro() {
        
        return base + altura;
        
    }
    
    
    
}
