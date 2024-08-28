package java0919;

		import java.util.Scanner;

		public class StudentGrades {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] marks = new int[4];
		        System.out.println("Enter the marks for four subjects:");
		        for (int i = 0; i < 4; i++) {
		            System.out.print("Subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();
		        }
		        int total = 0;
		        for (int mark : marks) {
		            total += mark;
		        }

		        double aggregate = (double) total / 4;
		        String grade;
		        if (aggregate > 75) {
		            grade = "Distinction";
		        } else if (aggregate >= 60 && aggregate <= 75) {
		            grade = "First Division";
		        } else if (aggregate >= 50 && aggregate < 60) {
		            grade = "Second Division";
		        } else if (aggregate >= 40 && aggregate < 50) {
		            grade = "Third Division";
		        } else {
		            grade = "Fail";
		        }
		        System.out.println("Total Marks: " + total);
		        System.out.println("Aggregate: " + aggregate + "%");
		        System.out.println("Grade: " + grade);

		        scanner.close();
		    }
		}

