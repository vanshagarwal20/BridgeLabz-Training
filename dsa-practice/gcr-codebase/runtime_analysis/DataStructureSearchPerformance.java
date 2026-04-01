package runtime_analysis;

import java.util.*;

public class DataStructureSearchPerformance {

    public static void main(String[] args) {

        int N = 1_000_000;
        int target = N - 1;

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, time;

//         Array Search - O(N)
        start = System.nanoTime();
        for (int x : array) {
            if (x == target) break;
        }
        time = System.nanoTime() - start;
        System.out.println("Array Search Time  : " + time + " ns");

//         HashSet Search - O(1)
        start = System.nanoTime();
        hashSet.contains(target);
        time = System.nanoTime() - start;
        System.out.println("HashSet Search Time: " + time + " ns");

//         TreeSet 	Search - O(log N)
        start = System.nanoTime();
        treeSet.contains(target);
        time = System.nanoTime() - start;
        System.out.println("TreeSet Search Time: " + time + " ns");
    }
}
