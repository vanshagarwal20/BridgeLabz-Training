package control_flow;
import java.util.*;
public class ArmStrongChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        Initialize sum and store original number
        int sum = 0;
        int originalNumber = number;
//        Loop through each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  
            sum += digit * digit * digit;      
            originalNumber = originalNumber / 10; 
        }
//         Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

	}

}
