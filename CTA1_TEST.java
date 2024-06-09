// Use if statement for logic to check against variables, printing PASS/FAIL
// Use Double.compare() to get the product of two variables and compare it to the expected outcome
// Create predetermined amounts to ensure outcomes of each test are consistent

public class CTA1_TEST {

    public static void testDeposit() {
        BankAccount depositAccount = new BankAccount();
        depositAccount.deposit(100.00);
        if (Double.compare(depositAccount.balance, 100.00) == 0) {
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL");
    }

    //Deposit then withdraw so that value is positive
    public static void testWithdrawal() {
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

    public static void testProcessWithdrawal() {
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

    public static void main(String[] args) {
        testDeposit();
        testWithdrawal();
        testProcessWithdrawal();
    }
}
