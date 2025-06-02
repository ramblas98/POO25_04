package TP4_EJ5;

public class AutoNaftero extends Auto{
    @Override
    public void cargar(double importe){
        double precioPromo = precioNafta * 0.10;
        this.combustible += importe / precioPromo;
    }

    @Override
    public void recorrer(double km){
        double necesario = consumo(km);
        if(combustible>=necesario){
            this.km +=km;
            this.combustible -= necesario;
        }else{
            System.out.println("Combustible insuficiente para el recorrido");
        }
    }   

    @Override
    public double consumo(double km){
        return km /16.0;
    }

    @Override
 
    public double precioUnidadCombustible() {
        return precioNafta + (precioNafta*0.10);
    }
}
