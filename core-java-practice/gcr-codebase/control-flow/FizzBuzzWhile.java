package control_flow;
import java.util.*;
public class FizzBuzzWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Enter a valid positive integer.");
//            checking
        } else {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
	}

}
