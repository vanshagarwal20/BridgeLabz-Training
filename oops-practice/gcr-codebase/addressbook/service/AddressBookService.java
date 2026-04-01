package addressbook.service;

import addressbook.model.AddressBook;
import addressbook.model.Contact;
import addressbook.repository.AddressBookRepository;

public class AddressBookService {
	
	private AddressBookRepository repository = new AddressBookRepository();
	
	
	
     // UC-6:
     // Ability to add multiple Address Books to system
     
	 public void createAddressBook(String name) {
	        repository.addAddressBook(new AddressBook(name));
	        System.out.println("created address book");
	    }
	 
	 
	 public void addContact(String bookName, Contact contact) {
	        repository.addContact(bookName, contact); 
	        System.out.println("contact added");
	    }
	 
	 
	     //UC-3:
	     // Ability to edit existing contact person
	     // using person's first name
	 public void editContactCity(String bookName, String firstName, String newCity) {
	        AddressBook book = repository.getAddressBook(bookName);

	        for (Contact contact : book.getContacts()) {
	            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
	                contact.setCity(newCity);
	                System.out.println("Updated number successfully");
	                break;
	            }
	        }
	    }
	 
	 
	 
	 public void deleteContact(String bookName, String firstName) {

		    AddressBook book = repository.getAddressBook(bookName);

		    for (int i = 0; i < book.getContacts().size(); i++) {
		        Contact contact = book.getContacts().get(i);

		        if (contact.getFirstName().equalsIgnoreCase(firstName)) {
		            book.getContacts().remove(i);
		            System.out.println("address deleted");
		            break; 
		        }
		    }
		}


}
