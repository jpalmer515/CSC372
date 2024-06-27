import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {

    //Creating a new scanner for user inputs
    static Scanner userInput = new Scanner(System.in);

    //Method for performing recursion
    public static double multiplyFiveNumbersFromUser(int numberOfLoops) {

        try {
            if (numberOfLoops <= 0) {
                return 1;
            }
            System.out.println("Enter a number: ");
            double numberFromUser = userInput.nextDouble();
            return numberFromUser *= multiplyFiveNumbersFromUser(numberOfLoops - 1);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid entry");
            return 1.00;
        }
    }

    public static void main(String[] args) {
        System.out.println(multiplyFiveNumbersFromUser(5));
    }
}
