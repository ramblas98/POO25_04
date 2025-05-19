public class Rectangulo extends Figura{

    private double base;
    private double altura;

    @Override
    public double area(){
        return this.base  * this.altura;
    }

    @Override
    public double perimetro(){
        return (this.base * 2) + (this.altura * 2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(){}

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }
    
}
