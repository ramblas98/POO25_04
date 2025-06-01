
package tp4_ej4;

public class VagonCarga extends Vagon {
    
    private double cargaMaxima;

    public VagonCarga(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double pesoMaximo() {
        return cargaMaxima + 160;
    }

}