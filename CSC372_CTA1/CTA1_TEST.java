

package CSC372_CTA1;

public class CTA1_TEST {

    public void testDeposit() {
        BankAccount depositAccount = new BankAccount();
        depositAccount.deposit(100.00);
        if (Double.compare(depositAccount.balance, 100.00) == 0) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    //Deposit then withdraw so that value is positive
    public void testWithdrawal() {
        BankAccount withdrawalAccount = new BankAccount();
        withdrawalAccount.deposit(100.00);
        withdrawalAccount.withdrawal(100.00);
        if (Double.compare(withdrawalAccount.balance, 0.00) == 0) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    // Don't think I need this test
    // public void testAccountSummary() {
    
    // }

    public void processWithdrawal() {
        CheckingAccount withdrawalAccount = new CheckingAccount();
        withdrawalAccount.withdrawal(150.00);
        if (Double.compare(withdrawalAccount.balance, -180.00) == 0) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    // Don't think I need this test
    // public void testDisplayAccount() {

    // }
}
