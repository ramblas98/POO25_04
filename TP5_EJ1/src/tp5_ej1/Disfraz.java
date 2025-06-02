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
public class Disfraz implements Rentable {
    private String personaje;
    private char talle;
    private int dias;
    private double precio;
    
    //CONSTRUCTORES

    public Disfraz(String personaje, char talle, int dias, double precio) {
        this.personaje = personaje;
        this.talle = talle;
        this.dias = dias;
        this.precio = precio;
    }
    
    //CONSTRUCTOR SIN PARAMETRO

    public Disfraz() {
    }
    
    //GETTERS

    public String getPersonaje() {
        return personaje;
    }

    public char getTalle() {
        return talle;
    }

    public int getDias() {
        return dias;
    }

    public double getPrecio() {
        return precio;
    }
    
    //SETTERS

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Alquilar
    @Override
    public void alquilar(int periodo) {
        this.dias = periodo;
        System.out.println("El disfraz de: "+ personaje + "Sera alquilado por: "+ this.dias +" Dias");
    }

    @Override
    public boolean alquilado() {
        if(dias > 0) return true;
        else return false;
    }

    @Override
    public void desocupar() {
        this.dias = 0;
        System.out.println("El disfraz de: "+ personaje+ " debe ser desocupado");
    }
    
}
