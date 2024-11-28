
import java.util.Scanner;
public class AverageGradeCalculator {
    
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number of grades
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();  // Read the number of grades
        
        // Declare a variable to hold the sum of the grades
        double sum = 0;
        
        // Prompt user to enter each grade and calculate the sum
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();  // Read the grade
            sum += grade;  // Add the grade to the sum
        }
        
        // Calculate the average grade
        double average = sum / numberOfGrades;
        
        // Display the average grade
        System.out.println("The average grade is: " + average);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

