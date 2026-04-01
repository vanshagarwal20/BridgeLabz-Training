package scenario_based.LibraryManagemnet;

import java.util.*;

class Transaction {

    private Map<Integer, Book> catalog = new HashMap<>();

    public void addBook(Book book) {
        catalog.put(book.hashCode(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void issueBook(Book book) throws BookNotAvailableException {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Book not available");
        }
        book.issue();
        System.out.println("Book issued: " + book.getTitle());
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println("Book returned: " + book.getTitle());
    }
}
