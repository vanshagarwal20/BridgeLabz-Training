package scenario_based.supermarket_billing_queue;

import java.util.*;

public class SmartCheckout {
    public static void main(String[] args) {

        CheckoutCounter counter = new CheckoutCounter();

        // Inventory setup
        counter.addItem("Milk", 50, 10);
        counter.addItem("Bread", 30, 5);
        counter.addItem("Eggs", 6, 20);

        // Customers
        Customer c1 = new Customer("Vansh",
                Arrays.asList("Milk", "Bread", "Eggs"));

        Customer c2 = new Customer("Aman",
                Arrays.asList("Milk", "Milk", "Bread"));

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processCustomer();
        counter.processCustomer();
    }
}
