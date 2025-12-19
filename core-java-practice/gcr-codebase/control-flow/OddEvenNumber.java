package control_flow;
import java.util.*;
public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number =  ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }
	}

}
