import java.util.Scanner;

public class Recursion {

    //Creating a new scanner for user inputs
    Scanner UserInput = new Scanner(System.in);

    //Method for performing recursion
    public int multiplyFiveNumbers(int n) {

        //Requesting user input for an integer
        int recursionNumber = UserInput.nextInt();
        System.out.println("Please enter a whole number: ");

        if (n = recursionNumber) {
            return recursionNumber;
        }
        return n * recursionNumber;
    }

    //Main method for printing the outcome of the multiplyFiveNUmbers method
    public static void main(String[] args) {
        System.out.println(multiplyFiveNumbers());
    }
}
