package scenario_based;

	import java.util.*;
	
	//Exception
	class NoDriverAvailableException extends Exception {
	 public NoDriverAvailableException(String msg) {
	     super(msg);
	 }
	}
	
	//Interface
	interface FareCalculator {
	 double calculateFare(double distance);
	}
	
	//Polymorphism
	class NormalFare implements FareCalculator {
	 public double calculateFare(double distance) {
	     return distance * 10;
	 }
	}
	
	class PeakFare implements FareCalculator {
	 public double calculateFare(double distance) {
	     return distance * 15;
	 }
	}
	
	//OOP Classes
	class User {
	 String name;
	 User(String name) { 
		 this.name = name; 
	 	}
	}
	
	class Driver {
	 String name;
	 boolean available = true;
	 Driver(String name) { 
		 this.name = name; 
		}
	}
	
	class Ride {
	 User user;
	 Driver driver;
	 double fare;
	
	 Ride(User user, Driver driver, double fare) {
	     this.user = user;
	     this.driver = driver;
	     this.fare = fare;
	 }
	}
	
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
	
	//Main
	public class CabBookingSystem {
	 public static void main(String[] args) throws Exception {
	     RideService service = new RideService();
	     service.addDriver(new Driver("Amit"));	
	     User user = new User("Vansh");
	     FareCalculator fare = new PeakFare();
	
	     Ride ride = service.bookRide(user, 5, fare);
	     System.out.println("Driver: " + ride.driver.name + ", Fare: " + ride.fare);
	 }
	}

