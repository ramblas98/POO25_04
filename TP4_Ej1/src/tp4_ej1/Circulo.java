package tp4_ej1;


public class Circulo extends Figura{
    public double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return Math.PI*(this.radio*this.radio);
    }
    
    @Override
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }
}
