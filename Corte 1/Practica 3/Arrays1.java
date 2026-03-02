package arrays1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Arrays1 {

    public int[] data; // Arreglo original
    public int n; // Tamaño del arreglo
    public List<Integer> newdata = new ArrayList<>(); // Lista para los elementos seleccionados

    // Constructor que inicializa el vector con valores del 1 al n
    public Arrays1(int n) {
        this.n = n;
        this.data = new int[n];
        for (int i = 0; i < n; i++) {
            this.data[i] = i + 1;
        }
    }

    // Metodo para seleccionar elementos del vector original
    public void setArray(String name) {
        Scanner adc = new Scanner(System.in);
        Scanner opc = new Scanner(System.in);
        
        boolean continuar = true; // Control de salida del ciclo
        int i = 0;

        // Ciclo condicionado por el booleano en lugar de break
        while (i < n && continuar) {
            System.out.print("Ingrese el indice (0 a " + (n - 1) + ") del valor que desea guardar: ");
            int index = adc.nextInt();

            // Verifica que el indice sea valido
            if (index >= 0 && index < n) {
                newdata.add(data[index]);
                System.out.println("Valor " + data[index] + " guardado.");
            } else {
                System.out.println("Indice fuera de rango.");
            }

            System.out.print(" Desea continuar agregando? (Si/No): ");
            String respuesta = opc.nextLine();
            
            // Si el usuario dice "No", el ciclo termina en la siguiente evaluacion
            if (respuesta.equalsIgnoreCase("No")) {
                continuar = false;
            }
            
            i++;
        }
        System.out.println("\n" + name + " = " + newdata);
    }

    // Muestra el contenido del vector inicial
    public void mostrarOriginal() {
        System.out.print("Vector Original = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }

    // Calcula la suma de la nueva lista
    public int sum() {
        int t = 0;
        for (int valor : newdata) {
            t += valor;
        }
        return t;
    }

    // Calcula el promedio de la nueva lista
    public double mean() {
        if (newdata.isEmpty()) return 0.0;
        return (double) sum() / newdata.size();
    }

    // Obtiene el valor mas alto de la lista
    public int max() {
        if (newdata.isEmpty()) return 0;
        int m = newdata.get(0);
        for (int valor : newdata) {
            if (valor > m) m = valor;
        }
        return m;
    }

    // Obtiene el valor mas bajo de la lista
    public int min() {
        if (newdata.isEmpty()) return 0;
        int p = newdata.get(0);
        for (int valor : newdata) {
            if (valor < p) p = valor;
        }
        return p;
    }

    public static void main(String[] args) {
        Arrays1 obj = new Arrays1(8); // Crea objeto con 8 posiciones
        obj.mostrarOriginal();

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Desea guardar elementos en una nueva lista? (Si/No): ");
        String opc = sc.nextLine();

        // Estructura principal de seleccion y reporte
        if (opc.equalsIgnoreCase("Si")) {
            obj.setArray("Nueva Lista");

            if (!obj.newdata.isEmpty()) {
                System.out.println("\nESTADISTICAS DE LA NUEVA LISTA:");
                System.out.println("Suma: " + obj.sum());
                System.out.println("Promedio: " + obj.mean());
                System.out.println("Maximo: " + obj.max());
                System.out.println("Minimo: " + obj.min());
            } else {
                System.out.println("La lista nueva esta vacia.");
            }
        } else {
            System.out.println("Finalizando programa...");
        }
    }
}

