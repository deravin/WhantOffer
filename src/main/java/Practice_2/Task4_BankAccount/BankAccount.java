package Practice_2.Task4_BankAccount;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }
    String getOwner(){
        return owner;
    }
    double getBalance(){
        return balance;
    }
    void setOwner(String owner){
        this.owner=owner;
    }
    double deposit(double amount){
        return balance += amount;
    }
    double withdraw(double amount){
        return balance -= amount;
    }
    void printBalance(){
        System.out.println("Balance " + balance);;
    }

}
