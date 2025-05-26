
package tp4_ej6;

public class TP4_EJ6 {

    public static void main(String[] args) {
        
        // Crear biblioteca con capacidad para 10 lecturas
        BibliotecaPersonal miBiblioteca = new BibliotecaPersonal(10);

        // Crear objetos de tipo Libro, Comic y Revista
        Libro libro1 = new Libro(Genero.Novela, 1995, "1984", "George Orwell", 328, 9);
        Comic comic1 = new Comic("Stan Lee", Color.Color, "Spider-Man", "Stan Lee", 120, 8);
        Revista revista1 = new Revista(45, Tematica.Ciencia, "National Geographic", "Editorial NG", 70, 7);

        Libro libro2 = new Libro(Genero.Ensayo, 2022, "Sapiens", "Yuval Noah Harari", 412, 10);
        Comic comic2 = new Comic("Todd McFarlane", Color.BlancoYNegro, "Spawn", "Todd", 150, 6);

        // Agregar lecturas
        miBiblioteca.AgregarLectura(libro1);
        miBiblioteca.AgregarLectura(comic1);
        miBiblioteca.AgregarLectura(revista1);
        miBiblioteca.AgregarLectura(libro2);
        miBiblioteca.AgregarLectura(comic2);

        // Mostrar resumen general
        System.out.println("\n--- Resumen General ---");
        miBiblioteca.ResumenGeneral();

        // Obtener lectura con mayor calificación
        Lectura mayor = miBiblioteca.LecturaMayor();
        System.out.println("\nLectura con Mayor Calificacion: " + mayor.getTitulo() + " (" + mayor.getPuntuacion() + ")");

        // Obtener lectura con menor calificación
        Lectura menor = miBiblioteca.LecturaMenor();
        System.out.println("Lectura con Menor Calificacion: " + menor.getTitulo() + " (" + menor.getPuntuacion() + ")");

        // Calcular tiempo total estimado de lectura
        System.out.println("\nTiempo total estimado de lectura: " + miBiblioteca.TiempoTotal() + " Horas");

        // Eliminar una lectura por título
        System.out.println("\nEliminando 'Spawn'...");
        miBiblioteca.ElminarLectura("Spawn");

        // Mostrar resumen nuevamente
        System.out.println("\n--- Resumen Tras Eliminacion ---");
        miBiblioteca.ResumenGeneral();
        
    }
    
}
