package modificadoresAcceso;

public class MainEstudiante {
    public static void main(String[] args) {
        // Ejercicio 3: Crear el objeto
        Estudiante est = new Estudiante("Esteban", 4.5);

        // Intentar leer el nombre usando el GET
        System.out.println("Nombre del estudiante: " + est.getNombre());
        System.out.println("Nota inicial: " + est.getNota());

        // Modificar la nota usando el SET
        est.setNota(4.8);
        System.out.println("Nota actualizada: " + est.getNota());

        // Probar la protección (si intentas poner una nota inválida)
        est.setNota(-1.0); 
    }
}