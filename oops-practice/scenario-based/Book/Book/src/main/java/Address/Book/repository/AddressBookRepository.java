package Address.Book.repository;

import java.util.List;

import Address.Book.model.Contact;

public interface AddressBookRepository {

    void save(List<Contact> contacts);

    List<Contact> load();
}
