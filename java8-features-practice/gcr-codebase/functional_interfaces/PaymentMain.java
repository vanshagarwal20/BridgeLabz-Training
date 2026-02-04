package functional_interfaces;

//	Interface
	interface Payment {
	 void pay(double amount);
	}
	
//	UPI class
	class UPI implements Payment {
	 public void pay(double amount) {
	     System.out.println("Paid ₹" + amount + " using UPI");
	 }
	}
	
//	Credit Card class
	class CreditCard implements Payment {
	 public void pay(double amount) {
	     System.out.println("Paid ₹" + amount + " using Credit Card");
	 }
	}
	
//	Wallet class
	class Wallet implements Payment {
	 public void pay(double amount) {
	     System.out.println("Paid ₹" + amount + " using Wallet");
	 }
	}
	
//	Main class
	public class PaymentMain {
	 public static void main(String[] args) {
	     Payment p1 = new UPI();
	     p1.pay(500);
	
	     Payment p2 = new CreditCard();
	     p2.pay(1000);
	
	     Payment p3 = new Wallet();
	     p3.pay(300);
	 }
	}
	
