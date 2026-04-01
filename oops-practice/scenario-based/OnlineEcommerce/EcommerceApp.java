package scenario_based.OnlineEcommerce;

public class EcommerceApp {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 800);

        Customer c = new Customer("Vansh");

        Payment payment = new UPIPayment();
        c.placeOrder(p1, payment);

        Order order = new Order(p2);
        order.trackOrder();
        order.cancelOrder();
        order.trackOrder();
    }
}
