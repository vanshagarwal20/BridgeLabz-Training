package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Matcher matcher = Pattern.compile(regex).matcher(text);

        System.out.println("Email Addresses:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        sc.close();
    }
}

