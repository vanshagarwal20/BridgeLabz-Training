package inheritance;

	//Interface for additional behavior
	interface Refuelable {
	 void refuel();
	}
	
	//Superclass
	class Vehiclee {
	 int maxSpeed;
	 String model;
	
	 Vehiclee(int maxSpeed, String model) {
	     this.maxSpeed = maxSpeed;
	     this.model = model;
	 }
	
	 void displayInfo() {
	     System.out.println("Model: " + model);
	     System.out.println("Max Speed: " + maxSpeed + " km/h");
	 }
	}
	
	//ElectricVehicle subclass
	class ElectricVehicle extends Vehiclee {
	
	 ElectricVehicle(int maxSpeed, String model) {
	     super(maxSpeed, model);
	 }
	
	 void charge() {
	     System.out.println(model + " is charging.");
	 }
	}
	
	//PetrolVehicle subclass implementing interface
	class PetrolVehicle extends Vehiclee implements Refuelable {
	
	 PetrolVehicle(int maxSpeed, String model) {
	     super(maxSpeed, model);
	 }
	
	 @Override
	 public void refuel() {
	     System.out.println(model + " is being refueled with petrol.");
	 }
	}
	
	//Main class
	public class VehicleManagementSystem {
	 public static void main(String[] args) {
	
	     Vehiclee ev = new ElectricVehicle(150, "Tesla Model 3");
	     Vehiclee pv = new PetrolVehicle(180, "Honda City");
	
	     ev.displayInfo();
	     ((ElectricVehicle) ev).charge();
	
	     System.out.println();
	
	     pv.displayInfo();
	     ((PetrolVehicle) pv).refuel();
	 }
}
