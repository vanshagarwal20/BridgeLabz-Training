package scenario_based;

	import java.util.*;
	
	class BookNotAvailableException extends Exception {
	    public BookNotAvailableException(String msg) {
	        super(msg);
	    }
	}
	
	class Book {
	    String title;
	    String author;
	    boolean available;
	
	    Book(String title, String author, boolean available) {
	        this.title = title;
	        this.author = author;
	        this.available = available;
	    }
	}
	
	public class LibrarySystem {
	    static List<Book> books = new ArrayList<>();
	
	    public static void searchBook(String keyword) {
	        for (Book b : books) {
	            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
	                System.out.println(b.title + " - " + (b.available ? "Available" : "Checked Out"));
	            }
	        }
	    }
	
	    public static void checkoutBook(String title) throws BookNotAvailableException {
	        for (Book b : books) {
	            if (b.title.equalsIgnoreCase(title)) {
	                if (!b.available)
	                    throw new BookNotAvailableException("Book already checked out");
	                b.available = false;
	                System.out.println("Book checked out successfully");
	                return;
	            }
	        }
	    }
	
	    public static void main(String[] args) throws Exception {
	        books.add(new Book("Java Basics", "James", true));
	        books.add(new Book("Data Structures", "Mark", false));
	
	        searchBook("java");
	        checkoutBook("Java Basics");
	    }
	}

