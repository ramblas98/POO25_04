
package tp4_ej4;

public class VagonPasajeros extends Vagon {
    
    private double largo;
    private double anchoUtil;

    public VagonPasajeros(double largo, double anchoUtil) {
        this.largo = largo;
        this.anchoUtil = anchoUtil;
    }

    @Override
    public int capacidadPasajeros() {
        if(anchoUtil <= 2.5){
            return (int)(largo*8);
        }
        return (int)(largo*10);
    }

    @Override
    public double pesoMaximo() {
        return capacidadPasajeros() * 80;
    }
    
}