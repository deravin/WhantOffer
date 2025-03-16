package Practice_2_1.Task_4;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.balance = balance;
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void setOwner (String owner){
        this.owner = owner;
    }
    public double deposit(double amount){
        return balance = balance + amount;
    }
    public double withdraw(double amount){
        return balance = balance - amount;
    }
    public void printBalance(){
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Owner", 1000);
        bankAccount1.deposit(500.98989);
        bankAccount1.withdraw(400.9876);
        bankAccount1.printBalance();
    }
}
