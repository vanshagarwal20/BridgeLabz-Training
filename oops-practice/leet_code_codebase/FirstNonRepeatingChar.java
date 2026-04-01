package leet_code_codebase;

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
    	String str = "aabbcdde";
    	
//    	 Frequency array for ASCII characters
        int[] freq = new int[256];   

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Step 2: Find first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}

