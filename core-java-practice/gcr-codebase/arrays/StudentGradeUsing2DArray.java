package arrays;
import java.util.*;
public class StudentGradeUsing2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
//        array formations
        int[][] marks = new int[numberOfStudents][3];
//        for storing
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];
//        input
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject;
                if (j == 0) {
                    subject = "Physics";
                } else if (j == 1) {
                    subject = "Chemistry";
                } else {
                    subject = "Maths";
                }
                System.out.print(subject + ": ");
                int value = sc.nextInt();
//			validations
                if (value < 0) {
                    System.out.println("Invalid marks! Please enter positive values.");
                    j--; 
                    continue;
                }
                marks[i][j] = value;
            }
        }
//        calculations
        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3.0;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
//        final result
        System.out.println("Student Report...");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentage[i]) + "%");
            System.out.println("Grade: " + grade[i]);
        }
	}

}
