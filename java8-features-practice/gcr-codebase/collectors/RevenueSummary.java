package collectors;

import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class RevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Alice", 500),
            new Order("Bob", 300),
            new Order("Alice", 200)
        );

        Map<String, Double> revenue =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      o -> o.customer,
                      Collectors.summingDouble(o -> o.amount)
                  ));

        System.out.println(revenue);
    }
}
