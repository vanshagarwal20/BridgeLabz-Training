package regex;

import java.util.Scanner;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        String regex = "\\b(\\w+)\\s+\\1\\b";
        Matcher matcher =
            Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);

        System.out.println("Repeating words:");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }

        sc.close();
    }
}

