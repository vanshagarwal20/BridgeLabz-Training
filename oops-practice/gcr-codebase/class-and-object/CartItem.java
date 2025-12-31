package class_and_object;

public class CartItem {
	String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        }
    }

    void showTotal() {
        System.out.println("Total cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.itemName = "Laptop";
        c.price = 999.99;
        c.quantity = 1;

        System.out.println("Item: Laptop, Price: $999.99, Quantity: 1");
        c.addItem(2);
        c.removeItem(1);
        c.showTotal();
    }

}
