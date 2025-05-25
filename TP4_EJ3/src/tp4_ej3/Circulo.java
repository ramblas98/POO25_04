
package tp4_ej3;

public class Circulo extends Figura {
    
    private double radio;

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
    public double Area() {
        
        return Math.PI * Math.pow(radio, 2);
        
    }

    @Override
    public double Perimetro() {
        
        return 2 * Math.PI * radio;
        
    }
    
}
