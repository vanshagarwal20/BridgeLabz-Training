package string;

import java.util.*;

public class StudentScorecard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students = 10;
        int[][] marks = generateRandomMarks(students);
        double[][] totals = calculateTotalAveragePercentage(marks);
        String[] grades = calculateGrades(totals);
        displayScorecard(marks, totals, grades);
    }

    public static int[][] generateRandomMarks(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(101); 
            }
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0 * 100.0) * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] totals) {
        String[] grades = new String[totals.length];
        for (int i = 0; i < totals.length; i++) {
            double perc = totals[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] totals, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.print((int) totals[i][0] + "\t");
            System.out.print(totals[i][1] + "\t");
            System.out.print(totals[i][2] + "\t\t");
            System.out.println(grades[i]);
        }
    }

}
