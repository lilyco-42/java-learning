import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        // declare variables
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number % 15 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0){
            System.out.println("Fizz");
        } else if (number % 3 == 0){
            System.out.println("Buzz");
        } else{
            System.out.println(number);
        };

        input.close();
    }
}
