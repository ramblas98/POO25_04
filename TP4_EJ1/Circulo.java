
public class Circulo extends Figura{
    private double radio;


    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    
}
