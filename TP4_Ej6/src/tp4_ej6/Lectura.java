package tp4_ej6;


public abstract class Lectura {
    private String titulo;
    private String autor;
    private int numPaginas;
    private double calificacion;

    public Lectura() {
    }

    public Lectura(String titulo, String autor, int numPaginas, double calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.calificacion = calificacion;
    }
   

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
    public abstract String resumen();
    
    public abstract int tiempoEstimadoLectura();
}
