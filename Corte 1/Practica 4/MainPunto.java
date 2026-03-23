package Constructores;

public class MainPunto {
    public static void main(String[] args) {
         //Objeto usando el constructor vacío
        Punto p1=new Punto();
        
        // Objeto usando el constructor con parámetros
        Punto p2 = new Punto(5, 10);
        
        // Otro objeto con diferentes valores
        Punto p3 = new Punto(-3, 7);

        System.out.println("Punto 1 (vacío):");
        p1.mostrar();

        System.out.println("\nPunto 2 (con datos):");
        p2.mostrar();

        System.out.println("\nPunto 3 (con datos):");
        p3.mostrar();
    }
}
