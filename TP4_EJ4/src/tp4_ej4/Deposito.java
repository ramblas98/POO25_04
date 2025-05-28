
package tp4_ej4;

import java.util.ArrayList;

public class Deposito {
    
    private ArrayList<Formacion> formaciones = new ArrayList<>();
    private ArrayList<Locomotora> locomotorasSueltas = new ArrayList<>();

    public void agregarFormacion(Formacion f) {
        formaciones.add(f);
    }

    public void agregarLocomotora(Locomotora l) {
        locomotorasSueltas.add(l);
    }

    public void mostrarFormaciones() {
        for (Formacion f : formaciones) {
            System.out.println(f);
        }
    }

    public void completarFormaciones() {
        for (Formacion f : formaciones) {
            if (!f.puedeMoverse() && !locomotorasSueltas.isEmpty()) {
                f.agregarLocomotora(locomotorasSueltas.remove(0));
            }
        }
    }
}