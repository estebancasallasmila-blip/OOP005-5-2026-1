

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
    
    // FUNCION SUMA
    public int sum(){
        int t =0;
        for(int i =0; i< n; i++ ) t += data[i];
        return t;
    }
    
    //Da un promedio de los valores del vector
    public double mean (){
        if (n==0) return 0.0;
        return (double) sum()/(double) n;
    }
    
    //Busca el valor maximo
    public int max (){
        int m = data[0];
        for (int i =1; i< n;i++){
            if (data[i] > m) m = data[i];
        }
        return m;
    }
    
    //Busca el valor minimo
    public int min (){
        int p = data[0];
        for (int i = 1; i< p;i++){
            if (data[i] < p) p = data[i];
        }
        return p;
    }
    
    public static void main(String[] args) {
              Arreglos obj = new Arreglos(5); // Crea el objeto
        obj.registrarDatos();            // Llama a la funcion de escribir
        obj.mostrar("Resultado Final");  // Llama a la funcion de extraer
    
        System.out.println("La suma del vector es: " + obj.sum());
        System.out.println("El promedio del vector es: " + obj.mean());
        System.out.println("El valor maximo que contiene el vector es: " + obj.max());
        System.out.println("El valor minimo que contiene el vector es: " + obj.min());
    }
} 
