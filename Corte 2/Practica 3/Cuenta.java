
package banck;
public class Cuenta {
private String name;
private int balance;
private String id;
private double interestRate;

public Cuenta(String inputName, int inputBalance,String inputId){
    this.name =inputName;
    this.balance =inputBalance;
    this.id =inputId;
    this.interestRate=0.02;
}

public int getBalance(){
    return this.balance;
}

public void setBalance( int newBalance){
    this.balance=newBalance;
}

public double getMonthlyInterenst(){
    return this.interestRate=this.balance;
}
    
}
