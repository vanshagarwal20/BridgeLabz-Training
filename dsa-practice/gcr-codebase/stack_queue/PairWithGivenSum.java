package stack_queue;

import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int needed = target - num;

//             Check if pair exists
            if (map.containsKey(needed)) {
                System.out.println("Pair found: " + needed + " + " + num + " = " + target);
                return true;
            }

//             Store current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false;
    }

//     Main method
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean result = hasPairWithSum(arr, target);
        System.out.println(result);
    }
}

