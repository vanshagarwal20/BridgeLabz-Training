package scenario_based.supermarket_billing_queue;

import java.util.*;

class CheckoutCounter {
    Queue<Customer> queue = new LinkedList<>();
    HashMap<String, Item> inventory = new HashMap<>();

    // Add items to inventory
    void addItem(String itemName, double price, int stock) {
        inventory.put(itemName, new Item(price, stock));
    }

    // Add customer to queue
    void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.name + " joined the queue");
    }

    // Remove customer after billing
    void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = queue.poll();
        double total = 0;

        System.out.println("Billing customer: " + customer.name);

        for (String itemName : customer.items) {
            Item item = inventory.get(itemName);

            if (item != null && item.stock > 0) {
                total += item.price;
                item.stock--; // update stock
            } else {
                System.out.println(itemName + " is out of stock");
            }
        }

        System.out.println("Total Bill: ₹" + total);
    }
}
