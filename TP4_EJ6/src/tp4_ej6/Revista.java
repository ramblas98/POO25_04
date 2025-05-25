
package tp4_ej6;

public class Revista extends Lectura {
    
    private int numeroEdicion;
    private Tematica tematica;

    public Revista() {
    }

    public Revista(int numeroEdicion, Tematica tematica) {
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }

    public Revista(int numeroEdicion, Tematica tematica, String titulo, String autor, int numPaginas, int puntuacion) {
        super(titulo, autor, numPaginas, puntuacion);
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }
    
    @Override
    public int TiempoEstimadoLectura() {
        
        return this.getNumPaginas() / 70;
        
    }
    
    @Override
    public String Resumen() {
        
        return "Tematica: " + this.tematica + " Edicion: " + this.numeroEdicion;
        
    }
    
}
