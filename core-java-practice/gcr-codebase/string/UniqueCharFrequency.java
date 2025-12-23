package string;

import java.util.*;

public class UniqueCharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] uniqueChars = uniqueCharacters(input);
        String[][] freqArray = charFrequency(input, uniqueChars);
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println(freqArray[i][0] + " : " + freqArray[i][1]);
        }
    }

    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] unique = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount] = current;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] charFrequency(String str, char[] uniqueChars) {
        int len = str.length();
        int[] freq = new int[256];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }
        return result;
    }


}
