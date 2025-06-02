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
public class Inmueble implements Rentable{
    private String direccion;
    private String tipo;
    private double valor;
    private int anios;
    
   //CONSTRUCTORES

    public Inmueble(String direccion, String tipo, double valor, int anios) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
        this.anios = anios;
    }
    
    //CONSTRUCTOR SIN PARAMETRO

    public Inmueble() {
    }
    
    //GETTERS

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getAnios() {
        return anios;
    }
    
    //SETTERS

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    //Alquilar
    @Override
    public void alquilar(int periodo) {
        this.anios = periodo;
        System.out.println("El inmueble: " + tipo + " Sera alquilado por: "+ periodo+ " Años");
    }
    
    //Alquilado
    @Override
    public boolean alquilado() {
        if (anios > 1 ) return true;
        else return false;
    }
    
    //Desocupar
    @Override
    public void desocupar() {
        this.anios = 0;
        System.out.println("El inmueble "+tipo+ " debe ser desocupado");
    }
    
}
