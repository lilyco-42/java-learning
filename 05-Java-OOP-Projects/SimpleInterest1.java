// QUESTION: This program is designed to calculate the simple interest  using the formula:
// S.I = (P * T * R) / 100

// where:
// P represents the principal amount (the initial sum of money).
// T represents the time period (the duration for which the money is borrowed or invested).
// R represents the rate of interest per unit time.
// The program takes input for the values of P, T, and R, and then uses these values to calculate the simple interest. 
// Finally, it displays the calculated simple interest as the output.

// Importing the Scanner class from the java.util package
import java.util.Scanner;

public class SimpleInterest1 {
    public static void main(String[] args) {
        // Print the purpose of the program
        System.out.println("A Java program to calculate Simple Interest ");

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double principal = 0;
        double time = 0;
        double rate = 0;
        double simpleInterest = 0;

        // Prompt the user to input principal, time, and rate
        System.out.print("Enter the principal value: ");
        principal = input.nextDouble();
        System.out.print("Enter the time taken: ");
        time = input.nextDouble();
        System.out.print("Enter the rate value: ");
        rate = input.nextDouble();

        // Calculate the simple interest using the provided formula
        simpleInterest = (principal * time * rate) / 100;

        // Display the simple interest with formatting to 2 decimal places
        System.out.printf("The simple interest is %.2f\n", simpleInterest);

        // Close the Scanner object
        input.close();
    }
}
