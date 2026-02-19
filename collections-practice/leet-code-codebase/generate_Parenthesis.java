package leet_code_codebase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generate_Parenthesis {
	    public List<String> generateParenthesis(int n) {
	        List<String> ll = new ArrayList<>();
	        help(ll, n, 0, 0, "");
	        return ll;
	    }

	    public static void help(List<String> ll, int n, int open, int close, String ans) {
	        if (open == n && close == n) {
	            ll.add(ans);
	            return;
	        }
	        if (open < n) {
	            help(ll, n, open + 1, close, ans + '(');
	        }
	        if (close < open) {
	            help(ll, n, open, close + 1, ans + ')');
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        generate_Parenthesis sol = new generate_Parenthesis();
	        List<String> result = sol.generateParenthesis(n);
	        System.out.println("Valid Parentheses Combinations:");
	        for (String s : result) {
	            System.out.println(s);
	        }
	    }
}
