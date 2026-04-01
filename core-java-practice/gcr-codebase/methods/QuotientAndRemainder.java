package method;

import java.util.*;

public class QuotientAndRemainder {

	public static int[] findRemainderAndQuotient(int n, int d) {
        return new int[]{n / d, n % d};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = findRemainderAndQuotient(sc.nextInt(), sc.nextInt());
        System.out.println("Quotient: " + result[0] + " Remainder: " + result[1]);
    }

}
