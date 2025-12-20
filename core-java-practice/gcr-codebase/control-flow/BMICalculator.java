package control_flow;
import java.util.*;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        user input for weight (kg) and height (cm)
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
//        Convert height from cm to meters
        double heightM = heightCm / 100;
        //Calculate BMI
        double bmi = weight / (heightM * heightM);
        //Display BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);
//      Determine weight status based on updated BMI table
        if (bmi <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else if (bmi >= 40) {
            System.out.println("You are Obese.");
        }

	}

}
