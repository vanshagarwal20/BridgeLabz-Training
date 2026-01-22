package queue_interface;

import java.util.*;

public class BinaryNumbersQueue {

    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // start with "1"

        for (int i = 0; i < n; i++) {
            // Get front element
            String current = queue.remove();
            result.add(current);

            // Append "0" and "1" and enqueue back
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generateBinaryNumbers(n));
    }
}

