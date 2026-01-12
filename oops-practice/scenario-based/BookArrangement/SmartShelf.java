package scenario_based.BookArrangement;

import java.util.*;

class SmartShelf {
    private List<Book> books = new ArrayList<>();

    // Add a book and keep list sorted
    public void addBook(Book newBook) {
        books.add(newBook);
        insertionSort();
    }

    // Insertion sort by title
    private void insertionSort() {
        for (int i = 1; i < books.size(); i++) {
            Book key = books.get(i);
            int j = i - 1;

            while (j >= 0 && books.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books.set(j + 1, books.get(j));
                j--;
            }
            books.set(j + 1, key);
        }
    }

    public void displayBooks() {
        System.out.println("Books on SmartShelf:");
        for (Book b : books) {
            System.out.println(b.getTitle());
        }
    }
}
