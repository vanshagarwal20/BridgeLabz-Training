package stack_queue;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

//         Step 1: Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

//         Step 2: Check for start of sequence
        for (int num : nums) {

//             If num is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

//                 Step 3: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }

//     Main method
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums)); // Output: 4
    }
}
