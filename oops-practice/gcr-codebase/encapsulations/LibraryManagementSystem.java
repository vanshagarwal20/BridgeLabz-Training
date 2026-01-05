package encapsulations;

import java.util.*;

//	Interface for reservable items
	interface Reservable {
	 void reserveItem(String borrowerName);
	 boolean checkAvailability();
	}
	
//	Abstract class LibraryItem
	abstract class LibraryItem {
	 private String itemId;
	 private String title;
	 private String author;
	 private boolean isAvailable = true; // default available
	
	 public LibraryItem(String itemId, String title, String author) {
	     this.itemId = itemId;
	     this.title = title;
	     this.author = author;
	 }
	
//	  Encapsulation
	 public String getItemId() { return itemId; }
	 public String getTitle() { return title; }
	 public String getAuthor() { return author; }
	 public boolean getAvailability() { return isAvailable; }
	 protected void setAvailability(boolean status) { this.isAvailable = status; }
	
//	  Abstract method for loan duration
	 public abstract int getLoanDuration();
	
//	  Concrete method
	 public void getItemDetails() {
	     System.out.println("Item ID   : " + itemId);
	     System.out.println("Title     : " + title);
	     System.out.println("Author    : " + author);
	     System.out.println("Available : " + isAvailable);
	 }
	}
	
//	Book class
	class Book extends LibraryItem implements Reservable {
	 private String borrower;
	
	 public Book(String id, String title, String author) {
	     super(id, title, author);
	 }
	
	 @Override
	 public int getLoanDuration() {
	     return 21; // 21 days for books
	 }
	
	 @Override
	 public void reserveItem(String borrowerName) {
	     if (checkAvailability()) {
	         borrower = borrowerName;
	         setAvailability(false);
	         System.out.println("Book reserved by: " + borrower);
	     } else {
	         System.out.println("Book not available for reservation");
	     }
	 }
	
	 @Override
	 public boolean checkAvailability() {
	     return getAvailability();
	 }
	}
	
//	Magazine class
	class Magazine extends LibraryItem implements Reservable {
	 private String borrower;
	
	 public Magazine(String id, String title, String author) {
	     super(id, title, author);
	 }
	
	 @Override
	 public int getLoanDuration() {
	     return 7; // 7 days for magazines
	 }
	
	 @Override
	 public void reserveItem(String borrowerName) {
	     if (checkAvailability()) {
	         borrower = borrowerName;
	         setAvailability(false);
	         System.out.println("Magazine reserved by: " + borrower);
	     } else {
	         System.out.println("Magazine not available for reservation");
	     }
	 }
	
	 @Override
	 public boolean checkAvailability() {
	     return getAvailability();
	 }
	}
	
//	DVD class (shorter loan period)
	class DVD extends LibraryItem implements Reservable {
	 private String borrower;
	
	 public DVD(String id, String title, String author) {
	     super(id, title, author);
	 }
	
	 @Override
	 public int getLoanDuration() {
	     return 3; // 3 days for DVDs
	 }
	
	 @Override
	 public void reserveItem(String borrowerName) {
	     if (checkAvailability()) {
	         borrower = borrowerName;
	         setAvailability(false);
	         System.out.println("DVD reserved by: " + borrower);
	     } else {
	         System.out.println("DVD not available for reservation");
	     }
	 }
	
	 @Override
	 public boolean checkAvailability() {
	     return getAvailability();
	 }
	}
	
//	Main class
	public class LibraryManagementSystem {
	 public static void main(String[] args) {
	     List<LibraryItem> items = new ArrayList<>();
	
	     LibraryItem item1 = new Book("B101", "Java Programming", "Vansh Agarwal");
	     LibraryItem item2 = new Magazine("M202", "Tech Today", "Tech Author");
	     LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");
	
	     items.add(item1);
	     items.add(item2);
	     items.add(item3);
	
//	      Polymorphism: manage all items using LibraryItem reference
	     for (LibraryItem item : items) {
	         item.getItemDetails();
	         System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
	
	         if (item instanceof Reservable) {
	             Reservable rItem = (Reservable) item;
	             if (rItem.checkAvailability()) {
	                 rItem.reserveItem("Alice");
	             } else {
	                 System.out.println("Item not available for reservation");
	             }
	         }
	         System.out.println();
	     }
	 }
	}

