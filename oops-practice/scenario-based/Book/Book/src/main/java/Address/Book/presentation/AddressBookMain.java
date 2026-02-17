package Address.Book.presentation;


import java.util.Scanner;

import Address.Book.model.Contact;
import Address.Book.repository.JSONRepository;
import Address.Book.service.AddressBookService;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBookService service =
                new AddressBookService(new JSONRepository());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        Contact contact = new Contact(
                firstName,
                "Agarwal",
                "Rampur",
                "Rampur",
                "UP",
                "244922",
                "9999999999",
                "test@gmail.com"
        );

        service.addContact(contact);

        service.sortByName();

        service.saveAsync();  // Non-blocking save

        service.getContacts().forEach(System.out::println);
    }
}
