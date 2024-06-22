import java.util.*;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class BankUserInterface extends Application {

    @Override
    public void start(Stage newBankInterface) throws Exception{

        //Creating a random generator
        Random rand = new Random();

        //Setting min and max variables so that the rgb stays within 0-255
        int minGreen = 100;
        int maxGreen = 255;
        int minRedBlue = 0;
        int maxRedBlue = 125;

        newBankInterface.setTitle("Bank Menu");

        //Setting what the menu items display
        MenuItem dateTimeDisplay = new MenuItem("Date/Time");
        MenuItem logTextContents = new MenuItem("Write to Log");
        MenuItem randomHueGreen = new MenuItem("Change Background");
        MenuItem exitProgram = new MenuItem("Exit");

        //Creating menu buttons
        MenuButton bankMenuButton = new MenuButton("Bank Menu", null, dateTimeDisplay, logTextContents, randomHueGreen, exitProgram);

        //Creating text field
        TextField emptyFieldOne = new TextField();
        
        //Creating a vertical menu button with user options
        VBox verticalBankMenu = new VBox(bankMenuButton, emptyFieldOne);
        
        //Create a new scene
        Scene bankInterfaceScene = new Scene(verticalBankMenu, 200, 100);
        verticalBankMenu.setStyle("-fx-background-color: #33cc33");
        newBankInterface.setScene(bankInterfaceScene);
        newBankInterface.show();
        
        //Retrieving and displaying the date and time
        dateTimeDisplay.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                String currentDateTime = new SimpleDateFormat("yyyy-mmm-dd HH:mm").format(new Date());
                emptyFieldOne.setText("Date/Time: " + currentDateTime);
            }
        });
        
        //Convert text box string into a "log.txt" file
        logTextContents.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                String fieldOneString = emptyFieldOne.getText();
                String logFilePath = "C:\\Users\\Jake\\OneDrive\\Desktop\\Folder\\School\\CSU Global\\CSC372\\CSC372_CTA3\\log.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath))) {
                    writer.write(fieldOneString);
                    writer.newLine();
                    System.out.printf("\n Text field has converted to log.txt \n");
                    } 
                catch (IOException e) {
                            System.out.println("\nAn error has occurred" + e.getMessage());
                    }
            }
        });

        //Change background color to different hue of green
        randomHueGreen.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                //Generate random rgb numbers, with green always being higher so it will always be a green hue
                float r = rand.nextFloat(maxRedBlue - minRedBlue) + minRedBlue;
                float g = rand.nextFloat(maxGreen - minGreen) + minGreen;
                float b = rand.nextFloat(maxRedBlue - minRedBlue) + minRedBlue;

                //Applying random rgb to background layer
                verticalBankMenu.setStyle("-fx-background-color: rgb("+ r + "," + g + "," + b + ");");
                System.out.println(r + "," + g + "," + b + " test 1");
                System.out.println(r+g+b+" test 2");
            }
        });

        //Exit the program
        exitProgram.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                System.out.println("Exiting Successfully");
                System.exit(0);
            }
        });

    }
    //To launch the new application
    public static void main(String[] args) {

        launch(args);
    }
}
