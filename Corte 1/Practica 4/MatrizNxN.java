package matriznxn;

/**
 *
 * @author E
 */
import java.util.Scanner;

public class MatrizNxN {
    
    public int[][] data;
    public int filas;
    public int columnas;
    
    public MatrizNxN(int n) {
        filas = n;
        columnas = n;
        data = new int[filas][columnas];
    }
    
    public void set() {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }
    
    public void get() {
        System.out.println("\nMatriz " + filas + "x" + columnas + ":");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño n de la matriz: ");
        int n = entrada.nextInt();
        
        MatrizNxN m = new MatrizNxN(n);
        m.set();
        m.get();
    }
}
