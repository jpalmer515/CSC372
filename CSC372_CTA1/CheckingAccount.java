//Apply interest rate (when? what triggers the interest rate?)
//Every time the withdrawal method is done, have it run the overdraftFee method
//Check against a balance < 0.00
package CSC372_CTA1;

public class CheckingAccount extends BankAccount {

    public double processWithdrawal() {
        if ( < 0) {
            balance = balance - 30.00;
            return balance;
        }
    }

    public void displayAccount() {
        System.out.print("Interest rate is 5% APY.");
    }
}
