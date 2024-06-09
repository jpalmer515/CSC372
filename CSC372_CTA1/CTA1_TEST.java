

package CSC372_CTA1;

public class CTA1_TEST {
    
    double depositAmount;
    double withdrawalAmount;

    public CTA1_TEST() {
        double depositAmount = 180.00;
        double withdrawalAmount = 150.00;
    }

    public void testDeposit() {
        BankAccount depositAccount = new BankAccount();
        depositAccount.deposit(depositAmount);
        if (Double.compare(depositAccount.balance, depositAmount) == 0) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    //Deposit then withdraw so that value is positive
    public void testWithdrawal() {
        BankAccount withdrawalAccount = new BankAccount();
        withdrawalAccount.deposit(depositAmount);
        withdrawalAccount.withdrawal(withdrawalAmount);
        if (Double.compare(withdrawalAccount.balance, withdrawalAmount) >= 0) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    // Don't think I need this test
    // public void testAccountSummary() {
    
    // }

    public void processWithdrawal() {
        BankAccount withdrawalAccount = new BankAccount();
        withdrawalAccount.withdrawal(withdrawalAmount);
        if (Double.compare(withdrawalAccount.balance, withdrawalAmount) <= -0.01) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    // Don't think I need this test
    // public void testDisplayAccount() {
 
    // }
}
