// Question: This program is designed to find the maximum number from a set of numbers. 
// It works by taking multiple numbers as input and then iterates through the set to 
// determine the largest number among them. The program compares each number with the 
// current maximum number, updating the maximum number if a larger one is found. 
// Finally, it outputs the maximum number from the set of numbers provided as input.

// Import the Scanner class from the java.util package
import java.util.Scanner;

public class FindMaximumNumber {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in); 
        // Prompt the user to enter numbers or type 'done'
        System.out.println("Enter numbers (type 'done' to finish): ");
        // Initialize the variable 'max' to the minimum value an integer can hold
        int max = Integer.MIN_VALUE; 

        // Begin an infinite loop
        while (true) { 
            // Read the next line of input from the user
            String input = scanner.nextLine();
            // Check if the user input is 'done' and exit the loop if the input is 'done'
            if (input.equals("done")) { 
                break; 
            } else {
                // Begin a try block to handle potential NumberFormatException
                try { 
                    // Convert the input string to an integer
                    int num = Integer.parseInt(input);
                    // Check if the current number is greater than the current maximum
                    if (num > max) { 
                        // Update the maximum if the current number is greater
                        max = num; 
                    }
                    
                } catch (NumberFormatException e) {
                    // Catch the NumberFormatException if the input is not a valid number
                    // Notify the user to enter a valid number or 'done'
                    System.out.println("Please enter a valid number or 'done'."); 
                }
            }
        }

        // Check if no valid numbers were entered
        if (max == Integer.MIN_VALUE) { 
            // Print a message indicating that no valid numbers were entered
            System.out.println("No valid numbers entered.");
        } else {
            // If valid numbers were entered
            // Print the maximum number from the input set
            System.out.println("The maximum number is: " + max); 
        }
        // Close the Scanner object to release system resources
        scanner.close(); 
    }
}
