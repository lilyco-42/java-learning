// Importing the necessary classes for input and output handling
import java.io.*;

public class StandardDeviation {
    public static void main(String [] args) throws IOException{
        // Informing the user about the purpose of the program
        System.out.println("This program calculates the standard deviation of a set of numbers."); 

        // Initializing variables for calculations
        int numberOfValues = 0;
        double standardDeviation = 0;
        String str;
        double sumOfValues = 0;
        double sumOfSquaredValues = 0;
        double value = 0;
        double meanValue = 0;

        // Creating a BufferedReader object to read user input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Loop for input and calculations
        do {
            System.out.print("Enter a value or (Enter 'done' to finish): ");
            // Reading the user input
            str = bufferedReader.readLine();

            // Break the loop if the user inputs 'done'
            if (str.equalsIgnoreCase("done")) break; // Break the loop if the user inputs 'done'

            // Exception handling for invalid input
            try {
                value = Double.parseDouble(str); // Parsing the input to a double
                if (value < 0) {
                    // Throwing an exception for negative numbers
                    throw new NumberFormatException("Negative numbers are not allowed.");
                }
                // Incrementing the counter for valid values
                numberOfValues++;
                // Updating the sum of values
                sumOfValues += value;
                // Updating the sum of squared values
                sumOfSquaredValues += value * value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } while (true);// Loop until the user enters 'done'

        // Calculating and printing the mean and standard deviation
        if (numberOfValues > 0) {
            meanValue = sumOfValues / numberOfValues;
            standardDeviation = Math.sqrt((numberOfValues * sumOfSquaredValues - sumOfValues*sumOfValues)/(numberOfValues * (numberOfValues-1)));
            System.out.printf("The standard deviation is:  %.2f\n", standardDeviation);
        } else {
            // Printing a message if no valid inputs are entered
            System.out.println("No valid inputs entered.");
        }
    }
}