package com.data_struct_lab.examples.arrays.exercise._605CanPlaceFlowers;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }

        return count >= n;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }

}
