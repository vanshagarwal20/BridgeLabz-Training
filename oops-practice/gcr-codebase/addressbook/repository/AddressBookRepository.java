package addressbook.repository;

import java.util.*;

import addressbook.model.AddressBook;
import addressbook.model.Contact;

public class AddressBookRepository {
	
	
	 
     // UC-6:
     // Store multiple AddressBooks using Map
     // Key   → AddressBook name
     // Value → AddressBook object
     
    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    // UC-6: Add new AddressBook
    public void addAddressBook(AddressBook addressBook) {
        addressBookMap.put(addressBook.getName(), addressBook);
    }

    // UC-6: Retrieve AddressBook by name
    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

   
    public void addContact(String bookName, Contact contact) {
        addressBookMap.get(bookName).getContacts().add(contact);
    }

}