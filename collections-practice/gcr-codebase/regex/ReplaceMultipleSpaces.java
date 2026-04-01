package regex;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String result = text.replaceAll("\\s+", " ");
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}

