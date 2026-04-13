
package banck;
public class Banck {
    private Cuenta accountOne;
    private Cuenta accountTwo;
    
    public Banck(){
        accountOne =new Cuenta("Zeus",100,"1");
        accountTwo =new Cuenta("Hades",200,"2");
    }
    
    public static void main(String[] args) {
      Banck banckOfGods=new Banck();
      System.out.println(banckOfGods.accountOne.getBalance());
      banckOfGods.accountOne.setBalance(5000);
      System.out.println(banckOfGods.accountOne.getBalance());
      System.out.println(banckOfGods.accountOne.getMonthlyInterenst());
    }
    
}
