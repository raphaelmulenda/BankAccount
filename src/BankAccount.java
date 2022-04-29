/**
 * Created by Raphael Mulenda on 29/04/2022.
 */

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public double currentBalance(){
        return balance;
    }
}
