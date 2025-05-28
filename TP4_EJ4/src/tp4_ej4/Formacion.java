
package tp4_ej4;

import java.util.ArrayList;

public class Formacion {
    
    private ArrayList<Vagon> vagones = new ArrayList<>();
    private ArrayList<Locomotora> locomotoras = new ArrayList<>();

    public void agregarVagon(Vagon v) {
        vagones.add(v);
    }

    public void agregarLocomotora(Locomotora l) {
        locomotoras.add(l);
    }

    public boolean puedeMoverse() {
        return !locomotoras.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Formacion:\n");
        sb.append("  Locomotoras: ").append(locomotoras.size()).append("\n");
        for (Locomotora l : locomotoras) sb.append("    ").append(l).append("\n");
        sb.append("  Vagones:\n");
        for (Vagon v : vagones) sb.append("    ").append(v).append("\n");
        return sb.toString();
    }
}