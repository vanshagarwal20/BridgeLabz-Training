package lambda_expressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class Sort_ECommerce {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000, 4.5, 10),
                new Product("Phone", 30000, 4.7, 15),
                new Product("Tablet", 20000, 4.2, 5)
        );

//         Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

//         Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));

//         Sort by discount
        products.sort((p1, p2) -> p2.discount - p1.discount);
    }
}

