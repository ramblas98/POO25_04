package TP4_EJ4;
public class Locomotora {
    private int potencia;

    public Locomotora(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Locomotora [potencia=" + potencia + "]";
    }
}
