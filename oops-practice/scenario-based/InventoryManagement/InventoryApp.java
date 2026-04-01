package scenario_based.InventoryManagement;

public class InventoryApp {
    public static void main(String[] args) throws Exception {

        Inventory inventory = new Inventory();

        Product p1 = new Product(1, "Keyboard", 10);
        Product p2 = new Product(2, "Mouse", 3);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.updateStock(1, -6);
        inventory.updateStock(2, 2);

        inventory.showInventory();
    }
}
