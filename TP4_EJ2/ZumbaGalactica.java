public class ZumbaGalactica extends Entrenamiento{
    private int agilidad;
    @Override
    public void realizar(){
        System.out.println(nombreAvatar + " esta bailando, aumento su agilidad a un punto");
        agilidad++;
    }

    public int getAgilidad(){
        return agilidad;
    }

    public void setAgilidad(int agilidad){
        this.agilidad = agilidad;
    }

    @Override
    public String toString() {
        return "ZumbaGalactica [agilidad=" + agilidad + "]";
    }

}
