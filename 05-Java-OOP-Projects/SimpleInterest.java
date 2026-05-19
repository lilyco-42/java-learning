// QUESTION: This program is designed to calculate the simple interest  using the formula:
// S.I = (P * T * R) / 100

// where:
// P represents the principal amount (the initial sum of money).
// T represents the time period (the duration for which the money is borrowed or invested).
// R represents the rate of interest per unit time.
// The program takes input for the values of P, T, and R, and then uses these values to calculate the simple interest. 
// Finally, it displays the calculated simple interest as the output.

import java.util.Scanner;

public class SimpleInterest{
    public static void main (String[] args){

        Double principal = 0.0;
        Double rate = 0.0;
        Double time = 0.0;
        Double simpleInterest = 0.0;

        System.out.print("Enter in the principal: ");
        Scanner input = new Scanner(System.in);

        // assign the input to the principal
        principal = input.nextDouble();

        System.out.print("Enter in the time taken: ");
        // assign the input to the time taken
        time = input.nextDouble();

        System.out.print("Enter in the rate: ");
        // assign the input to the rate
        rate = input.nextDouble();

        // calculate the simple interest
        simpleInterest = (principal * rate * time)/100;

        System.out.println("The simple interest is " + simpleInterest);
    }
}