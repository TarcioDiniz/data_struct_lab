package com.data_struct_lab.examples.arrays;

public class TwoPointer {

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String input = "Tarcio Elyakin Agra Diniz";
        System.out.println(TwoPointer.reverse(input));
    }

}
