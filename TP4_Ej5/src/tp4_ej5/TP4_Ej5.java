package tp4_ej5;


public class TP4_Ej5 {

    public static void main(String[] args) {
        Auto[] autos = {
            new AutoNaftero(),
            new AutoDiesel(),
            new AutoGNC()
        };

        for (Auto auto : autos) {
            auto.cargar(300);
            auto.recorrer(100);
            System.out.println("Combustible restante: " + String.format("%.2f", auto.getCombustible()));
            System.out.println("Kilómetros recorridos: " + String.format("%.2f", auto.getKm()));
            System.out.println("---------------");
        }
    }
    
}
