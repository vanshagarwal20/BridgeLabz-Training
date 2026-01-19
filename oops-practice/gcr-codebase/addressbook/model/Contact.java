package addressbook.model;

public class Contact {
	
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    // UC-1: Constructor to initialize Contact details
    public Contact(String firstName, String lastName, String address,
                   String city, String state, String zip,
                   String phone, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // UC-3 & UC-4: Used to identify contact by name
    public String getFirstName() {
        return firstName;
    }

    // UC-3: Used while editing contact details
    public void setCity(String city) {
        this.city = city;
    }

    
	
}
