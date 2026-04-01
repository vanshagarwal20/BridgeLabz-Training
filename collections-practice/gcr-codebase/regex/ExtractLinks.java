package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String regex = "https?://\\S+";
        Matcher matcher = Pattern.compile(regex).matcher(text);

        System.out.println("Links found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        sc.close();
    }
}

