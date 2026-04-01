package control_flow;
import java.util.*;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a positive integer: ");
        int number = sc.nextInt();
//        for wrong input
        if (number <= 0) {
            System.out.println("Enter a valid positive integer.");
//            comparison
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
	}

}
