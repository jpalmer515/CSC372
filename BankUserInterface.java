import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuComponent;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import javax.swing.*;


public class BankUserInterface extends Application {

    @Override
    public void start(Stage newBankInterface) throws Exception{

        newBankInterface.setTitle("Bank Menu");

        Menu bankMenu = Menu("Menu");

        //Setting what the menu items display
        MenuItem dateTimeDisplay = new MenuItem("Date/Time");
        MenuItem logTextContents = new MenuItem("Write to Log");
        MenuItem randomHueGreen = new MenuItem("Change Background");
        MenuItem exitProgram = new MenuItem("Exit");

        //Creating menu buttons
        MenuButton bankMenuButton = new MenuButton("Bank Menu", dateTimeDisplay, logTextContents, randomHueGreen, exitProgram);

        //Creating a vertical menu button with user options
        Vbox verticalBankMenu = new Vbox(bankMenuButton);

        //Create a menubar
        Menubar bankMenuBar = new Menubar();

        //Add menu to menubar
        bankMenuBar.getMenus().add(bankMenu);

        //Create a new scene
        Scene bankInterfaceScene = new Scene(400, 400, Color.GREEN);
        newBankInterface.setScene(bankInterfaceScene);
        newBankInterface.show();

        dateTimeDisplay.setOnAction((EventHandlerActionEvent)new EventHandlerActionEvent() {

            public void handle(ActionEvent event) {

            }
        });

    }
    //To launch the new application
    public static void main(String[] args) {

        launch(args);
    }
}
