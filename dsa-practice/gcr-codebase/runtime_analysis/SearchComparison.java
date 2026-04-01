package runtime_analysis;

import java.util.Arrays;

public class SearchComparison {

//     Linear Search - O(N)
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

//     Binary Search - O(log N)
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = 1_000_000;
        int target = N - 1;

        int[] data = new int[N];
        for (int i = 0; i < N; i++)
            data[i] = i;

//         Linear Search Timing
        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start;

//         Binary Search Timing
        Arrays.sort(data); // O(N log N)
        start = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search Time  : " + linearTime + " ns");
        System.out.println("Binary Search Time : " + binaryTime + " ns");
    }
}

