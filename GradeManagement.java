package Task;

import java.util.Scanner;

public class GradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];
        double total = 0;

        
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            
            names[i] = sc.nextLine();
            System.out.print("Enter marks of " + names[i] + ": ");
            
            marks[i] = sc.nextDouble();
            total += marks[i];
        }

        
        double average = total / n;

        System.out.println("\n--- Grade Management System ---");
        System.out.printf("%-15s %-10s %-10s\n", "Name", "Marks", "Grade");
        System.out.println("---------------------------------------");

        for (int i = 0; i < n; i++) {
            String grade;

            if (marks[i] >= 90)
                grade = "A";
            else if (marks[i] >= 75)
                grade = "B";
            else if (marks[i] >= 60)
                grade = "C";
            else if (marks[i] >= 40)
                grade = "D";
            else
                grade = "F";

            System.out.printf("%-15s %-10.2f %-10s\n", names[i], marks[i], grade);
        }

        System.out.printf("\nClass Average: %.2f\n", average);

        sc.close();
    }
}
