
package constructores;

public class Producto {
  public String nombre ;
 public double precio ;

// Constructor 1
 public Producto () {
 }

 // Constructor 2
 public Producto ( String nombre ) {
 this . nombre = nombre ;
 }

 // Constructor 3
 public Producto ( String nombre , double precio ) {
 this . nombre = nombre ;
 this . precio = precio ;
 }

 public void mostrar () {
 System .out. println (" Nombre = " + nombre );
 System .out. println (" Precio = " + precio );
 }  
}
