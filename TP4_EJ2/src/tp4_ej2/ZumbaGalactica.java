
package tp4_ej2;

public class ZumbaGalactica extends Entrenamiento {
    
    private String nombreAvatar;

    public ZumbaGalactica() {
        
    }

    public ZumbaGalactica(String nombreAvatar) {
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
        
        System.out.println(this.nombreAvatar + " Baila Siguiendo Coreografias Interplanetarias, Aumentado su Agilidad.");
        
    }
    
}
