//import java.util.ArrayList;

public class BoxeoVirtual extends Entrenamiento{
    @Override
    public void realizar(){
        //ArrayList<String> frases = new ArrayList<>();
        //frases.add("¡Eres lento!");
        //frases.add("¿Eso es todo lo que tienes?");
        //frases.add("Mas fuerte!");
        System.out.println(super.nombreAvatar + " acaba de golpear el saco de boxeo");
        //int min = 1;
        //int max = frases.size();
        //int aleatorio = min + (int)(Math.random()*((max-min) + 1));
        //System.out.println(frases.get(aleatorio));
        System.out.println("¡Eres lento!");
    }

    @Override
    public String toString() {
        return "BoxeoVirtual []";
    }

    public BoxeoVirtual(){}
    
}
