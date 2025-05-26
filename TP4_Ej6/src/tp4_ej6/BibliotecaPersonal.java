package tp4_ej6;

import java.util.ArrayList;


public class BibliotecaPersonal {
    ArrayList <Lectura> lecturas;

    public BibliotecaPersonal() {
        this.lecturas = new ArrayList();
    }

    public boolean existeTitulo(String t){
        for(int i=0;i<this.lecturas.size();i++){
            if(this.lecturas.get(i).getTitulo().equals(t)) return true;
        }
        return false;
    }
    
    public void agregar(Lectura l){
        if(this.existeTitulo(l.getTitulo())) System.out.println("Titulo ya existente");
        else this.lecturas.add(l);
    }
    
    public void eliminar(String s){
        for(int i=0;i<this.lecturas.size();i++){
            if(this.lecturas.get(i).getTitulo().equals(s)||this.lecturas.get(i).getAutor().equals(s)) this.lecturas.remove(i);
        }
    }
    
    public Lectura obtenerMayorCalificacion(){
        double c = this.lecturas.get(0).getCalificacion();
        int indice=0;
        for(int i=1;i<this.lecturas.size();i++){
            if(this.lecturas.get(i).getCalificacion()>c){
                c = this.lecturas.get(i).getCalificacion();
                indice=i;
            }
        }
        return this.lecturas.get(indice);
    }
    
    public Lectura obtenerMenorCalificacion(){
        double c = this.lecturas.get(0).getCalificacion();
        int indice=0;
        for(int i=1;i<this.lecturas.size();i++){
            if(this.lecturas.get(i).getCalificacion()<c){
                c = this.lecturas.get(i).getCalificacion();
                indice=i;
            }
        }
        return this.lecturas.get(indice);
    }
    
    public void resumenGeneral(){
        System.out.println("\n\nResumen general: \n");
        for(int i=0;i<this.lecturas.size();i++){
            System.out.println(this.lecturas.get(i).resumen());
        }
    }
    
    public int tiempoTotalLectura(){
        int horastotales=0;
        for(int i=0;i<this.lecturas.size();i++){
            horastotales+=this.lecturas.get(i).tiempoEstimadoLectura();
        }
        return horastotales;
    }
}

