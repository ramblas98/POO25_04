package tp4_ej6;


public class Libro extends Lectura{
    private Genero genero;
    private int anioPublicacion;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, int numPaginas, double calificacion, Genero genero, int anioPublicacion){
        super(titulo,autor,numPaginas,calificacion);
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
    public String resumen(){
        if(this.anioPublicacion<2000) return "clasico\n";
        else return "moderno\n";
    }
    
    @Override
    public int tiempoEstimadoLectura(){
        return(this.getNumPaginas()/50);
    }
}
