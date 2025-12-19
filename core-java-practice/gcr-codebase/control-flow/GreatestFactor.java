package control_flow;
import java.util.*;
public class GreatestFactor {

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
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
//output
            System.out.println("Greatest factor beside itself is: " + greatestFactor);
        }
	}

}
