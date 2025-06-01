
package tp4_ej4;

import java.util.ArrayList;

public class Formacion {
    private ArrayList<Locomotora> locomotoras;
    private ArrayList<Vagon> vagones;

    public Formacion() {
        locomotoras = new ArrayList<>();
        vagones = new ArrayList<>();
    }

    public void agregarLocomotora(Locomotora l) {
        locomotoras.add(l);
    }

    public void agregarVagon(Vagon v) {
        vagones.add(v);
    }
    //a)
    public int totalPasajeros() {
        int total = 0;
        for (Vagon v : vagones) {
            total += v.capacidadPasajeros();
        }
        return total;
    }
    //b)
    public int contarVagonesLivianos() {
        int contador = 0;
        for (Vagon v : vagones) {
            if (v.esLiviano()) contador++;
        }
        return contador;
    }
    //c)
    public double velocidadMaxima(){
        double min = locomotoras.get(0).getVelocidadMaxima();

        for(Locomotora l: locomotoras){
            if(l.getVelocidadMaxima() < min){
                min = l.getVelocidadMaxima();
            }
        }
        return min;
    }
    //d
    public boolean esEficiente(){
        for(Locomotora l: locomotoras){
            if(!l.esEficiente()){
                return false;
            }
        }
        return true;
    }
    //e)
    public double pesoMaximoTotalVagones(){
        double total = 0;

        for(Vagon v:vagones){
            total = total + v.pesoMaximo();
        }
        return total;
    }

    public double arrastreUtilTotal(){
        double total = 0;
        for(Locomotora l: locomotoras){
            total = total + l.arrastreUtil();
        }
        return total;
    }
    
    public boolean puedeMoverse(){
        return arrastreUtilTotal()>=pesoMaximoTotalVagones();
    }

    //f)
    public double faltaEmpuje(){
        double falta = pesoMaximoTotalVagones() - arrastreUtilTotal();
        return Math.max(0, falta);
    }


    public Vagon vagonMasPesado(){
        Vagon masPesado = null;

        for(Vagon v: vagones){
            if(masPesado == null || v.pesoMaximo() > masPesado.pesoMaximo()){
                masPesado = v;
            }
        }

        return masPesado;
    }

    public int cantidadUnidades(){
        return locomotoras.size() + vagones.size();
    }
    public double pesoTotalLocomotoras(){
        double total = 0;
        for(Locomotora l: locomotoras){
            total = total + l.getPeso();
        }
        return total;
    }
    public double pesoTotal(){
        return pesoMaximoTotalVagones() + pesoTotalLocomotoras();
    }

    public boolean esCompleja(){
        return cantidadUnidades() > 20 || pesoTotal() > 10000;
    }

    public void mostrarDetalle() {
    System.out.println("  Locomotoras:");
    for (Locomotora l : locomotoras) {
        System.out.println("    - Arrastre útil: " + l.arrastreUtil());
    }

    System.out.println("  Vagones:");
    for (Vagon v : vagones) {
        System.out.println("    - Peso máximo: " + v.pesoMaximo());
    }

    System.out.println("  Arrastre total útil: " + arrastreUtilTotal());
    System.out.println("  Peso máximo de todos los vagones: " + pesoMaximoTotalVagones());
    System.out.println("  Kilos que le faltan para moverse: " + faltaEmpuje());
}

}