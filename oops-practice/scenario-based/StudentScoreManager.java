package scenario_based;

import java.util.*;

class StudentScoreManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        double[] scores = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter numeric value.");
                    sc.next(); 
                } else {
                    double score = sc.nextDouble();
                    if (score < 0) {
                        System.out.println("Score cannot be negative.");
                    } else {
                        scores[i] = score;
                        sum += score;
                        break;
                    }
                }
            }
        }

        double average = sum / n;
        double highest = scores[0];
        double lowest = scores[0];

        for (double score : scores) {
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("Scores above average:");
        for (double score : scores) {
            if (score > average) {
                System.out.println(score);
            }
        }
    }


}
