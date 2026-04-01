package scenario_based.OnlineEcommerce;

interface Payment {
    void pay(double amount) throws PaymentFailedException;
}
