package functional_interfaces;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

//         Function to find length of string
        Function<String, Integer> getLength = str -> str.length();

        String message = "Hello World";
        int limit = 10;

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println("Message is too long");
        } else {
            System.out.println("Message length is within limit");
        }
    }
}

