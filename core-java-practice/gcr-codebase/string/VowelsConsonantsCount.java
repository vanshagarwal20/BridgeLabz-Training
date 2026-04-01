package string;
import java.util.*;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] counts = countVowelsConsonants(text);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        for (int i = 0; i < length; i++) {
            String result = checkChar(text.charAt(i));
            if (result.equals("Vowel")) vowels++;
            else if (result.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

}
