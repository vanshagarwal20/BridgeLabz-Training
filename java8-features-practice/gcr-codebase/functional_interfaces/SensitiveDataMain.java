package functional_interfaces;

//	Custom Marker Interface
	interface SensitiveData {
	 // No methods
	}
	
//	Class marked as sensitive
	class UserCredentials implements SensitiveData {
	
	 String username;
	 String password;
	
	 UserCredentials(String username, String password) {
	     this.username = username;
	     this.password = password;
	 }
	}
	
//	Main class
	public class SensitiveDataMain {
	 public static void main(String[] args) {
	
	     UserCredentials user = new UserCredentials("admin", "secret123");
	
//	      Checking marker interface using instanceof
	     if (user instanceof SensitiveData) {
	         System.out.println("Sensitive data detected");
	         System.out.println("Encryption required");
	     } else {
	         System.out.println("Normal data");
	     }
	 }
	}

