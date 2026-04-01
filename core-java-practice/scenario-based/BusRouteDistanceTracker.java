package scenario_based;

import java.util.*;

public class BusRouteDistanceTracker {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopNumber = 1;
        boolean continueJourney = true;

        while (continueJourney) {
            System.out.print("Enter distance added at stop " + stopNumber + " (in km): ");
            int distance = sc.nextInt();

            if (distance < 0) {
                System.out.println("Invalid distance. Try again.");
                continue;
            }

            totalDistance += distance;
            System.out.println("Total distance traveled: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                continueJourney = false;
            } else {
                stopNumber++;
            }
        }

        System.out.println("Journey ended. Final distance traveled: " + totalDistance + " km");
	}

}
