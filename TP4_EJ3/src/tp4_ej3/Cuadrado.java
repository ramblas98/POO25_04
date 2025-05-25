
package tp4_ej3;

public class Cuadrado extends Cuadrilatero{
    
    private double base;
    private double altura;

    public Cuadrado() {
    }

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getBase() {
        return base;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
