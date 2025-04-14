package com.data_struct_lab.examples.arrays.exercise._1431KidsWiththeGreatestNumberofCandies;

import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> result = new java.util.ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}
