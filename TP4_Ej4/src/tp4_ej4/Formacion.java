package tp4_ej4;

import java.util.ArrayList;


public class Formacion {
    ArrayList <Locomotora> misLocomotoras;
    ArrayList <Vagon> misVagones;

    public Formacion() {
        this.misLocomotoras = new ArrayList();
        this.misVagones = new ArrayList();
    }
    
    public int totalPasajeros(){
        int total=0;
        for(int i=0;i<this.misVagones.size();i++){
            if(this.misVagones.get(i) instanceof VPasajero) total+=this.misVagones.get(i).cantidadPasajeros();
        }
        return total;
    }
    
    public int vagionesLivianos(){
        int totalvagoneslivianos=0;
        for(int i=0;i<this.misVagones.size();i++){
            if(this.misVagones.get(i).esLiviano()) totalvagoneslivianos++;
        }
        return totalvagoneslivianos;
    }
    
    public double velocidadMaxima(){
        double resultado = this.misLocomotoras.get(0).getVelocidadMax();
        for(int i=1;i<this.misLocomotoras.size();i++){
            if(this.misLocomotoras.get(i).getVelocidadMax()<resultado) resultado=this.misLocomotoras.get(i).getVelocidadMax();
        }
        return resultado;
    }
    
    public boolean esEficiente(){
        for(int i=0;i<this.misLocomotoras.size();i++){
            if(this.misLocomotoras.get(i).getPeso()*5<this.misLocomotoras.get(i).getPesoMax()) return false;
        }
        return true;
    }
    
    public boolean puedeMoverse(){
        return(this.arrastreUtilTotal()>=this.pesoMaximoTotal());
    }
    
    public double kEmpujeFaltante(){
        if(this.puedeMoverse()) return 0;
        else{
            return this.pesoMaximoTotal()-this.arrastreUtilTotal();
        }
    }
    
    public double arrastreUtilTotal(){
        double totalUtil=0;
        for(int i=0;i<this.misLocomotoras.size();i++) totalUtil+=this.misLocomotoras.get(i).arrastreUtil();
        return totalUtil;
    }
    
    public double pesoMaxLocomotoras(){
        double total=0;
        for(int i=0;i<this.misLocomotoras.size();i++) total+=this.misLocomotoras.get(i).getPeso();
        return total;
    }
    
    public double pesoMaximoTotal(){
        double totalPeso=0;
        for(int i=0;i<this.misVagones.size();i++) totalPeso+=this.misVagones.get(i).pesoMaximo();
        return totalPeso;
    }
    
    public Vagon vagonMasPesado(){
        int indice=0;
        double masPesado = this.misVagones.get(indice).pesoMaximo();
        for(int i=1;i<this.misVagones.size();i++){
            if(this.misVagones.get(i).pesoMaximo()>masPesado){
                masPesado=this.misVagones.get(i).pesoMaximo();
                indice=i;
            }
        }
        return this.misVagones.get(indice);
    }
    
    
    
}

