
package tp4_ej3;

public class Cuadrilatero extends Figura {
    
    private double base;
    private double altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double base, double altura) {
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
    final double Area() {
        
        return (base * altura) / 2;
        
    }

    @Override
    final double Perimetro() {
        
        return base + altura;
        
    }
    
    
    
    
}
