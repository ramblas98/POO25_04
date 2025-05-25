
package tp4_ej2;

public class BoxeoVirtual extends Entrenamiento {
    
    private String nombreAvatar;
    
    public BoxeoVirtual() {
        
    }

    public BoxeoVirtual(String nombreAvatar) {
        this.nombreAvatar = nombreAvatar;
    }

    public String getNombreAvatar() {
        return nombreAvatar;
    }

    public void setNombreAvatar(String nombreAvatar) {
        this.nombreAvatar = nombreAvatar;
    }

    @Override
    public void Realizar() {
        
        System.out.println(this.nombreAvatar + " Lanza Combos de Punetazos Contra Un Saco que Grita Frases Motivadoras como !Eres Lento!");
        
    }
    
    
    
}
