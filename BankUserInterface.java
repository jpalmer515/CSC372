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
        
        //Set layout random green hues
        verticalBankMenu.setStyle("-fx-background-color: #336600");
        verticalBankMenu.setStyle("-fx-background-color: #1a6600");
        verticalBankMenu.setStyle("-fx-background-color: #33cc59");
        verticalBankMenu.setStyle("-fx-background-color: ##339933");
        verticalBankMenu.setStyle("-fx-background-color: #009900");
        verticalBankMenu.setStyle("-fx-background-color: #00ff00");

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
