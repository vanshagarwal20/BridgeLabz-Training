package regex;

public class HexColor {
    public static void main(String[] args) {
        String color = "#FFA500";
        System.out.println(color.matches("#[0-9a-fA-F]{6}") ? "Valid" : "Invalid");
    }
}


