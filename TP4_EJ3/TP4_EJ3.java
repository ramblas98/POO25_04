import java.util.ArrayList;
public class TP4_EJ3 {
    public static void main(String[] args) {
        ArrayList<Figura> lista = new ArrayList<>();
        
        
        for (int i = 0; i < 10; i++) {
            double aleatorio = Math.random();
           if(aleatorio > 0.5){
            int aleatorioBase = 1 + (int)(Math.random() * (20 - 1));
            int aleatorioAltura = 1 + (int)(Math.random() * (20 - 1));
            lista.add(new Rectangulo(aleatorioBase,aleatorioAltura));
           }else if (aleatorio < 0.2){
            int radio = 1 + (int)(Math.random() * (20-1));
            lista.add(new Circulo(radio));
           }else{
            int min = 2;
            int max = 15;
            int range = max - min + 1;
            double ladoA = (int)(min + Math.random()*range);
            double ladoB = (int)(min + Math.random()*range);
            double ladoC = (int)(min + Math.random()*range);
            lista.add(new Triangulo(ladoA,ladoB,ladoC));
           }
        }

        /* 
        for (Figura figura : lista) {
            System.out.println(figura.toString());
        }
        */

        /*
         * 
        USANDO FOR I
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Rectangulo) {
                System.out.println("El elemento " + (i+1) + " es un Rectangulo");
                System.out.println("Su area es: " + lista.get(i).area());
                Rectangulo r = (Rectangulo)lista.get(i);
                System.out.println(r);
            }else if(lista.get(i) instanceof Circulo){
                System.out.println("El elemento " + (i+1) + " es un Circulo");
                System.out.println("Su area es: " + lista.get(i).area());
                Circulo c = (Circulo)lista.get(i);
                System.out.println(c);
            }else{
                System.out.println("El elemento " + (i+1) + " es un triangulo");
                System.out.println("Su area es: " + lista.get(i).area());
                Triangulo t = (Triangulo)lista.get(i);
                System.out.println(t);
            }
        }
        */

        /*USANDO FOR EACH */
        for (Figura figura : lista) {
            if(figura instanceof Rectangulo){
                System.out.println("es un rectangulo");
                System.out.println(figura);
                System.out.println("Area del rectangulo: " + figura.area());
            }
            if (figura instanceof Circulo) {
                System.out.println("Es un circulo");
                System.out.println(figura);
                System.out.println("Area del circulo: " + figura.area());
            }
            if (figura instanceof Triangulo) {
                System.out.println("Es un triangulo");
                System.out.println(figura);
                System.out.println("Area del triangulo: " + figura.area());
            }
        }
    }
}