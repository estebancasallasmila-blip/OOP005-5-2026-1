package Clases;

public class MainLibro {
    public static void main(String[] args) {
        // Ejercicio 2: Crear dos objetos distintos
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        // Asignar datos al primer objeto
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";

        // Asignar datos al segundo objeto
        libro2.titulo = "Don Quijote de la Mancha";
        libro2.autor = "Miguel de Cervantes";

        // Usar el método para mostrar los datos
        System.out.println("--- Información del Libro 1 ---");
        libro1.mostrarInfo();

        System.out.println("\n--- Información del Libro 2 ---");
        libro2.mostrarInfo();
    }
}
