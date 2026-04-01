package addressbook.model;

import java.util.*;

public class AddressBook {
	
	    private String name;
	    private List<Contact> contacts;

	    // UC-6: Create AddressBook with unique name
	    public AddressBook(String name) {
	        this.name = name;
	        this.contacts = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    // UC-5: Store multiple contacts
	    public List<Contact> getContacts() {
	        return contacts;
	    }

}