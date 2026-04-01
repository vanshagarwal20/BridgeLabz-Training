package string;
import java.util.*;
public class SubstringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String manualSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);
        boolean result = compareStrings(manualSubstring, builtInSubstring);
        System.out.println("Substring using manual charAt(): " + manualSubstring);
        System.out.println("Substring using built in substring() method : " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);

	}
	public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
