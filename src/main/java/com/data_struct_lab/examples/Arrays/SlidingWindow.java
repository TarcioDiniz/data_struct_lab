package com.data_struct_lab.examples.Arrays;

public class SlidingWindow {

    public static int findMaxLengthSubstring(char[] arr, char str) {
        int left = 0;
        int right = 0;
        int max = 0;
        int count = 0;
        while (right < arr.length) {
            if (arr[right] == str) count++;
            while (count > 1) {
                if (arr[left] == str) count--;
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'A', 'B', 'C'};
        System.out.println(findMaxLengthSubstring(arr, 'A'));
    }

}
