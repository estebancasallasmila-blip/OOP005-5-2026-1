package calculator;
//Calculadora relizada en la sala
public class Calculator {
    public int x1, x2; 

    public Calculator(int a, int b) { 
        x1 = a;
        x2 = b;
    }
//METODO SUMA
    public int add() {
        return x1 + x2;
    }
//METODO RESTA
    public int subs() {
        return x1 - x2;
    }
//METODO MULTIPLICACION
    public int mult() {
        return x1 * x2;
    }
//METODO DIVISION, con restriccion "x2 != 0"
    public double div() {
        if (x2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; 
        }
   //USO DE DOUBLE PARA  LOS DECIMALES
        return (double) x1 / x2;
    }

    public static void main(String[] args) {
        // Objeto m: Suma y Multiplicación
        Calculator m = new Calculator(34, 43);
        System.out.println("Suma: " + m.add());
        System.out.println("Multiplicación: " + m.mult());

        // Objeto n: Resta
        Calculator n = new Calculator(89, 15);
        System.out.println("Resta: " + n.subs());

        // Objeto p: Prueba de división normal
        Calculator p = new Calculator(10, 2);
        System.out.println("División (10/2): " + p.div());

        // Objeto error: Prueba de división por cero
        Calculator error = new Calculator(10, 0);
        System.out.println("División (10/0): " + error.div());
    }
}
