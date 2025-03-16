package Practice_2.Task4_BankAccount;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("Anna", 1000);
        bankAccount1.deposit(200);
        bankAccount1.withdraw(400);
        bankAccount1.printBalance();
    }
}
