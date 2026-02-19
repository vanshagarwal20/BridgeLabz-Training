package leet_code_codebase;

import java.util.*;

public class Palindrome {
	    public boolean isPalindrome(int x) {
	        int n = x;
	        if (x < 0) {
	            return false;
	        }
	        int rev = 0;
	        while (x > 0) {
	            int rem = x % 10;
	            rev = rev * 10 + rem;
	            x = x / 10;
	        }
	        return rev == n;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int x = sc.nextInt();

	        Palindrome sol = new Palindrome();
	        boolean result = sol.isPalindrome(x);

	        if (result) {
	            System.out.println(x + " is a Palindrome");
	        } else {
	            System.out.println(x + " is NOT a Palindrome");
	        }

	        sc.close();
	    }

}
