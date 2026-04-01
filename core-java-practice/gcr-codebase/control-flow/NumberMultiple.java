package control_flow;
import java.util.*;
public class NumberMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        for range
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
//            for computation
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
//            final output

            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
	}

}
