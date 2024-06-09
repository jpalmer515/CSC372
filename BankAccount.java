// Create getVariable and setVariable for variables
// Create constructor with the name of the class. Set balance to zero
// Create basic returns for deposit, withdrawal, balance and summary

public class BankAccount {
    
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount() {
        this.balance = 0.00;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void deposit(double depositAmount) {
            balance = balance + depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
            balance = balance - withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(accountID);
            System.out.println(balance);
    }
}
