package string;

import java.util.*;

public class CharFrequencyNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] freqArray = findCharFrequency(input);
        System.out.println("Character Frequencies:");
        for (String s : freqArray) {
            System.out.println(s);
        }
    }

    public static String[] findCharFrequency(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') {
                continue; 
            }
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

}
