//Setup constructor with variables
//Need a list to hold transaction information
package CSC372_CTA1;
//import java.util.Scanner;

public class BankAccount {
    //For requesting user input
    //Scanner userInput = new Scanner(System.in);
    
    String firstName;
    String lastName;
    int accountID;
    double balance;

    //Person object
    public BankAccount() {
        this.balance = 0.00;
    }

    public void getCustomerInfo() {
        System.out.print("Please enter your first name: ");
            //For requesting user input
            //String firstName = userInput.next();
        System.out.print("Please enter your last name: ");
            //For requesting user input
            //String lastName = userInput.next();
        System.out.print("Please enter your account ID: ");
            //For requesting user input
            //int accountID = userInput.nextInt();
    }

    public double deposit() {
            System.out.println("Please enter the amount you'd like to deposit: ");
            //For requesting user input
            //double depositAmount = userInput.nextDouble(); 
            balance = balance + depositAmount;
            return balance;
    }

    public double withdrawal() {
            System.out.println("Please enter the amount you'd like to withdraw: ");
            //For requesting user input
            //double withdrawalAmount = userInput.nextDouble();
            balance = balance - withdrawalAmount;
            return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
            System.out.printf(firstName);
            System.out.println(lastName);
            System.out.println(accountID);
            System.out.println(balance);
    }
}
