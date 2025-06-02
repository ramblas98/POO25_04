package tp4_ej5;

public class AutoGNC extends Auto{
    
    private static final double precioGNC = 70;

    @Override
    public void cargar(double importe) {
        double unidades = importe / precioGNC; //Carga de combustible
        agregarCombustible(unidades);
        System.out.println("AutoGNC cargó: " + String.format("%.2f", unidades) + " Lts");
    }

    @Override
    public void recorrer(double kilometros) {
        if (kilometros > 100) {
            System.out.println("AutoGNC no puede recorrer más de 100 km sin recargar.");
            return;
        }

        double necesario = consumo(kilometros); 

        if (consumirCombustible(necesario)) {
            sumarKm(kilometros);
            System.out.println("AutoGNC recorrió " + kilometros + " km.");

            if (getCombustible() < consumo(20)) {
                System.out.println("AutoGNC: Advertencia, queda combustible para menos de 20 km.");
            }
        } else {
            System.out.println("AutoGNC no tiene suficiente combustible.");
        }
    }

    @Override
    public double consumo(double kilometros) {
        return (kilometros / 16.0) / 3.0;
    }

    @Override
    public double precioUnidadCombustible() {
        return precioGNC;
    }
}
