package string;
import java.util.*;
public class CharArrayComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manualArray = getCharsManually(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareCharArrays(manualArray, builtInArray);
        System.out.println("Characters using user-defined method:");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }
        System.out.println("Characters using toCharArray():");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println("Are both character arrays equal? " + result);

	}
	public static char[] getCharsManually(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
