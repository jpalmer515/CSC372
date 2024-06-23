import java.util.Scanner;

public class Recursion {

    //User input for the integers
    int recursionNumber = UserInput.nextInt();

    //Recursive method, multiplying use integers
    public int product(int n) {
    
    System.out.println("Please enter a whole number: ");
    
    if (n < 6) {
        return product(n * recursionNumber);
    }
    else
        return n;
        System.out.println(n);
    }
}
