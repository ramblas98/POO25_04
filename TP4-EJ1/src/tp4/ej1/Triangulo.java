/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.ej1;

/**
 *
 * @author nicor
 */
public class Triangulo extends Figura{
    private float ladoA;
    private float ladoB;
    private float ladoH;
    
    public Triangulo(){
        
    }
    
    public Triangulo(float ladoA, float ladoB, float ladoH){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoH = ladoH;
    }
    
    //GETTERS
    public float getLadoA(){
        return ladoA;
    }
    
    public float getLadoB(){
        return ladoB;
    }
    
    public float getLadoH(){
        return ladoH;
    }
    
    //SETTERS
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoH(float ladoH) {
        this.ladoH = ladoH;
    }
    
    //----------------------------------------------------------------------
    
    //AREA
    @Override
    float area(){
        return((ladoA*ladoB)/2);
    }
    
    //PERIMETRO
    @Override
    float perimetro(){
        return(ladoA+ladoB+ladoH);
    }
    
    boolean equilatero(){
        if(ladoA == ladoB && ladoB == ladoH){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isoseles(){
        if(ladoA == ladoB && ladoA != ladoH){
                return true;
    
        }else if(ladoA != ladoB && ladoA == ladoH){
            return true;
            
        }else if(ladoB == ladoH && ladoB != ladoH){
            return true;
            
        }else{
            return false;
        }
    }
    
    boolean escaleno(){
        if(ladoA != ladoB && ladoB != ladoH && ladoH != ladoA){
            return true;
        }else{
            return false;
        }
    }
    
}
