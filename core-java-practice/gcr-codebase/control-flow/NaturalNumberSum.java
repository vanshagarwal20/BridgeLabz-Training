package control_flow;
import java.util.*;
public class NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//        Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        Check if the number is a natural number (positive integer)
        if (number > 0) {
//        	Calculate sum of first n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
	}

}
