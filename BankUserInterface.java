import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.stage.Stage;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuComponent;
import java.awt.MenuItem;


public class BankUserInterface {

    public void start(Stage newBankInterface) {

        newBankInterface.setTitle("Bank Menu");

        Menu bankMenu = Menu("Menu");

        //Setting what the menu items display
        MenuItem dateTimeDisplay = new MenuItemUI("Date/Time");
        MenuItem logTextContents = new MenuItemUI("Write to Log");
        MenuItem randomHueGreen = new MenuItemUI("Change Background");
        MenuItem exitProgram = new MenuItemUI("Exit");

        //Adding the menu items to the menu
        bankMenu.getItems().add(dateTimeDisplay);
        bankMenu.getItems().add(logTextContents);
        bankMenu.getItems().add(randomHueGreen);
        bankMenu.getItems().add(exitProgram);

        //Create a menubar
        Menubar bankMenuBar = new Menubar();

        //Add menu to menubar
        bankMenuBar.getMenus().add(bankMenu);

        //Create a new scene
        newBankInterface.setScene(sc);
        newBankInterface.show();


    }
}
