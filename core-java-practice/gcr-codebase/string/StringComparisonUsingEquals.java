package string;
import java.util.*;
public class StringComparisonUsingEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String string1 = sc.next();
        System.out.print("Enter second string : ");
        String string2 = sc.next();
        boolean charAtResult = compareUsingCharAt(string1, string2);
        boolean equalsResult = string1.equals(string2);
        System.out.println("Comparison using charAt() : " + charAtResult);
        System.out.println("Comparison using equals() : " + equalsResult);
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the SAME result ie True or False.");
        } else {
            System.out.println("Both methods give DIFFERENT results ie True or False.");
        }
	}
	public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
