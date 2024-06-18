import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BankAccountGUI {
    
    static JFrame frame;

    static JButton buttonOne, buttonTwo, buttonThree, buttonFour;

    static JLabel labelBalance, labelDeposit, labelWithdraw;

    static JTextField fieldBalance, fieldDeposit, fieldWithdraw;

    public static void main(String[] args) {

        //Initializing a frame with a title and a label for the menu
        frame = new JFrame("Bank Account");


        labelBalance = new JLabel("Bank Balance");
        labelDeposit = new JLabel("Deposit Amount");
        labelWithdraw = new JLabel("Withdraw Amount");

        //Initializing buttons to display the account balance, deposit or withdraw money
        buttonOne = new JButton("Balance");
        buttonTwo = new JButton("Deposit");
        buttonThree = new JButton("Withdraw");
        buttonFour = new JButton("Exit");

        //Initializing text fields
        fieldBalance = new JTextField(20);
        fieldDeposit = new JTextField(20);
        fieldWithdraw = new JTextField(20);
        
        //Initializing the panel
        JPanel panelOne = new JPanel();
        
        
        //Adding the button to the new panel
        panelOne.add(buttonOne);
        panelOne.add(buttonTwo);
        panelOne.add(buttonThree);
        panelOne.add(buttonFour);

        //Adding labels with text fields
        panelOne.add(labelBalance);
        panelOne.add(fieldBalance);

        panelOne.add(labelDeposit);
        panelOne.add(fieldDeposit);
        
        panelOne.add(labelWithdraw);
        panelOne.add(fieldWithdraw);

        //Setting the background of the panel
        panelOne.setBackground(Color.lightGray);

        //Setting label color and size
        labelBalance.setForeground(Color.BLUE);
        labelBalance.setSize(50, 50);

        labelDeposit.setForeground(Color.BLUE);
        labelDeposit.setSize(50, 50);

        labelWithdraw.setForeground(Color.BLUE);
        labelWithdraw.setSize(50, 50);

        //Setting the frame size
        frame.setSize(400, 250);

        //Setting frame location
        frame.setLocationRelativeTo(null);
        
        //Populating the frame
        frame.setVisible(true);
        
        //Adding the panel to the frame
        frame.add(panelOne, BorderLayout.CENTER);

        //Instantiating initial bank account balance
        BankAccount grabAccount = new BankAccount();
        String accountBalance = Double.toString(grabAccount.getBalance());
        fieldBalance.setText(accountBalance);

        //Display balance action
        buttonOne.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String accountBalance = Double.toString(grabAccount.getBalance());
                fieldBalance.setText(accountBalance);
            }
        });

        //User deposit action
        buttonTwo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String userDeposit = fieldDeposit.getText();
                grabAccount.deposit(Double.parseDouble(userDeposit));
                fieldBalance.setText(Double.toString(grabAccount.getBalance()));
                fieldDeposit.setText("");
            }
        });

        //User withdraw action
        buttonThree.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String userWithdraw = fieldWithdraw.getText();
                grabAccount.withdrawal(Double.parseDouble(userWithdraw));
                fieldBalance.setText(Double.toString(grabAccount.getBalance()));
                fieldWithdraw.setText("");
            }
        });
        
        // Exit Action
        buttonFour.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting Successfully");
                frame.dispose();
            }
        });
    }
}
