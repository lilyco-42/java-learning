// QUESTION: A java program that uses a for loop to execute the fibonacci series

// Importing the Scanner class from the java.util package
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        // Informing the user about the purpose of the program
        System.out.println("This program generates the Fibonacci series up to a specified number of terms.");
        
        // Creating a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        // Initialize the variables before use
        int firstNum = 0; // First number in the Fibonacci series
        int secondNum = 1; // Second number in the Fibonacci series
        int nextNum; // Variable to hold the next Fibonacci number
        
        // Printing a message indicating the Fibonacci series up to the specified number of terms
        System.out.println("Fibonacci Series up to " + numTerms + " terms:");

        // Loop to generate the Fibonacci series
        for (int i = 1; i <= numTerms; i++){
            System.out.print(firstNum + " "); // Print the current Fibonacci number
            nextNum = firstNum + secondNum; // Calculate the next Fibonacci number
            firstNum = secondNum; // Update the first number with the value of the second
            secondNum = nextNum; // Update the second number with the calculated next value
        }
        // Close the scanner to prevent resource leakage
        scanner.close(); 
    }
}