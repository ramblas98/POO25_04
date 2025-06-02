package TP4_EJ5;
public class Tp4_ej5 {
    public static void main(String[] args) {
        // 1) Creamos una instancia de cada tipo de Auto
        Auto nafta  = new AutoNaftero();
        Auto diesel = new AutoDiesel();
        Auto gnc    = new AutoGNC();

        // 2) Cargamos $300 de combustible en cada uno
        nafta.cargar(300);
        diesel.cargar(300);
        gnc.cargar(300);

        // 3) Intentamos recorrer 100 km con cada uno
        nafta.recorrer(100);
        diesel.recorrer(100);
        gnc.recorrer(100);

        // 4) Mostramos salida y estado final de cada objeto
        System.out.println();
        System.out.println("=== Estado final de cada auto ===");
        System.out.printf("AutoNafta: km recorridos: %.2f, combustible restante: %.4f%n",
                           nafta.km, nafta.combustible);
        System.out.printf("AutoDiesel: km recorridos: %.2f, combustible restante: %.4f%n",
                           diesel.km, diesel.combustible);
        System.out.printf("AutoGNC: km recorridos: %.2f, combustible restante: %.4f%n",
                           gnc.km, gnc.combustible);
    }
}
