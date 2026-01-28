package scenario_based.supermarket_billing_queue;

import java.util.*;

class Customer {
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}
