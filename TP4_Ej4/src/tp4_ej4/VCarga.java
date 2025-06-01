
package tp4_ej4;


public class VCarga extends Vagon{
    private double cargaMaxima;

    public VCarga() {
    }

    public VCarga(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    @Override
    public double pesoMaximo(){
        return this.cargaMaxima+160;
    }
    
    @Override
    public int cantidadPasajeros(){
        return 0;
    }
    
    @Override
    public boolean esLiviano(){
        return (this.pesoMaximo()<2500);
    }
}
