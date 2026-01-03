package inheritance;

//	Interface (multiple inheritance behavior)
	interface Worker {
	 void performDuties();
	}
	
//	Superclass
	class Personn {
	 String name;
	 int id;
	
	 Personn(String name, int id) {
	     this.name = name;
	     this.id = id;
	 }
	}
	
//	Chef subclass
	class Chef extends Personn implements Worker {
	
	 Chef(String name, int id) {
	     super(name, id);
	 }
	
	 @Override
	 public void performDuties() {
	     System.out.println("Chef " + name + " is cooking food.");
	 }
	}
	
//	Waiter subclass
	class Waiter extends Personn implements Worker {
	
	 Waiter(String name, int id) {
	     super(name, id);
	 }
	
	 @Override
	 public void performDuties() {
	     System.out.println("Waiter " + name + " is serving customers.");
	 }
	}
	
//	Main class
	public class RestaurantSystem {
	 public static void main(String[] args) {
	
	     Worker w1 = new Chef("Amit", 101);
	     Worker w2 = new Waiter("Rahul", 102);
	
	     w1.performDuties();
	     w2.performDuties();
	 }

}
