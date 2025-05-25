
package tp4_ej2;

public class LevantamientoDeComida extends Entrenamiento {
    
    private String nombreAvatar;

    public LevantamientoDeComida() {
        
    }

    public LevantamientoDeComida(String nombreAvatar) {
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
        
        System.out.println(this.nombreAvatar + " Levanta Bowls de ramen para Mejorar su Fuerza de Forma Cuestionable.");
        
    }
    
    
    
}
