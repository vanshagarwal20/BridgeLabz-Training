package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        String regex = "\\b[A-Z][a-z]*\\b";
        Matcher matcher = Pattern.compile(regex).matcher(text);

        System.out.println("Capitalized Words:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        sc.close();
    }
}

