package bank;

public class Bank {
    private Cuenta accountOne;
    private Cuenta accountTwo;
    // Nuevas cuentas
    private Cuenta accountThree;
    private Cuenta accountFour;
    private Cuenta accountFive;

    public Bank() {
        accountOne = new Cuenta("Zeus", 100, "1");
        accountTwo = new Cuenta("Hades", 200, "2");
        // Perfiles añadisos
        accountThree = new Cuenta("Poseidon", 300, "3");
        accountFour = new Cuenta("Athena", 400, "4");
        accountFive = new Cuenta("Ares", 500, "5");
    }

    public static void main(String[] args) {
    Bank banckOfGods = new Bank();
    
        System.out.println("Balance de Zeus: " + banckOfGods.accountOne.getBalance());
        System.out.println("Balance de Hades: " + banckOfGods.accountTwo.getBalance());
        System.out.println("Balance de Poseidon: " + banckOfGods.accountThree.getBalance());
        System.out.println("Balance de Athena: " + banckOfGods.accountFour.getBalance());
        System.out.println("Balance de Ares: " + banckOfGods.accountFive.getBalance());
    }
}