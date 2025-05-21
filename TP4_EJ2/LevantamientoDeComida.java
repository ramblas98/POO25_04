public class LevantamientoDeComida extends Entrenamiento{
    private int fuerza;
    @Override
    public void realizar(){
        System.out.println(super.nombreAvatar + " acaba de levantar un bowls de ramen, su fuerza aumento un punto");
        this.fuerza++;
    }
    public int getFuerza(){
        return this.fuerza;
    }
    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }
    @Override
    public String toString() {
        return "LevantamientoDeComida [fuerza=" + fuerza + "]";
    }
    
}
