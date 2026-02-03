package stream_API;

import java.util.*;

public class Display_API {
    public static void main(String[] args) {

        List<String> names = List.of("vansh", "rahul", "amit");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}

