package encapsulations;

import java.util.*;

//	Interface for discountable items
	interface Discountable {
	 void applyDiscount(double discountPercent); // discount in %
	 String getDiscountDetails();
	}
	
//	Abstract FoodItem class
	abstract class FoodItem {
	 private String itemName;
	 protected double price;
	 private int quantity;
	
	 public FoodItem(String itemName, double price, int quantity) {
	     this.itemName = itemName;
	     this.price = price;
	     this.quantity = quantity;
	 }
	
//	  Encapsulation
	 public String getItemName() { return itemName; }
	 public double getPrice() { return price; }
	 public int getQuantity() { return quantity; }
	 public void setQuantity(int quantity) { this.quantity = quantity; }
	
//	  Abstract method
	 public abstract double calculateTotalPrice();
	
//	  Concrete method
	 public void getItemDetails() {
	     System.out.println("Item Name : " + itemName);
	     System.out.println("Price     : " + price);
	     System.out.println("Quantity  : " + quantity);
	 }
	}
	
//	VegItem class
	class VegItem extends FoodItem implements Discountable {
	 private double discountPercent = 0;
	
	 public VegItem(String name, double price, int quantity) {
	     super(name, price, quantity);
	 }
	
	 @Override
	 public double calculateTotalPrice() {
	     double total = price * getQuantity();
	     // apply discount if any
	     total = total - (total * discountPercent / 100);
	     return total;
	 }
	
	 @Override
	 public void applyDiscount(double discountPercent) {
	     this.discountPercent = discountPercent;
	 }
	
	 @Override
	 public String getDiscountDetails() {
	     return "Veg Discount Applied: " + discountPercent + "%";
	 }
	}
	
//	NonVegItem class
	class NonVegItem extends FoodItem implements Discountable {
	 private double extraCharge = 50; // extra charge per item for non-veg
	 private double discountPercent = 0;
	
	 public NonVegItem(String name, double price, int quantity) {
	     super(name, price, quantity);
	 }
	
	 @Override
	 public double calculateTotalPrice() {
	     double total = (price + extraCharge) * getQuantity();
	     // apply discount if any
	     total = total - (total * discountPercent / 100);
	     return total;
	 }
	
	 @Override
	 public void applyDiscount(double discountPercent) {
	     this.discountPercent = discountPercent;
	 }
	
	 @Override
	 public String getDiscountDetails() {
	     return "Non-Veg Discount Applied: " + discountPercent + "%";
	 }
	}
	
//	Main class
	public class OnlineFoodDeliverySystem {
	 public static void main(String[] args) {
	     List<FoodItem> order = new ArrayList<>();
	
	     FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
	     FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);
	     FoodItem f3 = new VegItem("Veg Noodles", 150, 3);
	
//	      Apply discounts
	     if (f1 instanceof Discountable) ((Discountable) f1).applyDiscount(10);
	     if (f2 instanceof Discountable) ((Discountable) f2).applyDiscount(5);
	
	     order.add(f1);
	     order.add(f2);
	     order.add(f3);
	
//	      Process order using polymorphism
	     double grandTotal = 0;
	     for (FoodItem item : order) {
	         item.getItemDetails();
	         if (item instanceof Discountable) {
	             System.out.println(((Discountable) item).getDiscountDetails());
	         }
	         double totalPrice = item.calculateTotalPrice();
	         System.out.println("Total Price: " + totalPrice);
	         grandTotal += totalPrice;
	         System.out.println();
	     }
	
	     System.out.println("Grand Total for Order: " + grandTotal);
	 }
	}

