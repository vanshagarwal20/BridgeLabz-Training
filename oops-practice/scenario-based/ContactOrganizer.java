package scenario_based;

import java.util.*;

	class InvalidPhoneNumberException extends Exception {
	    public InvalidPhoneNumberException(String msg) {
	        super(msg);
	    }
	}
	
	class Contact {
	    String name;
	    String phone;
	
	    Contact(String name, String phone) {
	        this.name = name;
	        this.phone = phone;
	    }
	}
	
	public class ContactOrganizer {
	    static List<Contact> contacts = new ArrayList<>();
	
	    public static void addContact(String name, String phone) throws InvalidPhoneNumberException {
	        if (!phone.matches("\\d{10}"))
	            throw new InvalidPhoneNumberException("Phone number must be 10 digits");
	
	        for (Contact c : contacts) {
	            if (c.phone.equals(phone)) {
	                System.out.println("Duplicate contact not allowed");
	                return;
	            }
	        }
	        contacts.add(new Contact(name, phone));
	    }
	
	    public static void searchContact(String phone) {
	        for (Contact c : contacts) {
	            if (c.phone.equals(phone)) {
	                System.out.println("Found: " + c.name);
	                return;
	            }
	        }
	        System.out.println("Contact not found");
	    }
	
	    public static void deleteContact(String phone) {
	        contacts.removeIf(c -> c.phone.equals(phone));
	    }
	
	    public static void main(String[] args) throws Exception {
	        addContact("Amit", "9876543210");
	        addContact("Riya", "9123456789");
	
	        searchContact("9876543210");
	        deleteContact("9123456789");
	    }
	}

