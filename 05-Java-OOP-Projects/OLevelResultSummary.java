// Question: The program first prompts the user to input their full name and registration number.
//  Then, it allows the user to input details of their O'level courses and scores. 
// For each score entered, the program determines the corresponding grade using if-else statements. 
// It also determines the remark based on the grade using a switch case. 
// The grades and remarks are assigned based on the standard grading system for O'level examinations.

// Import the Scanner class from the java.util package
import java.util.Scanner;

public class OLevelResultSummary{
    public static void main(String[] args) {
        // Initialize scanner and variables
        Scanner scanner = new Scanner(System.in);
        String fullName, registrationNumber, course;
        int score;
        String result = "";

        // Request user's full name and registration number
        System.out.print("Enter your full name: ");
        fullName = scanner.nextLine();
        System.out.print("Enter your registration number: ");
        registrationNumber = scanner.nextLine();

        // Loop for inputting courses and scores
        do {
            // Prompt for course input
            System.out.print("Enter the course (type 'done' to finish): ");
            course = scanner.nextLine();

            // If the user doesn't input 'done', prompt for score
            if (!course.equalsIgnoreCase("done")) {
                System.out.print("Enter the score for " + course + ": ");
                score = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                // Assign the grade based on the score using if-else
                String grade;
                String remark;
                if (score >= 75 && score <= 100) {
                    grade = "A1";
                } else if (score >= 70 && score <= 74) {
                    grade = "B2";
                } else if (score >= 65 && score <= 69) {
                    grade = "B3";
                } else if (score >= 60 && score <= 64) {
                    grade = "C4";
                } else if (score >= 55 && score <= 59) {
                    grade = "C5";
                } else if (score >= 50 && score <= 54) {
                    grade = "C6";
                } else if (score >= 45 && score <= 49) {
                    grade = "D7";
                } else if (score >= 40 && score <= 44) {
                    grade = "E8";
                } else {
                    grade = "F9";
                }

                // Using switch case to determine remarks based on the grade
                switch (grade) {
                    case "A1":
                        remark = "Excellent";
                        break;
                    case "B2":
                        remark = "Very Good";
                        break;
                    case "B3":
                        remark = "Good";
                        break;
                    case "C4":
                    case "C5":
                    case "C6":
                        remark = "Credit";
                        break;
                    case "D7":
                    case "E8":
                        remark = "Pass";
                        break;
                    default:
                        remark = "Fail";
                        break;
                }

                // Accumulate result details
                result += "Course: " + course + "\n";
                result += "Score: " + score + "\n";
                result += "Grade: " + grade + "\n";
                result += "Remark: " + remark + "\n\n";
            }
        } while (!course.equalsIgnoreCase("done"));

        // Display the result along with the user's information
        System.out.println("Full Name: " + fullName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Here is your O'level Result Summary:\n" + result);

        // Close the scanner
        scanner.close();
    }
}
