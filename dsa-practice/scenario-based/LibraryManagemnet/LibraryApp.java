package scenario_based.LibraryManagemnet;

public class LibraryApp {
    public static void main(String[] args) throws Exception {

        Book book1 = new Book(1, "Java Programming");
        Book book2 = new Book(2, "Data Structures");

        Member student = new Member(101, "Vansh", new StudentFine());
        Member staff = new Member(201, "Amit", new StaffFine());

        Transaction transaction = new Transaction();

        transaction.addBook(book1);
        transaction.addBook(book2);

        transaction.issueBook(book1);
        transaction.returnBook(book1);

        System.out.println("Student Fine: " + student.getFine(3));
        System.out.println("Staff Fine: " + staff.getFine(3));
    }
}
