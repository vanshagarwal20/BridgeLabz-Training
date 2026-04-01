package scenario_based.CabBooking;

import java.util.*;

class RideService {
	 List<Driver> drivers = new ArrayList<>();
	 List<Ride> rideHistory = new ArrayList<>();
	
	 void addDriver(Driver d) {
	     drivers.add(d);
	 }
	
	 Ride bookRide(User user, double distance, FareCalculator calculator)
	         throws NoDriverAvailableException {
	
	     for (Driver d : drivers) {
	         if (d.available) {
	             d.available = false;
	             double fare = calculator.calculateFare(distance);
	             Ride ride = new Ride(user, d, fare);
	             rideHistory.add(ride);
	             return ride;
	         }
	     }
	     throw new NoDriverAvailableException("No driver available");
	 }
	}
