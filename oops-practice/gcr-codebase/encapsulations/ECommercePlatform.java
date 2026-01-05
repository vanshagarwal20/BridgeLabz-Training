package encapsulations;

import java.util.*;

//	Interface for taxable products
	interface Taxable {
	 double calculateTax();
	 String getTaxDetails();
	}
	
//	Abstract Product class
	abstract class Product {
	 private int productId;
	 private String name;
	 protected double price;  // protected to allow subclasses access
	
	 public Product(int productId, String name, double price) {
	     this.productId = productId;
	     this.name = name;
	     this.price = price;
	 }
	
//	  Encapsulation: Getters and Setters
	 public int getProductId() { return productId; }
	 public String getName() { return name; }
	 public double getPrice() { return price; }
	 public void setPrice(double price) { this.price = price; }
	
//	  Abstract method for discount
	 public abstract double calculateDiscount();
	
//	  Display product details
	 public void displayDetails() {
	     System.out.println("Product ID : " + productId);
	     System.out.println("Name       : " + name);
	     System.out.println("Price      : " + price);
	     System.out.println("----------------------------");
	 }
	}
	
//	Electronics class (taxable)
	class Electronics extends Product implements Taxable {
	 private double discount; // flat discount for electronics
	 private double taxRate;  // e.g., 18%
	
	 public Electronics(int id, String name, double price, double discount, double taxRate) {
	     super(id, name, price);
	     this.discount = discount;
	     this.taxRate = taxRate;
	 }
	
	 @Override
	 public double calculateDiscount() {
	     return discount;
	 }
	
	 @Override
	 public double calculateTax() {
	     return price * taxRate / 100;
	 }
	
	 @Override
	 public String getTaxDetails() {
	     return "Tax: " + taxRate + "%";
	 }
	}
	
//	Clothing class (taxable)
	class Clothing extends Product implements Taxable {
	 private double discount; 
	 private double taxRate;
	
	 public Clothing(int id, String name, double price, double discount, double taxRate) {
	     super(id, name, price);
	     this.discount = discount;
	     this.taxRate = taxRate;
	 }
	
	 @Override
	 public double calculateDiscount() {
	     return discount;
	 }
	
	 @Override
	 public double calculateTax() {
	     return price * taxRate / 100;
	 }
	
	 @Override
	 public String getTaxDetails() {
	     return "Tax: " + taxRate + "%";
	 }
	}
	
//	Groceries class (non-taxable)
	class Groceries extends Product {
	 private double discount;
	
	 public Groceries(int id, String name, double price, double discount) {
	     super(id, name, price);
	     this.discount = discount;
	 }
	
	 @Override
	 public double calculateDiscount() {
	     return discount;
	 }
	}
	
//	Main class
	public class ECommercePlatform {
//	  Method to calculate final price using polymorphism
	 public static void printFinalPrices(List<Product> products) {
	     for (Product p : products) {
	         double discount = p.calculateDiscount();
	         double tax = 0;
	
//	          Check if product is taxable
	         if (p instanceof Taxable) {
	             Taxable t = (Taxable) p;
	             tax = t.calculateTax();
	             System.out.println(p.getName() + " | " + t.getTaxDetails());
	         } else {
	             System.out.println(p.getName() + " | Tax: 0%");
	         }
	
	         double finalPrice = p.getPrice() + tax - discount;
	         System.out.println("Final Price: " + finalPrice);
	         System.out.println();
	     }
	 }
	
	 public static void main(String[] args) {
	     List<Product> products = new ArrayList<>();
	     products.add(new Electronics(101, "Laptop", 50000, 5000, 18));
	     products.add(new Clothing(102, "T-Shirt", 1000, 100, 12));
	     products.add(new Groceries(103, "Rice", 500, 50));
	
	     printFinalPrices(products);
	 }
	}

