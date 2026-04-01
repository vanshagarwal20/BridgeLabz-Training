package flip_key_logical_problem;

import java.util.Scanner;

public class Program {

    public static String CleanseAndInvert(String input) {

//         Validation 1: null or length less than 6
        if (input == null || input.length() < 6) {
            return "";
        }

//         Validation 2: no space, digit, or special character
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return "";
            }
        }

//         Convert to lowercase
        String lower = input.toLowerCase();
        StringBuilder filtered = new StringBuilder();

//         Remove characters with even ASCII values
        for (char ch : lower.toCharArray()) {
            if ((int) ch % 2 != 0) {
                filtered.append(ch);
            }
        }

//         Reverse the remaining characters
        filtered.reverse();

//         Convert even index characters to uppercase
        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String input = sc.nextLine();

        String result = CleanseAndInvert(input);

        if (result.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }

        sc.close();
    }
}
