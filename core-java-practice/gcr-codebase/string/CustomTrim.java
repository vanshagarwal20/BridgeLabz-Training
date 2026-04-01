package string;

import java.util.*;

public class CustomTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        int[] indices = findTrimIndices(text);
        String trimmedCustom = createSubstring(text, indices[0], indices[1]);
        String trimmedBuiltIn = text.trim();
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both strings equal? " + isEqual);
    }

    public static int[] findTrimIndices(String text) {
        int length = 0;
        for (char c : text.toCharArray()) length++;
        int start = 0;
        while (start < length && text.charAt(start) == ' ') start++;
        int end = length;
        while (end > start && text.charAt(end - 1) == ' ') end--;
        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        for (char c : s1.toCharArray()) len1++;
        for (char c : s2.toCharArray()) len2++;
        if (len1 != len2) return false;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

}
