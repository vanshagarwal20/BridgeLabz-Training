package scenario_based.BookArrangement;

public class SmartShelfApp {
    public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf();

        shelf.addBook(new Book("Data Structures"));
        shelf.addBook(new Book("Algorithms"));
        shelf.addBook(new Book("Computer Networks"));
        shelf.addBook(new Book("Artificial Intelligence"));

        shelf.displayBooks();
    }
}
