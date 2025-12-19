package control_flow;
import java.util.*;
public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
//        condition
        if (number >= 0) { 
            long factorial = 1; 
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
//            output
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Invalid input! Please enter a positive integer.");
        }
	}

}
