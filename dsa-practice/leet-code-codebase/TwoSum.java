package leet_code_codebase;

import java.util.*;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
//       return -1 if no solution
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
//         Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

//         Call twoSum method
        int[] result = twoSum(nums, target);

//         Print output
        if (result[0] != -1) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values : " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No valid pair found!");
        }
    }

	
}
