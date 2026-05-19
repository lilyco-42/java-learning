// Question The program defines a method called "factorial" that takes an integer as 
// input and recursively calculates the factorial of that number. In this case, 
// the factorial of a non-negative integer n is the product of all positive integers less than or equal to n.

// Importing the Scanner class from the java.util package
import java.util.Scanner;

public class RecursiveFactorialCalculator {
    // Recursive method to compute the factorial of a non-negative integer
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    // Main method to get user input and test the factorial calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Compute the factorial
            int result = factorial(number);

            // Display the result
            System.out.println("Factorial of " + number + " is: " + result);
        }

        scanner.close(); // Close the scanner
    }
}
