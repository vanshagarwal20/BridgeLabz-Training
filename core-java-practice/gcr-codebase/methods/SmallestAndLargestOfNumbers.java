package method;

import java.util.*;

public class SmallestAndLargestOfNumbers {

	public static int[] findSmallestAndLargest(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = findSmallestAndLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Smallest: " + result[0] + " Largest: " + result[1]);
    }

}
