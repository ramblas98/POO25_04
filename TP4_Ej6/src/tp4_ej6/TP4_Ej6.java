package tp4_ej6;


public class TP4_Ej6 {

    public static void main(String[] args) {
        BibliotecaPersonal biblioteca = new BibliotecaPersonal();
        Lectura l1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez",417,4.8,Genero.ficcion,1967);
        Lectura l2 = new Comic("Spider-Man","Stan Lee",32,4.5,"Steve Ditko",true);
        Lectura l3 = new Revista("Nacional Geographic","Varios Autores",100,4.7,202,Tematica.ciencia);
        
        biblioteca.agregar(l1);
        biblioteca.agregar(l2);
        biblioteca.agregar(l3);
        biblioteca.agregar(l1);
        
        System.out.print(biblioteca.obtenerMayorCalificacion().resumen());
        System.out.print(biblioteca.obtenerMenorCalificacion().resumen());
        
        
        biblioteca.resumenGeneral();
        System.out.println("\nEl tiempo total de lectura de toda la biblioteca es de: "+biblioteca.tiempoTotalLectura()+" horas");
    }
    
}
