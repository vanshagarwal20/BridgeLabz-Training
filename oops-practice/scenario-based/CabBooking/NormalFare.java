package scenario_based.CabBooking;


class NormalFare implements FareCalculator {
	 public double calculateFare(double distance) {
	     return distance * 10;
	 }
}