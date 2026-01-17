package searching;

import java.util.*;

public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        int target = sc.nextInt();
        boolean found = false;

        int left = 0, right = r * c - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int val = matrix[mid / c][mid % c];
            if (val == target) {
                found = true;
                break;
            } else if (val < target) left = mid + 1;
            else right = mid - 1;
        }

        System.out.println(found);
        sc.close();
    }
}

