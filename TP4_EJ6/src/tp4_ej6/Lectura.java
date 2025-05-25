
package tp4_ej6;

abstract class Lectura {
    
    private String titulo;
    private String autor;
    private int numPaginas;
    private int puntuacion;

    public Lectura() {
    }

    public Lectura(String titulo, String autor, int numPaginas, int puntuacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.puntuacion = puntuacion;
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

    public int getPuntuacion() {
        return puntuacion;
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

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    abstract String Resumen();
    
    abstract int TiempoEstimadoLectura();
    
}
