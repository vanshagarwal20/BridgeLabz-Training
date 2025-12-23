package string;

import java.util.*;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        boolean isPalindrome1 = checkPalindromeIterative(text);
        System.out.println("Palindrome check (Iterative): " + isPalindrome1);
        boolean isPalindrome2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check (Recursive): " + isPalindrome2);
        boolean isPalindrome3 = checkPalindromeWithReverseArray(text);
        System.out.println("Palindrome check (Reverse Array): " + isPalindrome3);
    }

    public static boolean checkPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(str, start + 1, end - 1);
    }

    
    public static boolean checkPalindromeWithReverseArray(String str) {
        int len = str.length();
        char[] original = str.toCharArray();
        char[] reverse = new char[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = str.charAt(len - 1 - i);
        }
        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

}
