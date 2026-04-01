package functional_interfaces;

//	Interface with default method
	interface PaymentProcessor {
	
	 void makePayment();
	
	 default void refund() {
	     System.out.println("Refund processed successfully");
	 }
	}
	
//	Existing provider
	class Paytm implements PaymentProcessor {
	
	 public void makePayment() {
	     System.out.println("Payment done using Paytm");
	 }
	}
	
//	Main class
	public class PaymentGatewayMain {
	 public static void main(String[] args) {
	
	     PaymentProcessor payment = new Paytm();
	     payment.makePayment();
	     payment.refund();   // default method
	 }
	}

