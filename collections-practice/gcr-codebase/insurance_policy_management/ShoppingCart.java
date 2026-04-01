package insurance_policy_management;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Double> cartOrder = new LinkedHashMap<>();
    private TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cartOrder.put(product, price);
        sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
    }

    public void displayCart() {
        System.out.println("HashMap prices: " + productPrices);
        System.out.println("LinkedHashMap insertion order: " + cartOrder);
        System.out.println("TreeMap sorted by price: " + sortedByPrice);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 50000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1200);
        cart.displayCart();
    }
}

