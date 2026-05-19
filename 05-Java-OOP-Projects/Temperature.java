// Question

// if temp is greater than 30 
// then print It's a hot day,
// Drink plenty of water

//  Otherwise, if it's between 20 and 30
// it is a nice day

// otherwise it's a cold day

import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        // declare variables
        double temperature;

        System.out.print("Enter the temperature for the day: ");
        Scanner input = new Scanner(System.in);
        temperature = input.nextDouble();

        if (temperature > 30){
            System.out.println("It is a hot day \nDrink plenty of water");
        }
        else if (temperature > 20){
            System.out.println("It is a nice day");
        }
        else{
            System.out.println("It is a cold day");
        }
    }
}