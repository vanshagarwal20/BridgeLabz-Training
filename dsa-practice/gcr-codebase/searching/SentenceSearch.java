package searching;

import java.util.*;

public class SentenceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        String result = "Not Found";
        for (String s : sentences) {
            if (s.contains(word)) {
                result = s;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
