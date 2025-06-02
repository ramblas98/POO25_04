package TP4_EJ5;

public class AutoGNC extends Auto{
    @Override
    public void cargar(double importe) {
        this.combustible += importe/precioGNC;
    }

    @Override
    public void recorrer(double km) {
        if (km > 100) {
            System.out.println("Recorrido muy largo. Necesita cargar antes.");
            return;
        }

        double necesario = consumo(km);
        if (combustible >= necesario) {
            this.km += km;
            this.combustible -= necesario;
        } else {
            System.out.println("Combustible insuficiente.");
        }
    }

    @Override
    public double consumo(double km) {
        return km / 48.0;
    }

    @Override
    public double precioUnidadCombustible() {
        return precioGNC;
    }
}
