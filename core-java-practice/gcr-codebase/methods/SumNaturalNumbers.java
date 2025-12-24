package method;

import java.util.*;

public class SumNaturalNumbers {

	public static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) total += i;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
    }

}
