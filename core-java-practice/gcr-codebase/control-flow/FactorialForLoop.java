package control_flow;
import java.util.*;
public class FactorialForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
//        checking
        if (number >= 0) {
            long factorial = 1; 
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
//            output
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Invalid input! Please enter a positive integer.");
        }
	}

}
