package modificadoresAcceso;

public class Estudiante {
    // Ejercicio 1: Atributos privados
    private String nombre;
    private double nota;

    // Constructor para inicializar al estudiante
    public Estudiante(String nombre, double notaInitial) {
        this.nombre = nombre;
        this.nota = notaInitial;
    }

    // Ejercicio 2: Métodos GET y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        // Ejemplo de protección: que la nota no sea negativa
        if (nota >= 0 && nota <= 5.0) {
            this.nota = nota;
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 5.");
        }
    }
}