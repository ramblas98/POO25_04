package TP4_EJ5;

public class AutoDiesel extends Auto {
    @Override
    public void cargar(double importe) {
        this.combustible+=importe / precioDiesel;
    }
    @Override
    public double consumo(double km) {
        AutoNaftero an = new AutoNaftero();

        return an.consumo(km) / 2.0;
    }

    @Override
    public void recorrer(double km) {
        double necesario = consumo(km);

        if(combustible >= necesario){
            this.km +=km;
            this.combustible -= necesario;
        }else{
            System.out.println("Combustible insuficiente para el recorrido");
        }
    }

    @Override
    public double precioUnidadCombustible() {
        return precioDiesel;
    }
}
