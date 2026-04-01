package control_flow;
import java.util.*;
public class NoOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Initialize count variable
        int count = 0;
        int temp = number; // Store original number in temp 
        //Loop to count digits
        while (number != 0) {
            number = number / 10; // Remove last digit
            count++;               // Increase count by 1
        }
        // output
        System.out.println("Number of digits in " + temp + " is: " + count);
	}	

}
