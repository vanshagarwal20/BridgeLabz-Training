package stack_queue;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

//         Map: cumulative sum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

//         To handle subarray starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

//             If same sum seen before, zero-sum subarrays exist
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

//             Store current index for this sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

//     Main method
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};

        findZeroSumSubarrays(arr);
    }
}
