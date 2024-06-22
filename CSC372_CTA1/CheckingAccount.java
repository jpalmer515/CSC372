//Apply interest rate (when? what triggers the interest rate?)
//Every time the withdrawal method is done, have it run the overdraftFee method
//Check against a balance < 0.00

public class CheckingAccount extends BankAccount {

    public void withdrawal(double withdrawalAmount) {
        super.withdrawal(withdrawalAmount);
        if (balance < 0) {
            processWithdrawal();
        }
    }

    public void processWithdrawal() {
        balance = balance - 30.00;
        System.out.println(balance);
        System.out.println("Overdraft Fee: -30.00");
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest rate is 5% APY.");
    }
}
