package scenario_based;

class LibraryManagementSystem {

    static String[][] books = {
        {"Java Programming", "James Gosling", "Available"},
        {"Data Structures", "Mark Allen", "Available"},
        {"Clean Code", "Robert Martin", "Checked Out"},
        {"Python Basics", "Guido Rossum", "Available"}
    };

//     Display all books
    static void displayBooks() {
        System.out.println("Library Books:");
        for (String[] book : books) {
            System.out.println("Title: " + book[0] +
                               ", Author: " + book[1] +
                               ", Status: " + book[2]);
        }
    }

//     Search by partial title
    static void searchBook(String keyword) {
        System.out.println("\nSearch Results:");
        boolean found = false;

        for (String[] book : books) {
            if (book[0].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Title: " + book[0] +
                                   ", Author: " + book[1] +
                                   ", Status: " + book[2]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found.");
        }
    }

//     Update book status
    static void updateStatus(String title, String newStatus) {
        for (String[] book : books) {
            if (book[0].equalsIgnoreCase(title)) {
                book[2] = newStatus;
                System.out.println("Book status updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        displayBooks();
        searchBook("code");
        updateStatus("Java Programming", "Checked Out");
        displayBooks();
    }

}
