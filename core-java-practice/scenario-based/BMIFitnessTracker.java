package scenario_based;
import java.util.*;
public class BMIFitnessTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);
//        conditional checking
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
	}

}
