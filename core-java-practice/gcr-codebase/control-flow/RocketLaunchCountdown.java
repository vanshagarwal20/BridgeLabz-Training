package control_flow;
import java.util.*;
public class RocketLaunchCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();
//        condition
        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }
        System.out.println("Lift off!");
	}		

}
