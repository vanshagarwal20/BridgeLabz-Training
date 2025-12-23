package string;

import java.util.*;

public class WordsWithLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] wordsWithLength = wordsTo2DArray(words);
        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordsWithLength.length; i++) {
            String word = wordsWithLength[i][0];
            int length = Integer.parseInt(wordsWithLength[i][1]);
            System.out.println(word + "\t" + length);
        }
    }

    public static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        spaceIndexes[idx++] = -1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                if (text.charAt(j) != ' ') {
                    word += text.charAt(j);
                }
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] wordsTo2DArray(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

}
