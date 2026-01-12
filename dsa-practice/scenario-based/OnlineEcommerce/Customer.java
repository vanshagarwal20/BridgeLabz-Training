package scenario_based.OnlineEcommerce;

import java.util.*;

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Product p, Payment payment) throws PaymentFailedException {
        payment.pay(p.price);
        Order order = new Order(p);
        orders.add(order);
        System.out.println("Order placed for " + p.name);
    }
}
