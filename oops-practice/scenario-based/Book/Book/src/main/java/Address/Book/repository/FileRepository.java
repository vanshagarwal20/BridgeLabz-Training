package Address.Book.repository;


import java.io.*;
import java.util.*;

import Address.Book.model.Contact;

public class FileRepository implements AddressBookRepository {

    private static final String FILE_NAME = "addressbook.txt";

    public void save(List<Contact> contacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Contact contact : contacts) {
                writer.write(contact.toString());
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Contact> load() {
        return new ArrayList<>();
    }
}
