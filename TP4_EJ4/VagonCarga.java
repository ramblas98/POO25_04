package TP4_EJ4;
public class VagonCarga extends Vagon {
    private double peso;

    public VagonCarga(double peso) {
        this.peso = peso;
    }

    @Override
    public double pesoMaximo() {
        return peso;
    }

    @Override
    public String toString() {
        return "VagonCarga [peso=" + peso + "]";
    }
}
