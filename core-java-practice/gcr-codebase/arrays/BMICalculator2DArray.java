package array;
import java.util.*;
public class BMICalculator2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		input
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
//        two d array
        double[][] personData = new double[number][3];
//        arrays
        String[] weightStatus = new String[number];
//        validations
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
//            Height input
            while (true) {
                System.out.print("Height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0)
                    break;
                System.out.println("Invalid height! Enter a positive value.");
            }
//            Weight input
            while (true) {
                System.out.print("Weight (in kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0)
                    break;
                System.out.println("Invalid weight! Enter a positive value.");
            }
        }
//        calculations
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][1] /(personData[i][0] * personData[i][0]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
//        output
        System.out.println("BMI Report...");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + weightStatus[i]);
        }
	}

}
