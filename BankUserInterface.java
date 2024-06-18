import java.util.*;
import java.awt.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class BankUserInterface extends Application {

    @Override
    public void start(Stage newBankInterface) throws Exception{

        newBankInterface.setTitle("Bank Menu");

        //Setting what the menu items display
        MenuItem dateTimeDisplay = new MenuItem("Date/Time");
        MenuItem logTextContents = new MenuItem("Write to Log");
        MenuItem randomHueGreen = new MenuItem("Change Background");
        MenuItem exitProgram = new MenuItem("Exit");

        //Creating menu buttons
        MenuButton bankMenuButton = new MenuButton("Bank Menu", null, dateTimeDisplay, logTextContents, randomHueGreen, exitProgram);

        //Creating a vertical menu button with user options
        VBox verticalBankMenu = new VBox(bankMenuButton);


        //Creating text field
        Textfield emptyFieldOne = new TextField();

        //Create a new scene
        Scene bankInterfaceScene = new Scene(verticalBankMenu, 200, 100);
        bankInterfaceScene.setFill(Color.GREEN);
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
                String logFilePath = "C:\\Users\\Jake\\OneDrive\\Desktop\\Folder\\School\\CSU Global\\CSC372\\CSC372_CTA3.txt";
                BufferedWriter logWriter = new BufferedWriter(new FileWriter(logFilePath)) {
                    logWriter.write(emptyFieldOne);
                }
            }
        });

        //Change background color to different hue of green
        randomHueGreen.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {

            }
        });

    }
    //To launch the new application
    public static void main(String[] args) {

        launch(args);
    }
}
