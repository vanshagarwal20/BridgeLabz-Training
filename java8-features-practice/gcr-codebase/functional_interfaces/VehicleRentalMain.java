package functional_interfaces;

//	Interface
	interface Vehicle {
	 void rent();
	 void returnVehicle();
	}
	
//	Car class
	class Car implements Vehicle {
	 public void rent() {
	     System.out.println("Car rented");
	 }
	
	 public void returnVehicle() {
	     System.out.println("Car returned");
	 }
	}
	
//	Bike class
	class Bike implements Vehicle {
	 public void rent() {
	     System.out.println("Bike rented");
	 }
	
	 public void returnVehicle() {
	     System.out.println("Bike returned");
	 }
	}
	
//	Bus class
	class Bus implements Vehicle {
	 public void rent() {
	     System.out.println("Bus rented");
	 }
	
	 public void returnVehicle() {
	     System.out.println("Bus returned");
	 }
	}
	
//	Main class
	public class VehicleRentalMain {
	 public static void main(String[] args) {
	     Vehicle v1 = new Car();
	     v1.rent();
	     v1.returnVehicle();
	
	     Vehicle v2 = new Bike();
	     v2.rent();
	     v2.returnVehicle();
	
	     Vehicle v3 = new Bus();
	     v3.rent();
	     v3.returnVehicle();
	 }
	}

