package scenario_based;

import java.util.*;

public class MovieTicketBooking {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter movie type (2D/3D): ");
            String movieType = sc.next();

            System.out.print("Enter seat type (Gold/Silver): ");
            String seatType = sc.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            int price = 0;

            switch (movieType.toUpperCase()) {
                case "2D":
                    price = seatType.equalsIgnoreCase("Gold") ? 200 : 150;
                    break;
                case "3D":
                    price = seatType.equalsIgnoreCase("Gold") ? 300 : 250;
                    break;
                default:
                    System.out.println("Invalid movie type");
            }

            if (snacks.equalsIgnoreCase("yes")) {
                price += 100;
            }

            System.out.println("Total Ticket Price: ₹" + price);

            System.out.print("Next customer? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

	}

}
