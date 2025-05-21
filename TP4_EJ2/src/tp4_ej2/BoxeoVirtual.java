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
public abstract class BoxeoVirtual extends Entrenamiento {

    public BoxeoVirtual(String nombreAvatar){
        super(nombreAvatar);
    }
    
    @Override
    final public void realizar(){
        System.out.println(nombreAvatar + "¡Lento!");
    }
}
