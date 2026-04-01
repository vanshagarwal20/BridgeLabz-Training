package control_flow;
import java.util.*;
public class MultipleOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a number: ");
	     int number = sc.nextInt();
//	     logic
	     if (number % 5 == 0) {
	         System.out.println("Is the number " + number + " divisible by 5? Yes");
	     } else {
	         System.out.println("Is the number " + number + " divisible by 5? No");
	     }
	}

}
