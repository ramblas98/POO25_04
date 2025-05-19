import java.util.ArrayList;
public class TP4_EJ1 {
    public static void main(String[] args) {
        ArrayList<Figura> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double aleatorio = Math.random();
           if(aleatorio > 0.5){
            int aleatorioBase = 1 + (int)(Math.random() * (20 - 1));
            int aleatorioAltura = 1 + (int)(Math.random() * (20 - 1));
            lista.add(new Rectangulo(aleatorioBase,aleatorioAltura));
           }else{
            int radio = 1 + (int)(Math.random() * (20-1));
            lista.add(new Circulo(radio));
           }
        }
        /* 
        for (Figura figura : lista) {
            System.out.println(figura.toString());
        }
        */

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Rectangulo) {
                System.out.println("El elemento " + (i+1) + " es un Rectangulo");
                System.out.println("Su area es: " + lista.get(i).area());
                Rectangulo r = (Rectangulo)lista.get(i);
                System.out.println(r);
            }else{
                System.out.println("El elemento " + (i+1) + " es un Circulo");
                System.out.println("Su area es: " + lista.get(i).area());
                Circulo c = (Circulo)lista.get(i);
                System.out.println(c);
            }
        }

        System.out.println(lista.size());
    }
}