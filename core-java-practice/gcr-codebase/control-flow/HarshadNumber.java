package control_flow;
import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        //Get input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //Initialize sum variable
        int sum = 0;
        int temp = number; // Store original number
        //Loop to calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10;  
            sum += digit;            
            temp = temp / 10;        
        }
        //Check if number is divisible by sum of digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
	}	

}
