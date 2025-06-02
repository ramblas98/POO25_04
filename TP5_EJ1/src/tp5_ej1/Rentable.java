/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_ej1;

/**
 *
 * @author Administrador
 */
public interface Rentable {
    
    public void alquilar(int periodo);
    
    public boolean alquilado();
    
    public void desocupar();
}
