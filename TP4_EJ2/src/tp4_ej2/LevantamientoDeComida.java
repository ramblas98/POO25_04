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
public abstract class LevantamientoDeComida extends Entrenamiento {

    public LevantamientoDeComida(String nombreAvatar) {
        super(nombreAvatar);
    }
    
    @Override
    final public void realizar(){
        System.out.println(nombreAvatar + " Levanta bowls de ramen para mejorar su fuerza de forma cuestionable");
    }
}
