package addressbook.controller;


import addressbook.model.Contact;
import addressbook.service.AddressBookService;

public class AddressBookController {
	
	private AddressBookService service = new AddressBookService();

    public void start() {

        // UC-6: Create a new Address Book
        service.createAddressBook("Personal");

        // UC-1: Create a Contact
        Contact contact = new Contact(
                "Rishabh",
                "Shukla",
                "Street 1",
                "Kanpur",
                "UP",
                "208001",
                "9999999999",
                "rishabh@gmail.com"
        );

        // UC-2 & UC-5: Add Contact to Address Book
        service.addContact("Personal", contact);

        // UC-3: Edit existing Contact
        service.editContactCity("Personal", "Rishabh", "Lucknow");

        // UC-4: Delete Contact
        service.deleteContact("Personal", "Rishabh");
    }

}
