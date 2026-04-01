package string;
import java.util.*;
public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }

        handleException();
	}
	public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

}
