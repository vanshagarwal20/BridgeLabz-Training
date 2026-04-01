package control_flow;
import java.util.*;
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        Initializing variable
        int sum = 0;
        // Loop to find all divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sum += i; 
            }
        }
//        the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
	}

}
