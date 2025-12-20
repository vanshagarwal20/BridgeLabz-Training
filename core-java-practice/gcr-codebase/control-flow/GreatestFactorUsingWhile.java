package control_flow;
import java.util.*;
public class GreatestFactorUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int number = sc.nextInt();
        int greatestFactor = 1;
//        valid input
        if (number <= 1) {
            System.out.println("Greatest factor beside itself is: " + greatestFactor);
//            for checking	
        } else {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
//output
            System.out.println("Greatest factor beside itself is: " + greatestFactor);
        }
	}

}
