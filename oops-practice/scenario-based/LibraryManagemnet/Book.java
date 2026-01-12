package scenario_based.LibraryManagemnet;

class Book {
    private int bookId;
    private String title;
    private boolean available;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issue() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public String getTitle() {
        return title;
    }
}
