package scenario_based.BookShelf;

import java.util.*;

class BookShelf {
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();
    private Set<Book> uniqueBooks = new HashSet<>();

    // Add book
    public void addBook(String genre, Book book) {
        if (!uniqueBooks.add(book)) {
            System.out.println("Duplicate book ignored!");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println("Book added: " + book);
    }

    // Remove book
    public void removeBook(String genre, Book book) {
        if (catalog.containsKey(genre) && catalog.get(genre).remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book removed: " + book);
        } else {
            System.out.println("Book not found!");
        }
    }

    // Print catalog
    public void printCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  - " + b);
            }
        }
    }
}
