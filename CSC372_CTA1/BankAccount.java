package CSC372_CTA1;
//Setup constructor with variables
//Need a list to hold transaction information
//Use list to hold customer information, that will validate their balance and transaction history

import java.util.Scanner;
import java.util.ArrayList;
public class BankAccount {
    Scanner userInput = new Scanner(System.in);

    ArrayList accountInformation = new ArrayList();
    
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    //Person object
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

    public void initializeBalance() {
        try {
            this.balance = 0.00;
        }
        catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    public double deposit() {
        try {
            System.out.println("Please enter the amount you'd like to deposit: ");
            double depositAmount = userInput.nextDouble(); 
            balance = balance + depositAmount;
            System.out.printf("Your new balance: $" + balance);
        }
        catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    public double withdrawal() {
        try {
            System.out.println("Please enter the amount you'd like to withdraw: ");
            double withdrawalAmount = userInput.nextDouble();
            balance = balance - withdrawalAmount;
            System.out.printf("Your new balance: $" + balance);
        }
        catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        try {
            System.out.printf("Your balance is: $" + balance);
            System.out.println("Below is your account transaction history: ");
            System.out.println("-------------------------------------------");
            System.out.println(accountInformation);
        }
        catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }
}
