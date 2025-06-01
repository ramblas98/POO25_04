
package tp4_ej4;


public class Locomotora {
    private double peso;
    private double pesoMax;
    private double velocidadMax;

    public Locomotora() {
    }

    public Locomotora(double peso, double pesoMax, double velocidadMax) {
        this.peso = peso;
        this.pesoMax = pesoMax;
        this.velocidadMax = velocidadMax;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    public double arrastreUtil(){
        return this.pesoMax-this.peso;
    }
}
