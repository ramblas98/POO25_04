
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
    /*
     * por ejemplo en la clase Circulo tendra un error ya que no esta haciendo uso del
     * metodo perimetro() de la clase padre Figura, este error sale por que tanto la clase
     * como los metodos son abstractos
     */
    
}
