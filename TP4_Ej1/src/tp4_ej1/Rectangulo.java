package tp4_ej1;


public class Rectangulo extends Figura{
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

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return this.base*this.altura;
    }
    
    @Override
    public double perimetro(){
        return this.area()*2;
    }
}
