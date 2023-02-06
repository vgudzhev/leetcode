package com.grind.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] res = twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] res1 = twoSum(new int[]{3, 2, 4}, 6);
        int[] res2 = twoSum(new int[]{3, 3}, 6);
        int[] res3 = twoSum(new int[]{3, 2, 3}, 6);

        System.out.println(res[0] + "" + res[1]);
        System.out.println(res1[0] + "" + res1[1]);
        System.out.println(res2[0] + "" + res2[1]);
        System.out.println(res3[0] + "" + res3[1]);
    }

    // Using hash table
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
            int expectedValue = target - nums[i];
            if (values.containsKey(expectedValue) && values.get(expectedValue) != i) {
                return new int[]{i, values.get(expectedValue)};
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int expectedValue = target - nums[i];
            if (values.containsKey(expectedValue) && values.get(expectedValue) != i) {
                return new int[]{i, values.get(expectedValue)};
            }
        }

        return null;
    }

    // Brute force
    public static int[] twoSumBruteForce(int[] nums, int target) {
        int result[] = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
}
