import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        double principal;
        double annualInterestRate;
        double rate;
        double period;
        double mortgage;
        double numerator;
        double denominator;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Principal($1k - $IM): ");
            if (input.equals("quit")){
                break;
            };
            principal = input.nextDouble();

            System.out.print("Annual Interest Rate: ");
            annualInterestRate = input.nextDouble();
            annualInterestRate = (double) annualInterestRate / 100;

            rate = (double) annualInterestRate / 12;

            System.out.print("Period(Years): ");
            period = input.nextDouble();
            period = period * 12;
            
            numerator = (double) rate * Math.pow((1 + rate), period);
            denominator = (double) Math.pow((1 + rate), period) - 1;

            mortgage = principal * (double) (numerator / denominator);
            
            String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
            
            System.out.println("Mortgage: " + formattedMortgage);

        }
        input.close();
}

}