package scenario_based;

import java.util.*;

public class MetroSmartCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double balance = 200.0;   
        double fare;
        while (balance > 0) {
            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter distance in km (Enter 0 to quit): ");
            int distance = sc.nextInt();
            if (distance == 0) {
                break;
            }
            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 : 30;
            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance!! Please recharge.");
                break;
            }
        }

        System.out.println("Final Balance: ₹" + balance);
	}

}
