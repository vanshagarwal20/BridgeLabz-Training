package scenario_based.BookShelf;

public class BookShelfApp {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
        shelf.addBook("Fiction", new Book("1984", "George Orwell")); // duplicate
        shelf.addBook("Tech", new Book("Clean Code", "Robert Martin"));

        shelf.printCatalog();
        shelf.removeBook("Fiction", new Book("1984", "George Orwell"));
        shelf.printCatalog();
    }
}
