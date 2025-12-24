package method;

import java.util.*;

public class ChocolatesDistribution {

	public static int[] findRemainderAndQuotient(int c, int kids) {
        return new int[]{c / kids, c % kids};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = findRemainderAndQuotient(sc.nextInt(), sc.nextInt());
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }

}
