package regex;

import java.util.Scanner;

public class ValidateHexColor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        String regex = "^#[0-9a-fA-F]{6}$";

        if (color.matches(regex))
            System.out.println("Valid Hex Color");
        else
            System.out.println("Invalid Hex Color");

        sc.close();
    }
}

