// Question: This program determines whether a given number is odd or even. 
// It takes an input from the user, representing a number, and then checks 
// if the number is divisible by 2. If the number is divisible by 2, 
// it is considered an even number, and the program displays a message indicating 
// that the number is even. If the number is not divisible by 2, it is considered an odd number, 
// and the program displays a message indicating that the number is odd.

// Import the Scanner class from the java.util package
import java.util.Scanner;
public class OddEvenNumberChecker {
    public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        int number;
        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is odd or even: ");
        number = input.nextInt();
        // Check if the number is odd or even
        if (number % 2 == 0){
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
        // Close the Scanner object
        input.close();
    }
}
