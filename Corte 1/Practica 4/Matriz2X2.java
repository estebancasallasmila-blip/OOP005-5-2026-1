/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2x2; // get y set

import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Matriz2X2 {
    
   public int [][]data;
    public int filas;
    public int columnas;
    
    public Matriz2X2(){
        filas = 2;
        columnas = 2;
        data = new int [filas][columnas];
    }
    
    public void set(){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i < filas; i++){
            for(int j=0;j< columnas;j++){
                System.out.print("data["+i+"]["+j+"]:");
                data[i][j] = sc.nextInt();
            }
        }
    }
    
    public void get(){
        System.out.println("\n Matriz 2x2:");
         for(int i=0;i < filas; i++){
            for(int j=0;j< columnas;j++){
                System.out.print(data[i][j]+"");
            }
            System.out.println();
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matriz2X2 m = new Matriz2X2();
        m.set();
        m.get();
    }
    
}
