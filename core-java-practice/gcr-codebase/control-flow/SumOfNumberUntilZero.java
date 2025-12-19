package control_flow;
import java.util.*;
public class SumOfNumberUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
//        second input
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();
        while (number != 0) {
            total += number;  
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();  
        }
        System.out.println("The total sum is: " + total);
	}

}
