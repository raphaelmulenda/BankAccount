/**
 * Created by Raphael Mulenda on 29/04/2022.
 */

public class Customer extends Thread {
    private String CustomerName;
    private double depositAmount;
    private double withdrawAmount;
    private BankAccount bankAccount;

    Customer( String customerName, double depositAmount, double withdrawAmount, BankAccount bankAccount){
        this.CustomerName = customerName;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.bankAccount = bankAccount;
    }


    public void run() {
        synchronized (bankAccount){
            if (depositAmount > 0){
                bankAccount.deposit(depositAmount);
                System.out.println(this.CustomerName +" Deposit: " + depositAmount +"$"+ " Balance: " + bankAccount.currentBalance() + "$" );
            }
            if (withdrawAmount > 0){
                bankAccount.withdraw(withdrawAmount);
                System.out.println(this.CustomerName + " Withdraw: " + withdrawAmount +"$"+ " Balance " + bankAccount.currentBalance() + "$");
            }
            else {
                System.out.println("Please enter a value higher then 0");
            }
        }

    }
}
