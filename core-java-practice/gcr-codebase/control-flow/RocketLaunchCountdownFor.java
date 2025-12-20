package control_flow;
import java.util.*;
public class RocketLaunchCountdownFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();
        // Countdown using for-loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");

	}

}
