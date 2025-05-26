package TP4_EJ4;
public class Tp_ej4 {
    public static void main(String[] args) {
        // a) Crear depósito con 2 formaciones: una con 2 locomotoras, otra sin locomotoras
        Deposito deposito = new Deposito();

        Formacion f1 = new Formacion();
        f1.agregarLocomotora(new Locomotora(1000));
        f1.agregarLocomotora(new Locomotora(1200));
        f1.agregarVagon(new VagonPasajeros(40, 70));
        f1.agregarVagon(new VagonCarga(3000));
        deposito.agregarFormacion(f1);

        Formacion f2 = new Formacion();
        f2.agregarVagon(new VagonPasajeros(20, 70));
        deposito.agregarFormacion(f2);

        // b) Agregar 3 locomotoras sueltas al depósito
        deposito.agregarLocomotora(new Locomotora(900));
        deposito.agregarLocomotora(new Locomotora(950));
        deposito.agregarLocomotora(new Locomotora(1000));

        // c) Mostrar información de las formaciones
        System.out.println("Formaciones iniciales:");
        deposito.mostrarFormaciones();

        // d) Completar formaciones sin locomotoras con locomotoras sueltas
        deposito.completarFormaciones();

        // e) Mostrar cómo quedaron las formaciones
        System.out.println("\nFormaciones luego de completar:");
        deposito.mostrarFormaciones();
    }
}
