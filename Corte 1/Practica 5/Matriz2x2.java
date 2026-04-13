//PRACTICA CORRESPONDIENTE A LA SUMA Y MULTIPLICACION DE MATRICEZ 2X2
//arreglo tiene tamaño fijo y dependen de 
package matriz2x2; // get y set

import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Matriz2x2 {
    
   private int [][]data;
    private int filas;
    private int columnas;
    
    public Matriz2x2(){
        filas = 2;
        columnas = 2;
        data = new int [filas][columnas];
    }
    
    public void setMatriz(){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i < filas; i++){
            for(int j=0;j< columnas;j++){
                System.out.print("data["+i+"]["+j+"]:");
                data[i][j] = sc.nextInt();
            }
        }
    }
    
    public void getMatriz(){
        System.out.println("\n Matriz 2x2:");
         for(int i=0;i < filas; i++){
            for(int j=0;j< columnas;j++){
                System.out.print(data[i][j]+"");
            }
            System.out.println();
        }
    }
   
    public Matriz2x2 sumar(Matriz2x2 otra) {
    Matriz2x2 resultado = new Matriz2x2();
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            resultado.data[i][j] = this.data[i][j] + otra.data[i][j];
        }
    }
    return resultado;
}
        
        
public Matriz2x2 mult (Matriz2x2 m) {
    Matriz2x2 resultado = new Matriz2x2 ();
        for (int i = 0; i < filas ; i ++) {
            for (int j = 0; j < columnas ; j ++) {
            resultado.data[i][j]= this . data [i][0] * m.data [0][j] 
                                + this . data [i][1] * m.data [1][j];
        }
    }

 return resultado ;
 }
    
    //sumar matrizes
  public static void main(String[] args) {
    Matriz2x2 m1 = new Matriz2x2();
    Matriz2x2 m2 = new Matriz2x2();

    System.out.println("LLENAR MATRIZ 1:");
    m1.setMatriz();
    
    System.out.println("LLENAR MATRIZ 2:");
    m2.setMatriz();

    // Operación de Suma
    Matriz2x2 resultadoSuma = m1.sumar(m2);
    System.out.println("\nLA SUMA ES:");
    resultadoSuma.getMatriz();

    // Operación de Multiplicación
    Matriz2x2 resultadoMult = m1.mult(m2);
    System.out.println("\nLA MULTIPLICACIÓN ES:");
    resultadoMult.getMatriz();
}  
}
