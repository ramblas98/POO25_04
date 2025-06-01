
package tp4_ej4;

import java.util.ArrayList;


public class Deposito {
    ArrayList <Formacion> misFormaciones;
    ArrayList <Locomotora> misLocomotoras;

    public Deposito() {
        this.misFormaciones = new ArrayList();
        this.misLocomotoras = new ArrayList();
    }
    
    public ArrayList <Vagon> vagonesMasPesados(){
        ArrayList <Vagon> maspesados = new ArrayList();
        for(int i=0;i<this.misFormaciones.size();i++) maspesados.add(this.misFormaciones.get(i).vagonMasPesado());
        return maspesados;
    }
    
    public boolean necesitaConductorExperimentado(){
        for(int i=0;i<this.misFormaciones.size();i++){
            if(this.misFormaciones.get(i).misLocomotoras.size()+this.misFormaciones.get(i).misVagones.size()>20) return true;
            else return(this.misFormaciones.get(i).pesoMaximoTotal()+this.misFormaciones.get(i).pesoMaxLocomotoras()>10000);
        }
        return false;
    }
    
    public void agregar(Formacion f){
        if(!f.puedeMoverse()){
            for(int i=0;i<this.misLocomotoras.size();i++){
                if(this.misLocomotoras.get(i).arrastreUtil()>=f.kEmpujeFaltante()) f.misLocomotoras.add(this.misLocomotoras.remove(i));
            }
        }
    }
}
