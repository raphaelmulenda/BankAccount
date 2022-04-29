/**
 * Created by Raphael Mulenda on 29/04/2022.
 */
public class BankOperation {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345-678",1000.00);
        /*Thread customer1 = new Thread(){

            public void run() {
           bankAccount.deposit(300);
                System.out.println("Customer1" + " Balance after deposit: " + bankAccount.currentBalance() );
           bankAccount.withdraw(50.00);
                System.out.println("Customer1" + " Balance after withdraw: " + bankAccount.currentBalance() );
            }
        };

        Thread customer2 = new Thread() {

            public void run() {
                bankAccount.deposit(250.45);
                System.out.println("Customer2" + " Balance after deposit: " + bankAccount.currentBalance() );
                bankAccount.withdraw(100.00);
                System.out.println("Customer2" + " Balance after withdraw: " + bankAccount.currentBalance() );
            }
        } ;*/

        Thread customer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(300);
                System.out.println("Customer1" + " Balance after deposit: " + bankAccount.currentBalance() );
                bankAccount.withdraw(50.00);
                System.out.println("Customer1" + " Balance after withdraw: " + bankAccount.currentBalance() );
            }
        });

        Thread customer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(250.45);
                System.out.println("Customer2" + " Balance after deposit: " + bankAccount.currentBalance() );
                bankAccount.withdraw(100.00);
                System.out.println("Customer2" + " Balance after withdraw: " + bankAccount.currentBalance() );
            }
        });

        customer1.start();
        customer2.start();
    }

}
