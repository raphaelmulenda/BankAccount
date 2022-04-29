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

    // original code
  /*  public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }*/

    // Implementing synchronize keyword

    // first methode of synchronization
    public synchronized void deposit(double amount){
        balance += amount;
    }

    // Alternative way of synchronization.

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
        }
    }

    public double currentBalance(){
        return balance;
    }




}
