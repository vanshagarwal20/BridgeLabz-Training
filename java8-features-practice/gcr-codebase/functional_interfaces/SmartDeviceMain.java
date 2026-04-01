package functional_interfaces;

//	Interface
	interface SmartDevice {
	 void turnOn();
	 void turnOff();
	}
	
//	Light class
	class Light implements SmartDevice {
	 public void turnOn() {
	     System.out.println("Light is ON");
	 }
	
	 public void turnOff() {
	     System.out.println("Light is OFF");
	 }
	}
	
//	AC class
	class AC implements SmartDevice {
	 public void turnOn() {
	     System.out.println("AC is ON");
	 }
	
	 public void turnOff() {
	     System.out.println("AC is OFF");
	 }
	}
	
//	TV class
	class TV implements SmartDevice {
	 public void turnOn() {
	     System.out.println("TV is ON");
	 }
	
	 public void turnOff() {
	     System.out.println("TV is OFF");
	 }
	}
	
//	Main class
	public class SmartDeviceMain {
	 public static void main(String[] args) {
	     SmartDevice device1 = new Light();
	     device1.turnOn();
	     device1.turnOff();
	
	     SmartDevice device2 = new AC();
	     device2.turnOn();
	     device2.turnOff();
	
	     SmartDevice device3 = new TV();
	     device3.turnOn();
	     device3.turnOff();
	 }
	}

