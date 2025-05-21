/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ej2;

/**
 *
 * @author Administrador
 */
public abstract class Entrenamiento {
    protected String nombreAvatar;
    
    //Constructor

    public Entrenamiento(String nombreAvatar) {
        this.nombreAvatar = nombreAvatar;
    }
    
    
    //Getter

    public String getNombreAvatar() {
        return nombreAvatar;
    }

    
    
    //Setter
    
    public void setNombreAvatar(String nombreAvatar) {
        this.nombreAvatar = nombreAvatar;
    }

    
    public abstract void realizar();
}
