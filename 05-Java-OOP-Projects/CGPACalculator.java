import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        int[] creditPoints = new int[n];
        int[] grades = new int[n];
        double[] gradePoints = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + " (as a number between 1 and 10): ");
            grades[i] = scanner.nextInt();
            System.out.print("Enter credit points for subject " + (i + 1) + ": ");
            creditPoints[i] = scanner.nextInt();
            gradePoints[i] = grades[i] * creditPoints[i];
        }

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < n; i++) {
            totalGradePoints += gradePoints[i];
            totalCredits += creditPoints[i];
        }

        double cgpa = totalGradePoints / totalCredits;

        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }
}
 