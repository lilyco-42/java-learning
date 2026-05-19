// QUESTION: The program is designed to calculate the compound interest based on the provided 
// values of principal amount (P), time in years (T), rate of interest per annum (R), 
// and the number of times interest is compounded per year (n). Compound interest is 
// the interest calculated on the initial principal and also on the accumulated interest of previous periods.

// The formula used to calculate compound interest is:
// A = P(1 + R/n)^(nt)
// C = A - P

// Import the Scanner class from the java.util package
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double principal;
        double time;
        double rate;
        double numberOfTimes;
        double exponent;
        double base;
        double resultOfBaseAndExponent;
        double amount;
        double compoundInterest;

        // Ask user for the values of principal, rate, time, number of times interest is compounded.
        System.out.print("Enter the value of the principal: ");
        principal = input.nextDouble();
        System.out.print("Enter the value of the rate of interest: ");
        rate = input.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        numberOfTimes = input.nextDouble();
        System.out.print("Enter the amount of time taken (in years): ");
        time = input.nextDouble();

        rate = rate/100;
        exponent = numberOfTimes * time;
        base = (1 + (rate/numberOfTimes));
        resultOfBaseAndExponent = Math.pow(base, exponent);
        amount = principal * resultOfBaseAndExponent;
        compoundInterest = amount - principal;


        // Format the compound interest to have 2 decimal places
        String formattedCompoundInterest = String.format("%.2f", compoundInterest);

        // print the formatted compound interest
        System.out.println("The compound interest is " + formattedCompoundInterest);
        input.close();
    }
}

