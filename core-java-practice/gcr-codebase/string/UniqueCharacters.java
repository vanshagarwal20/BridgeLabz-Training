package string;

import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] uniqueChars = findUniqueChars(input);
        System.out.print("Unique characters in the string are: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
    }

    public static int getLength(String str) {
        int count = 0;
        char[] temp = str.toCharArray(); 
        for (char c : temp) {
            count++;
        }
        return count;
    }

    public static char[] findUniqueChars(String str) {
        int len = getLength(str);
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

}
