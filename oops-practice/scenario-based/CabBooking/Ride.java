package scenario_based.CabBooking;



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
