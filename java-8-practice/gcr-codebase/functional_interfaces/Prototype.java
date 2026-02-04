package functional_interfaces;

//	Marker Interface usage
	class Prototype implements Cloneable {
	
	 int value;
	
	 Prototype(int value) {
	     this.value = value;
	 }
	
//	  Main method inside same class
	 public static void main(String[] args) {
	
	     try {
	         Prototype original = new Prototype(10);
	
//	          Cloning the object
	         Prototype copy = (Prototype) original.clone();
	
	         System.out.println("Original Value: " + original.value);
	         System.out.println("Cloned Value: " + copy.value);
	
	     } catch (CloneNotSupportedException e) {
	         System.out.println("Cloning not supported");
	     }
	 }
	}

