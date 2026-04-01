package scenario_based;
import java.util.*;
public class CoffeeCounterChronicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        final double GST = 0.18; 
        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or exit to stop ");
            String coffeeType = sc.nextLine();
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Wait for Bills....");
                break;
            }
            System.out.print("Please Enter quantity for coffee... ");
            int quantity = sc.nextInt();
            sc.nextLine();
            double price = 0;
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 170;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }
//            calculations
            double total = price * quantity;
            double gst = total * GST;
            double finalBill = total + gst;
            System.out.println("Total (without GST): ₹" + total);
            System.out.println("GST: ₹" + gst);
            System.out.println("Final Bill (including GST) : ₹" + finalBill);
        }
	}

}
