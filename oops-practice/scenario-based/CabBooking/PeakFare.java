package scenario_based.CabBooking;


class PeakFare implements FareCalculator {
	 public double calculateFare(double distance) {
	     return distance * 15;
	 }
}
