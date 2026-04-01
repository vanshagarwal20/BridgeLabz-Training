package searching;

import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        System.out.print("Enter word to search: ");
        String target = sc.next();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.equalsIgnoreCase(target)) count++;
            }
        }

        System.out.println("Occurrences: " + count);
        br.close();
        sc.close();
    }
}

