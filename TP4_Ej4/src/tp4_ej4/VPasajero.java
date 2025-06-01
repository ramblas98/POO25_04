
package tp4_ej4;


public class VPasajero extends Vagon{
    private double largo;
    private double anchoUtil;

    public VPasajero() {
    }

    public VPasajero(double largo, double anchoUtil) {
        this.largo = largo;
        this.anchoUtil = anchoUtil;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAnchoUtil() {
        return anchoUtil;
    }

    public void setAnchoUtil(double anchoUtil) {
        this.anchoUtil = anchoUtil;
    }
    
    @Override
    public double pesoMaximo(){
        return this.cantidadPasajeros()*80;
    }
    
    @Override
    public int cantidadPasajeros(){
        if(this.anchoUtil<=2.5) return (int) this.largo*8;
        else return (int) this.largo*10;
    }
    
    @Override
    public boolean esLiviano(){
        return (this.pesoMaximo()<2500);
    }
    
}
