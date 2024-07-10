import java.util.Scanner;

public class restart {
    
    //setup scanner
    static Scanner userInput = new Scanner(System.in);

    public static double methodForRecursion() {
        double input = userInput.nextDouble();
        input *= methodForRecursion(); 
        return input; 
    }

    public static void main(String[] args) {
        //return total product of the 5 user entered double numbers
        System.out.println(methodForRecursion());
    }
}

//input*method(input)
//input * input * method
//input * input * input * input * input = number
//
//input * method - number
//number * method
//
// return input * methodForRecursion();    first iteration
// return input * input * methodForRecursion(); 2nd



// return input * input * input * input * input; 2nd


// return input * methodForRecursion();     1st iteration
// return input * methodForRecursion();     2nd iteration
// return input * methodForRecursion();     3rd iteration
// return input * methodForRecursion();     4th iteration
// return input * methodForRecursion();     5th iteration
// return 1                                 base case hit