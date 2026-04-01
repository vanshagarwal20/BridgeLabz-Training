package control_flow;
import java.util.*;
public class FactorsOfANumberUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a positive integer: ");
        int number = sc.nextInt();
//        for valid input
        if (number <= 0) {
            System.out.println("Enter a valid positive integer.");
        } else {
//        	for conditional checking
            System.out.println("Factors of " + number + " are:");
            int counter = 1;

            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
	}

}
