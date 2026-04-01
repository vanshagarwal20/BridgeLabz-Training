package scenario_based.InventoryManagement;

import java.util.*;

class Inventory implements AlertService {

    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println("Product added: " + product.getName());
    }

    public void updateStock(int productId, int qty) throws OutOfStockException {
        Product product = products.get(productId);

        if (product == null) return;

        if (qty < 0 && Math.abs(qty) > product.getQuantity()) {
            throw new OutOfStockException("Not enough stock available");
        }

        product.updateQuantity(qty);

        if (product.getQuantity() < 5) {
            sendLowStockAlert(product);
        }
    }
    
    public void sendLowStockAlert(Product product) {
        System.out.println("⚠ Low Stock Alert: " + product.getName() +
                           " | Remaining: " + product.getQuantity());
    }

    public void showInventory() {
        for (Product p : products.values()) {
            System.out.println(p.getName() + " → " + p.getQuantity());
        }
    }
}
