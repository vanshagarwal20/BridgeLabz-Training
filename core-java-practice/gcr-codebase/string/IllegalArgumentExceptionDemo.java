package string;
import java.util.*;
public class IllegalArgumentExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Exception generated");
        }
        handleException(text);
	}
	
	 public static void generateException(String text) {
	        System.out.println(text.substring(5, 2));
	 }

	 public static void handleException(String text) {
	       try {
	           System.out.println(text.substring(5, 2));
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException handled");
	        } catch (RuntimeException e) {
	            System.out.println("Generic RuntimeException handled");
	        }
	    }

}
