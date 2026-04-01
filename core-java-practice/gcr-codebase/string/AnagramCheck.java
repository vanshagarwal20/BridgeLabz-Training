package string;

import java.util.*;

public class AnagramCheck {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replace(" ", "");
        String s2 = sc.nextLine().replace(" ", "");
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for (int f : freq) {
            if (f != 0) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
    }


}
