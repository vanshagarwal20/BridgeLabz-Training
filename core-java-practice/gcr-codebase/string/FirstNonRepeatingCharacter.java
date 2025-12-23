package string;

import java.util.*;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char firstNonRepeat = findFirstNonRepeatingChar(input);

        if (firstNonRepeat != 0) {
            System.out.println("First non-repeating character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] freq = new int[256]; 
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return 0;
    }

}
