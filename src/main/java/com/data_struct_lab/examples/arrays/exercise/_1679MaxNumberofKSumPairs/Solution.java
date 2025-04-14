package com.data_struct_lab.examples.arrays.exercise._1679MaxNumberofKSumPairs;

import java.util.Arrays;

public class Solution {

    public int maxOperations(int[] nums, int k) {

        nums = Arrays.stream(nums).sorted().toArray();

        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > k) {
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        int k = 2;
        System.out.println(solution.maxOperations(nums, k));
    }

}
