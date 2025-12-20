package control_flow;
import java.util.*;
public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true; // Assume number is prime initially
            // Loop from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Divisible by another number
                    break; // No need to check further
                }
            }
            // Display result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
	}

}
