package CSC372_CTA1;
//Setup constructor with variables
//Need a list to hold transaction information
import java.util.Scanner;
import java.util.ArrayList;
public class BankAccount {
    Scanner userInput = new Scanner(System.in);

    ArrayList transactionHistory = new ArrayList();
    
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;
    private double depositAmount;
    private double withdrawalAmount;
    private double updatedBalance;

    //Person object that will return the following information each time it's actioned
    public void customerInfo() {
        try {
            this.firstName = firstName;
            this.lastName = lastName;
            this.accountID = accountID;
            this.balance = balance;
        }
        catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

        public void deposit() {
            System.out.println("Please enter the amount you'd like to deposit: ");
            double depositAmount = userInput.nextDouble(); 
            updatedBalance = balance + depositAmount;
            System.out.printf("Your new balance: $" + updatedBalance);
        }

        public void withdrawal() {
            System.out.println("Please enter the amount you'd like to withdraw: ");
            double withdrawalAmount = userInput.nextDouble();
            updatedBalance = balance - withdrawalAmount;
            System.out.printf("Your new balance: $" + updatedBalance);
        }

        public void getBalance() {
            System.out.printf("Your balance is: $" + balance);
        }

        public void accountSummary() {
            System.out.printf("Your balance is: $" + balance);
            System.out.println("Below is your account transaction history: ");
            System.out.println("-------------------------------------------");
            System.out.println(transactionHistory);
        }
}
