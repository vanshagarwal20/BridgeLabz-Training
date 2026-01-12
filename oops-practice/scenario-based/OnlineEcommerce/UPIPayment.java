package scenario_based.OnlineEcommerce;

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done via UPI");
    }
}
