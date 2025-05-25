
package tp4_ej6;

public class Libro extends Lectura {
    
    private Genero genero;
    private int anioPublicacion;

    public Libro() {
    }
    
    public Libro(Genero genero, int anioPublicacion) {
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro(Genero genero, int anioPublicacion, String titulo, String autor, int numPaginas, int puntuacion) {
        super(titulo, autor, numPaginas, puntuacion);
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }
    
    public Genero getGenero() {
        return genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public int TiempoEstimadoLectura() {
        
        return this.getNumPaginas() / 50;
        
    }
    
    @Override
    public String Resumen() {
        
        if (this.anioPublicacion < 2000) {
            
            return "Clasico";
            
        } else {
            
            return "Nuevo";
            
        }
        
    }
    
    
    
}
