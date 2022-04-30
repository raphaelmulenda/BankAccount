import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Raphael Mulenda on 29/04/2022.
 */
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("12345-678",1000.00);
        Customer customer1 = new Customer("Raphael",300.00,50.00,bankAccount);
        Customer customer2 = new Customer("Marcel",203.75,100.00,bankAccount);
        Customer customer3 = new Customer("Justyna",150.00,200.00,bankAccount);

        customer1.start();
        customer2.start();
        customer3.start();


    }
}