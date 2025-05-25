package tp4_ej6;


public class Comic extends Lectura{
    private String dibujante;
    private boolean color; // si es falso esta en blanco y negro

    public Comic() {
    }
    
    public Comic(String titulo, String autor, int numPaginas, double calificacion, String dibujante, boolean color){
        super(titulo,autor,numPaginas,calificacion);
        this.dibujante = dibujante;
        this.color = color;
    }

    public String getDibujante() {
        return dibujante;
    }

    public boolean isColor() {
        return color;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    
    @Override
    public String resumen(){
        if(this.color) return "a color \n" + this.getDibujante();
        else return "en blanco y negro \n" + this.getDibujante();
    }
    
    @Override
    public int tiempoEstimadoLectura(){
        return this.getNumPaginas()/100;
    }
   
}
