package TP4_EJ4;
import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private ArrayList<Locomotora> locomotorasSueltas;
    private ArrayList<Formacion> formaciones;

    public Deposito(){
        locomotorasSueltas = new ArrayList<>();
        formaciones = new ArrayList<>();
    }

    public void agregarFormacion(Formacion f){
        formaciones.add(f);
    }

    public void agregarLocomotoraSuelta(Locomotora l){
        locomotorasSueltas.add(l);
    }

    //g
    public List<Vagon> vagonesMasPesados(){
        List<Vagon> conjunto =  new ArrayList<>();

        for(Formacion f: formaciones){
            Vagon pesado = f.vagonMasPesado();
            if(pesado!=null){
                conjunto.add(pesado);
            }
        }
        return conjunto;
    }

    //h
    public boolean necesitaConductorExperimentado(){
        for(Formacion f: formaciones){
            if(f.esCompleja()){
                return true;
            }
        }
        return false;
    }

    //i

    public void agregar(Formacion f){
        if(f.puedeMoverse()){return;}

        double falta = f.faltaEmpuje();

        for(Locomotora l:locomotorasSueltas){
            if(l.arrastreUtil() >= falta){
                f.agregarLocomotora(l);
                locomotorasSueltas.remove(l);
                break;
            }
        }
    }

    public void mostrarFormaciones() {
        int numero = 1;
        for (Formacion f : formaciones) {
            System.out.println("Formación " + numero + ":");
            f.mostrarDetalle();
            System.out.println("Puede moverse: " + (f.puedeMoverse() ? "Sí" : "No"));
            System.out.println("-----------------------------------");
            numero++;
        }
    }
    public void completarFormacionesConLocomotoras() {
        for (Formacion f : formaciones) {
            while (!f.puedeMoverse() && !locomotorasSueltas.isEmpty()) {
            
                Locomotora l = locomotorasSueltas.remove(0);
                f.agregarLocomotora(l);
            }
        }
    }

}
