package control_flow;
import java.util.*;
public class PowerUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // Take input for number and power from user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        // Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers (power can be 0).");
        } else {
            int result = 1;  // Initialize result
            int counter = 0; // Initialize counter
            // Multiply number until counter reaches power
            while (counter < power) {
                result = result * number;
                counter++;
            }
            // final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
	}

}
