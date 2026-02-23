package calculator; //carpeta llena de clases

//nombre de la clase
public class Calculator {
    public int x1,x2; // variables que varian
   //constructor (tiene el mismo nombre de la clase
    
    public Calculator(int a, int b){ //variables locales
    x1 = a;
    x2 = b;
    }
    public int add(){
    return x1 + x2; //imprime y retorna el numero x1 y x2 por la función
    }
    
    public int subs(){
        return x1 - x2;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // m es el objeto
        Calculator m = new Calculator(34 , 43); // new sintacsis y el constructor
        System.out.println(m.add()); 
        
        Calculator n = new Calculator(89 , 15);
        System.out.println(n.subs()); 
    }
}
