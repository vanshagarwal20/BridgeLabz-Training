package string;

import java.util.*;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int members = 10;
        double[][] heightWeight = new double[members][2];
        for (int i = 0; i < members; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeight[i][1] = sc.nextDouble();
        }
        String[][] bmiData = computeBMI(heightWeight);
        displayBMI(bmiData);
    }

    public static String[][] findBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";
        String[][] result = new String[1][4];
        result[0][0] = String.valueOf(heightCm);
        result[0][1] = String.valueOf(weight);
        result[0][2] = String.valueOf(bmi);
        result[0][3] = status;
        return result;
    }

    public static String[][] computeBMI(double[][] heightWeight) {
        int n = heightWeight.length;
        String[][] result = new String[n][4];
        for (int i = 0; i < n; i++) {
            String[][] bmiStatus = findBMIStatus(heightWeight[i][0], heightWeight[i][1]);
            result[i] = bmiStatus[0];
        }
        return result;
    }

    public static void displayBMI(String[][] data) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }
}
