import java.util.ArrayList;
public class TP_EJ2 {
    public static void main(String[] args) {
        Entrenamiento carlosPower = new BoxeoVirtual();
        carlosPower.setNombreAvatar("Carlos Power");
        Entrenamiento luciaDance = new ZumbaGalactica();
        luciaDance.setNombreAvatar("Lucia Dance");
        Entrenamiento ramiroSnack = new LevantamientoDeComida();
        ramiroSnack.setNombreAvatar("Ramiro Snack");
        ArrayList<Entrenamiento> gimnasio = new ArrayList<>();
        gimnasio.add(carlosPower);
        gimnasio.add(luciaDance);
        gimnasio.add(ramiroSnack);
        
        for(int i = 0; i<gimnasio.size();i++){
            gimnasio.get(i).realizar();
        }
    }
}
