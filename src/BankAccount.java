import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Raphael Mulenda on 29/04/2022.
 */

public class BankAccount {
    private double balance;
    private String accountNumber;
    Lock keyLock;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.keyLock = new ReentrantLock();
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
        try {
            balance += amount;
        }
        finally {
            keyLock.unlock();
        }

    }



    public void withdraw(double amount) {
            keyLock.lock();
            try {
                balance -= amount;
            }

            finally {
                keyLock.unlock();
            }

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
