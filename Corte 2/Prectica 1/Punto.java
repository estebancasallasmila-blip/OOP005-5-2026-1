
package Constructores;

/**
 *
 * @author esteban
 */

public class Punto{
    // Ejercicio 1: Atributos x y y
    public int x;
    public int y;

    // Ejercicio 2: Constructor vacío (pone el punto en 0,0)
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Ejercicio 2: Constructor con dos parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mostrar() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }
}