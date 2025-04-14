package com.data_struct_lab.examples.arrays.exercise._219ContainsDuplicateII;


import java.util.HashSet;
import java.util.Set;

public class Solution {


    /*

    Esta solução resolve, porém não eh a melhor solução

    Esse algoritmo eh O(n^2)

    e vamos melhorar isso usando Sliding Window

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && Math.abs(i - j) <= k && nums[i] == nums[j]) return true;
            }
        }
        return false;
    }*/

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            if (!window.add(nums[i])) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }

}

