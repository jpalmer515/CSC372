import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


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
        MenuButton bankMenuButton = new MenuButton("Bank Menu", dateTimeDisplay, logTextContents, randomHueGreen, exitProgram);

        //Creating a vertical menu button with user options
        VBox verticalBankMenu = new VBox(bankMenuButton);

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
