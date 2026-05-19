//QUESTION: Write a java program to calculate the Quadratic root of an equation

// Importing the Scanner class from the java.util package
import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args){
        // Informing the user about the purpose of the program
        System.out.println("This program calculates the roots of a quadratic equation based on user-provided coefficients.");

        // Creating a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for coefficients
        double coefficientA;
        double coefficientB;
        double coefficientC;

        // Prompt user for coefficients
        System.out.print("Enter the coefficient of a: ");
        coefficientA = scanner.nextDouble();
        System.out.print("Enter the coefficient of b: ");
        coefficientB = scanner.nextDouble();
        System.out.print("Enter the coefficient of c: ");
        coefficientC = scanner.nextDouble();
        
        // Calculate discriminant
        double discriminant = (coefficientB * coefficientB) - (4 * coefficientA * coefficientC);

        // Declare variables for roots
        double root1;
        double root2;
        double root;

        // Find and display roots based on the discriminant
        if (discriminant > 0){
            root1 = ( -coefficientB + Math.sqrt(discriminant))/(2 * coefficientA);
            root2 = ( -coefficientB - Math.sqrt(discriminant))/(2 * coefficientA);
            System.out.printf("X1 = %.2f, X2 = %.2f%n", root1, root2); // Using printf to format the output to two decimal places
        }
        else if (discriminant == 0){
            root = (-coefficientB)/(2 * coefficientA);
            System.out.println("This equation has repeated real roots: ");
            System.out.printf("X1 = X2 = %.2f%n", root); // Using printf to format the output to two decimal places
        }
        else {
            double realPart = (-coefficientB) / (2*coefficientA);
            double imagPart = Math.sqrt(Math.abs(discriminant))/(2*coefficientA);
            String formattedImagPart = String.format("%.2f", imagPart); // Formats the imaginary part to two decimal places
            System.out.println("This equation has complex roots:");
            System.out.printf("X1 = %.2f + %s i%n", realPart, formattedImagPart); // Using printf to format the output to two decimal places
            System.out.printf("X2 = %.2f - %s i%n", realPart, formattedImagPart); // Using printf to format the output to two decimal places
        }
        // Close the scanner to prevent resource leakage
        scanner.close(); 
    }
}
