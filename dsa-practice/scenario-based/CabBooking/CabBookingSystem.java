package scenario_based.CabBooking;

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
