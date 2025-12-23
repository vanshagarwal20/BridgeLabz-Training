package string;

import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[][] freqArray = findCharFrequency(input);
        System.out.println("Character Frequencies:");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println((char) freqArray[i][0] + " : " + freqArray[i][1]);
        }
    }

    public static int[][] findCharFrequency(String str) {
        int[] freq = new int[256]; 
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;       
                result[index][1] = freq[i]; 
                index++;
            }
        }
        return result;
    }

}
