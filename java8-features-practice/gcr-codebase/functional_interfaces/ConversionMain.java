package functional_interfaces;

//	Interface with static methods
	interface UnitConverter {
	
	 static double kmToMiles(double km) {
	     return km * 0.621;
	 }
	
	 static double kgToLbs(double kg) {
	     return kg * 2.204;
	 }
	}
	
//	Main class
	public class ConversionMain {
	 public static void main(String[] args) {
	
	     double km = 10;
	     double kg = 5;
	
	     System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
	     System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");
	 }
	}

