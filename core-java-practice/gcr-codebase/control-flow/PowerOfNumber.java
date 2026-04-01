package control_flow;
import java.util.*;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Take input from user
        Scanner sc = new Scanner(System.in);
        // Enter number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        // Enter power
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        // Check for positive values
        if (number <= 0 || power <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            // Initialize result
            int result = 1;
            // Calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            // Print result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
	}

}
