import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Raphael Mulenda on 29/04/2022.
 */

public class BankAccount {
    private double balance;
    private String accountNumber;
    ReentrantLock keyLock;

    public BankAccount(String accountNumber, double balance,ReentrantLock rl) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.keyLock = rl;
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
   /* public synchronized void deposit(double amount){
        balance += amount;
    }

    // Alternative way of synchronization.

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
        }
    }
*/

    // In this Part Reentrant Locks will be implemented
    public void deposit(double amount){
        keyLock.lock();
        balance += amount;
        keyLock.unlock();
    }



    public void withdraw(double amount) {
            keyLock.lock();
            balance -= amount;
            keyLock.unlock();

    }



    public double currentBalance(){
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number: " + accountNumber);
    }
}
