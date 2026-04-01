package encapsulations;

import java.util.*;

//	Interface for GPS functionality
	interface GPS {
	 String getCurrentLocation();
	 void updateLocation(String newLocation);
	}
	
//	Abstract Vehicle class
	abstract class vehiclee implements GPS {
	 private String vehicleId;
	 private String driverName;
	 protected double ratePerKm;
	 private String currentLocation;
	
	 public vehiclee(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
	     this.vehicleId = vehicleId;
	     this.driverName = driverName;
	     this.ratePerKm = ratePerKm;
	     this.currentLocation = initialLocation;
	 }
	
//	  Encapsulation
	 public String getVehicleId() { return vehicleId; }
	 public String getDriverName() { return driverName; }
	 public double getRatePerKm() { return ratePerKm; }
	
//	  Abstract method for fare calculation
	 public abstract double calculateFare(double distance);
	
//	  Concrete method
	 public void getVehicleDetails() {
	     System.out.println("Vehicle ID   : " + vehicleId);
	     System.out.println("Driver Name  : " + driverName);
	     System.out.println("Rate per Km  : " + ratePerKm);
	     System.out.println("Current Loc. : " + currentLocation);
	 }
	
//	  GPS interface methods
	 @Override
	 public String getCurrentLocation() {
	     return currentLocation;
	 }
	
	 @Override
	 public void updateLocation(String newLocation) {
	     this.currentLocation = newLocation;
	     System.out.println(driverName + "'s location updated to: " + newLocation);
	 }
	}
	
//	Car class
	class Carr extends vehiclee {
	 private double luxuryCharge = 50; // extra per km for cars
	
	 public Carr(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
	     super(vehicleId, driverName, ratePerKm, initialLocation);
	 }
	
	 @Override
	 public double calculateFare(double distance) {
	     return distance * (ratePerKm + luxuryCharge);
	 }
	}
	
//	Bike class
	class Bikee extends vehiclee {
	 public Bikee(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
	     super(vehicleId, driverName, ratePerKm, initialLocation);
	 }
	
	 @Override
	 public double calculateFare(double distance) {
	     return distance * ratePerKm;
	 }
	}
	
//	Auto class
	class Auto extends vehiclee {
	 private double convenienceCharge = 10; // per km
	
	 public Auto(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
	     super(vehicleId, driverName, ratePerKm, initialLocation);
	 }
	
	 @Override
	 public double calculateFare(double distance) {
	     return distance * (ratePerKm + convenienceCharge);
	 }
	}
	
//	Main class
	public class RideHailingApp {
	 public static void main(String[] args) {
	     List<vehiclee> vehicles = new ArrayList<>();
	
	     vehiclee v1 = new Carr("CAR101", "Vansh", 20, "Rampur");
	     vehiclee v2 = new Bikee("BIKE202", "Amit", 10, "Mathura");
	     vehiclee v3 = new Auto("AUTO303", "Rohit", 15, "Delhi");
	
	     vehicles.add(v1);
	     vehicles.add(v2);
	     vehicles.add(v3);
	
	     double distance = 10; // distance in km
	
//	      Polymorphism: calculate fares dynamically
	     for (vehiclee v : vehicles) {
	         v.getVehicleDetails();
	         double fare = v.calculateFare(distance);
	         System.out.println("Fare for " + distance + " km: " + fare);
	         v.updateLocation("New Location");
	         System.out.println();
	     }
	 }
	}

