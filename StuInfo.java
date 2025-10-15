package Task;

	import java.util.Scanner;

	class Student {
	    String name;
	    int age;
	    String grade;


	    Student(String name, int age, String grade) {
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	    }

	   
	    void displayDetails() {
	        System.out.printf("%-15s %-10d %-10s\n", name, age, grade);
	    }
	}

	public class StuInfo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        sc.nextLine(); 

	        Student[] students = new Student[n];

	        
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Student " + (i + 1) + ":");
	            System.out.print("Name: ");
	            
	            String name = sc.nextLine();
	            System.out.print("Age: ");
	            
	            int age = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            System.out.print("Grade: ");
	            
	            String grade = sc.nextLine();

	            students[i] = new Student(name, age, grade);
	        }

	        // Displaying all student details
	        System.out.println("\n--- Student Information ---");
	        System.out.printf("%-15s %-10s %-10s\n", "Name", "Age", "Grade");
	        System.out.println("------------------------------------");

	        for (Student s : students) {
	            s.displayDetails();
	        }

	        sc.close();
	    }
	}


