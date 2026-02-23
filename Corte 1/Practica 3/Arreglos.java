
package arreglos;
import java.util.Scanner; // Herramienta para leer teclado
public class Arreglos {

    public int[] data; // El vector/array
    public int n;      // Tamaño

    // Constructor: Crea la base
    public Arreglos(int n) {
        this.n = n;
        this.data = new int[n];
    }
    
    // Método para inscribir datos
    public void registrarDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe " + n + " numeros:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Numero en posicion [" + i + "]: ");
            data[i] = entrada.nextInt(); // Guarda lo que escribes
        }
    }
    
    // Método para extraer y mostrar
    public void mostrar(String nombre) {
        System.out.print(nombre + " = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i < n - 1) System.out.print(" , ");
        }
        System.out.println(" ]");
    } 
    
    public static void main(String[] args) {
              Arreglos objeto = new Arreglos(5); // Crea el objeto
        objeto.registrarDatos();            // Llama a la funcion de escribir
        objeto.mostrar("Resultado Final");  // Llama a la funcion de extraer
    }
} 
   
    
    


