package datosestudiantiles;
//ACTIVIDAD REALIZADA SEGUN LA GUIA
/**
 *
 * @author esteb
 */

        import java.util.Scanner;

    public class DatosEstudiantiles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // PEDIR DATOS USANDO Scanner
        System.out.print("Ingrese su ciudad: ");
        String ciudad = sc.nextLine();

        System.out.print("Ingrese su semestre (numero): ");
        int semestre = sc.nextInt();

        System.out.print("Ingrese su promedio: ");
        double promedio = sc.nextDouble();

        //IMPRIMIR DATOS
        System.out.println("\n--- Resumen Academico ---");
        System.out.println("Ciudad de residencia: " + ciudad);
        System.out.println("Semestre actual: " + semestre );
        System.out.println("Promedio acumulado: " + promedio);

        sc.close();
    }
}
    
