package string;
import java.util.*;

public class SplitTextWithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean result = compareArrays(customWords, builtInWords);
        System.out.println("Custom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("Built-in Split Result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("Are both results same? " + result);
        
    }
    public static int findLength(String text) {
        char[] chars = text.toCharArray();
        int count = 0;
        for (char c : chars) {
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
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

}
