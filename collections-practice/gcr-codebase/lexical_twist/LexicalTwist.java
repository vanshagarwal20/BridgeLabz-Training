package lexical_twist;

import java.util.*;

public class LexicalTwist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

//         Validation for first word
        if (first.trim().contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

//         Validation for second word
        if (second.trim().contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }

//         Check if second is reverse of first (case-insensitive)
        String reversedFirst = new StringBuilder(first).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(second)) {
//             Case 1: Second word is reverse of first
            String result = reversedFirst.toLowerCase();
            result = result.replaceAll("[aeiou]", "@");
            System.out.println(result);
        } else {
//             Case 2: Not reverse
            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;
            Set<Character> vowelSet = new LinkedHashSet<>();
            Set<Character> consonantSet = new LinkedHashSet<>();

            for (char ch : combined.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if ("AEIOU".indexOf(ch) != -1) {
                        vowels++;
                        vowelSet.add(ch);
                    } else {
                        consonants++;
                        consonantSet.add(ch);
                    }
                }
            }

            if (vowels > consonants) {
                printFirstTwo(vowelSet);
            } else if (consonants > vowels) {
                printFirstTwo(consonantSet);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }

//     Helper method to print first 2 unique characters
    private static void printFirstTwo(Set<Character> set) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char ch : set) {
            sb.append(ch);
            count++;
            if (count == 2) break;
        }

        System.out.println(sb.toString());
    }
}

