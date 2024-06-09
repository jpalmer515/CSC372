package CSC372_CTA1;
//Setup constructor with variables

public class BankAccount {
    
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;
    private int depositAmount;
    private int withdrawalAmount;

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

    }

    public void withdrawal() {

    }

    public void getBalance() {

    }

    public void accountSummary() {

    }
}
