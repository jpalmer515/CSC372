import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BankAccountGUI {
    
    static JFrame frame;

    static JButton buttonOne, buttonTwo, buttonThree, buttonFour;

    static JLabel label;

    static JTextField fieldBalance, fieldDeposit, fieldWithdraw;

    // private void initialize() {

    // }

    public static void main(String[] args) {

        //Initializing a frame with a title and a label for the menu
        frame = new JFrame("Bank Account");
        label = new JLabel("Bank Balance");

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

        //Adding text fields
        panelOne.add(fieldBalance);
        panelOne.add(fieldDeposit);
        panelOne.add(fieldWithdraw);

        //Setting the background of the panel
        panelOne.setBackground(Color.lightGray);

        //Setting label color and size
        label.setForeground(Color.CYAN);
        label.setSize(50, 50);

        //Setting the frame size
        frame.setSize(500, 500);

        //Setting frame location
        frame.setLocationRelativeTo(null);
        
        //Populating the frame
        frame.setVisible(true);
        
        //Adding the panel to the frame
        frame.add(panelOne, BorderLayout.CENTER);

        //Exit Action
        buttonFour.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting Successfully");
                frame.dispose();
            }
        });

    }
}
