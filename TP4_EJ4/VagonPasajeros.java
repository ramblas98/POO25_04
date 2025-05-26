package TP4_EJ4;
public class VagonPasajeros extends Vagon {
    private int pasajeros;
    private double pesoPasajero;

    public VagonPasajeros(int pasajeros, double pesoPasajero) {
        this.pasajeros = pasajeros;
        this.pesoPasajero = pesoPasajero;
    }

    @Override
    public double pesoMaximo() {
        return pasajeros * pesoPasajero;
    }

    @Override
    public int capacidadPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        return "VagonPasajeros [capacidad=" + pasajeros + ", pesoMax=" + pesoMaximo() + "]";
    }
}
