package array;
import java.util.*;
public class BMICalculatorTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		input
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
//        arrays
        double[] height = new double[n];   
        double[] weight = new double[n];   
        double[] bmi = new double[n];
        String[] status = new String[n];
//        input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();
        }
//        calculations
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
//        output
        System.out.println("BMI Report...");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + String.format("%.2f", bmi[i]));
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
	}

}
