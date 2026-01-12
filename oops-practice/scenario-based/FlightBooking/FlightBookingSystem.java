package scenario_based.FlightBooking;

import java.util.*;

public class FlightBookingSystem {

    static Flight[] flights = {
        new Flight("AI101", "Delhi", "Mumbai"),
        new Flight("AI202", "Pune", "Delhi"),
        new Flight("AI303", "Mumbai", "Chennai")
    };

    static List<Flight> bookings = new ArrayList<>();

    public static void searchFlight(String src, String dest) {
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                f.destination.equalsIgnoreCase(dest)) {
                System.out.println("Flight Found: " + f.flightCode);
                return;
            }
        }
        System.out.println("No flight available");
    }

    public static void bookFlight(String code) {
        for (Flight f : flights) {
            if (f.flightCode.equalsIgnoreCase(code)) {
                bookings.add(f);
                System.out.println("Flight booked: " + code);
                return;
            }
        }
        System.out.println("Invalid flight code");
    }

    public static void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet");
            return;
        }

        for (Flight f : bookings) {
            System.out.println(f.flightCode + " : " + f.source + " → " + f.destination);
        }
    }

    public static void main(String[] args) {
        searchFlight("Delhi", "Mumbai");
        bookFlight("AI101");
        showBookings();
    }
}
