package control_flow;
import java.util.*;
public class SumUntilZeroOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        double total = 0.0;
//        condition
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();
            if (number <= 0) {
                break;  
            }
            total += number; 
        }
        System.out.println("The total sum is: " + total);

	}

}
