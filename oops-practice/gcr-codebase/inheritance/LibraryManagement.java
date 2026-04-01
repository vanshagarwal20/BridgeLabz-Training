package inheritance;

//	Superclass
	class Book {
	 String title;
	 int publicationYear;
	
	 Book(String title, int publicationYear) {
	     this.title = title;
	     this.publicationYear = publicationYear;
	 }
	
	 void displayInfo() {
	     System.out.println("Book Title: " + title);
	     System.out.println("Publication Year: " + publicationYear);
	 }
	}
	
//	Subclass
	class Author extends Book {
	 String authorName;
	 String bio;
	
	 Author(String title, int publicationYear, String authorName, String bio) {
	     super(title, publicationYear);
	     this.authorName = authorName;
	     this.bio = bio;
	 }
	
	 @Override
	 void displayInfo() {
	     super.displayInfo();
	     System.out.println("Author Name: " + authorName);
	     System.out.println("Author Bio: " + bio);
	 }
	}
	
//	Main class
	public class LibraryManagement {
	 public static void main(String[] args) {
	
	     Author book1 = new Author(
	             "Clean Code",
	             2008,
	             "Robert C. Martin",
	             "Software engineer and author"
	     );
	
	     book1.displayInfo();
	 }

}
