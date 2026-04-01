package encapsulations;

import java.util.*;

//	Interface for insurable vehicles
	interface Insurable {
	 double calculateInsurance();
	 String getInsuranceDetails();
	}
	
//	Abstract Vehicle class
	abstract class Vehicle {
	 private String vehicleNumber;
	 private String type;
	 protected double rentalRate; // per day
	
	 public Vehicle(String vehicleNumber, String type, double rentalRate) {
	     this.vehicleNumber = vehicleNumber;
	     this.type = type;
	     this.rentalRate = rentalRate;
	 }
	
//	  Encapsulation
	 public String getVehicleNumber() { return vehicleNumber; }
	 public String getType() { return type; }
	 public double getRentalRate() { return rentalRate; }
	 public void setRentalRate(double rate) { this.rentalRate = rate; }
	
//	  Abstract method
	 public abstract double calculateRentalCost(int days);
	
//	  Display details
	 public void displayDetails() {
	     System.out.println("Vehicle Number: " + vehicleNumber);
	     System.out.println("Type          : " + type);
	     System.out.println("Rental Rate   : " + rentalRate);
	 }
	}
	
//	Car class (insurable)
	class Car extends Vehicle implements Insurable {
	 private double insuranceRate; // % of rental cost
	 private String insurancePolicyNumber;
	
	 public Car(String vehicleNumber, double rentalRate, double insuranceRate, String policyNumber) {
	     super(vehicleNumber, "Car", rentalRate);
	     this.insuranceRate = insuranceRate;
	     this.insurancePolicyNumber = policyNumber;
	 }
	
	 @Override
	 public double calculateRentalCost(int days) {
	     return rentalRate * days;
	 }
	
	 @Override
	 public double calculateInsurance() {
	     return calculateRentalCost(1) * insuranceRate / 100; // daily insurance cost
	 }
	
	 @Override
	 public String getInsuranceDetails() {
	     return "Policy No: " + insurancePolicyNumber + " | Insurance Rate: " + insuranceRate + "%";
	 }
	}
	
//	Bike class (insurable)
	class Bike extends Vehicle implements Insurable {
	 private double insuranceRate;
	 private String insurancePolicyNumber;
	
	 public Bike(String vehicleNumber, double rentalRate, double insuranceRate, String policyNumber) {
	     super(vehicleNumber, "Bike", rentalRate);
	     this.insuranceRate = insuranceRate;
	     this.insurancePolicyNumber = policyNumber;
	 }
	
	 @Override
	 public double calculateRentalCost(int days) {
	     return rentalRate * days;
	 }
	
	 @Override
	 public double calculateInsurance() {
	     return calculateRentalCost(1) * insuranceRate / 100;
	 }
	
	 @Override
	 public String getInsuranceDetails() {
	     return "Policy No: " + insurancePolicyNumber + " | Insurance Rate: " + insuranceRate + "%";
	 }
	}
	
//	Truck class (not insurable)
	class Truck extends Vehicle {
	 public Truck(String vehicleNumber, double rentalRate) {
	     super(vehicleNumber, "Truck", rentalRate);
	 }
	
	 @Override
	 public double calculateRentalCost(int days) {
	     // Trucks have 10% extra for long rentals (>5 days)
	     double cost = rentalRate * days;
	     if (days > 5) cost *= 1.10;
	     return cost;
	 }
	}
	
//	Main class
	public class VehicleRentalSystem {
	 public static void main(String[] args) {
	     List<Vehicle> vehicles = new ArrayList<>();
	
	     Vehicle v1 = new Car("CAR101", 2000, 5, "CARINS123");
	     Vehicle v2 = new Bike("BIKE202", 500, 2, "BIKEINS456");
	     Vehicle v3 = new Truck("TRK303", 3000);
	
	     vehicles.add(v1);
	     vehicles.add(v2);
	     vehicles.add(v3);
	
	     int rentalDays = 3;
	
	     for (Vehicle v : vehicles) {
	         v.displayDetails();
	         System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));
	
	         if (v instanceof Insurable) {
	             Insurable ins = (Insurable) v;
	             System.out.println("Insurance Cost (per day): " + ins.calculateInsurance());
	             System.out.println(ins.getInsuranceDetails());
	         } else {
	             System.out.println("Insurance: Not Applicable");
	         }
	         System.out.println();
	     }
	 }
	}

