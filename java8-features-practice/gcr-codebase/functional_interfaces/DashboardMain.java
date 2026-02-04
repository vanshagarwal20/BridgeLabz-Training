package functional_interfaces;

//	Interface with default method
	interface VehicleDashboard {
	
	 void displaySpeed();
	
	 default void displayBattery() {
	     System.out.println("Battery: 80%");
	 }
	}
	
//	Electric vehicle
	class ElectricCar implements VehicleDashboard {
	
	 public void displaySpeed() {
	     System.out.println("Speed: 60 km/h");
	 }
	}
	
//	Main class
	public class DashboardMain {
	 public static void main(String[] args) {
	
	     VehicleDashboard vehicle = new ElectricCar();
	     vehicle.displaySpeed();
	     vehicle.displayBattery();  // default method
	 }
	}

