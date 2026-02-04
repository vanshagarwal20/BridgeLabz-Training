package functional_interfaces;

//	Interface with static method
	interface SecurityUtils {
	
	 static boolean isStrongPassword(String password) {
	     if (password.length() < 8) {
	         return false;
	     }
	     return true;
	 }
	}

//	Main class
	public class PasswordValidator {
	 public static void main(String[] args) {
	
	     String password = "Insurance123";
	
	     if (SecurityUtils.isStrongPassword(password)) {
	         System.out.println("Strong Password");
	     } else {
	         System.out.println("Weak Password");
	     }
	 }
	}

