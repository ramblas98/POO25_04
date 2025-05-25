
package tp4_ej6;

public class Comic extends Lectura {
    
    private String Dibujante;
    private Color color;

    public Comic() {
    }

    public Comic(String Dibujante, Color color) {
        this.Dibujante = Dibujante;
        this.color = color;
    }

    public Comic(String Dibujante, Color color, String titulo, String autor, int numPaginas, int puntuacion) {
        super(titulo, autor, numPaginas, puntuacion);
        this.Dibujante = Dibujante;
        this.color = color;
    }
    
    

    public String getDibujante() {
        return Dibujante;
    }

    public Color getColor() {
        return color;
    }

    public void setDibujante(String Dibujante) {
        this.Dibujante = Dibujante;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public int TiempoEstimadoLectura() {
        
        return this.getNumPaginas() / 100;
        
    }
    
    @Override
    public String Resumen() {
        
        if (this.color == Color.Color) {
            
            return "Este Comic es a Color y Su Artista es: " + this.Dibujante;
            
        } else {
            
            return "Este Comic es a Blanco y Negro y Su Artista es: " + this.Dibujante;
            
        }
        
    }
    
}
