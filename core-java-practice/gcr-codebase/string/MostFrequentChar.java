package string;

import java.util.*;

public class MostFrequentChar {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxCount = 0;
        char result = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = str.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: '" + result + "'");
    }

}
