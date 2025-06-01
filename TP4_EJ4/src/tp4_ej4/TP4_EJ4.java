
package tp4_ej4;

public class TP4_EJ4 {

    public static void main(String[] args) {
        
         // a) Crear un depósito con dos formaciones
        Deposito deposito = new Deposito();

        // Primera formación (con dos locomotoras, que pueda moverse)
        Formacion f1 = new Formacion();
        f1.agregarVagon(new VagonPasajeros(10000, 50));
        f1.agregarVagon(new VagonCarga(8000));
        f1.agregarLocomotora(new Locomotora(10000, 40000, 80));
        f1.agregarLocomotora(new Locomotora(9000, 35000, 100));

        // Segunda formación (sin locomotoras)
        Formacion f2 = new Formacion();
        f2.agregarVagon(new VagonCarga(9000));
        f2.agregarVagon(new VagonCarga(9500));

        // Agregar formaciones al depósito
        deposito.agregarFormacion(f1);
        deposito.agregarFormacion(f2);

        // b) Agrega 3 locomotoras sueltas en el depósito
       deposito.agregarLocomotoraSuelta(new Locomotora(8000, 32000, 80));
       deposito.agregarLocomotoraSuelta(new Locomotora(9000, 36000, 80));
       deposito.agregarLocomotoraSuelta(new Locomotora(7000, 28000, 80));


        // c) Muestra la información de las formaciones que hay en el depósito
        System.out.println("Formaciones antes de completar:");
        deposito.mostrarFormaciones();

        // d) Completa las formaciones que no pueden moverse con locomotoras sueltas
        deposito.completarFormacionesConLocomotoras();

        // e) Muestra cómo quedaron las formaciones que hay en el depósito
        System.out.println("Formaciones después de completar:");
        deposito.mostrarFormaciones();
        
    }
    
}
