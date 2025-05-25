package tp4_ej6;

public class Revista extends Lectura{
    private int numeroEdicion;
    private Tematica tematica;

    public Revista() {
    }
    
    public Revista(String titulo, String autor, int numPaginas, double calificacion, int numeroEdicion, Tematica tematica){
        super(titulo,autor,numPaginas,calificacion);
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }
    
    @Override
    public String resumen(){
        String a = "";
        if(this.tematica==Tematica.actualidad) a = "\nTematica: actualidad\n";
        if(this.tematica==Tematica.ciencia) a = "\nTematica: ciencia\n";
        if(this.tematica==Tematica.deporte) a = "\nTematica: deporte\n";
        if(this.tematica==Tematica.moda) a = "\nTematica: moda\n";
        return a + "Edicion numero: " + this.numeroEdicion + "\n";
    }
    
    @Override
    public int tiempoEstimadoLectura(){
        return this.getNumPaginas()/70;
    }
}
