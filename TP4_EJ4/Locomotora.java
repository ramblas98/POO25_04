package TP4_EJ4;
public class Locomotora {
    private double peso;
    private double pesoMaximoArrastre;
    private double velocidadMaxima;

    public Locomotora(double peso, double pesoMaximoArrastre, double velocidadMaxima){
        this.peso = peso;
        this.pesoMaximoArrastre = pesoMaximoArrastre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Locomotora(){}

    public double getPeso(){
        return peso;
    }
    public double getPesoMaximoArrastre(){
        return pesoMaximoArrastre;
    }
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setPesoMaximoArrastre(double pesoMaximoArrastre){
        this.pesoMaximoArrastre = pesoMaximoArrastre;
    }

    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public double arrastreUtil(){
        return pesoMaximoArrastre - peso;
    }

    public boolean esEficiente(){
        return arrastreUtil() >= peso*5;
    }
}