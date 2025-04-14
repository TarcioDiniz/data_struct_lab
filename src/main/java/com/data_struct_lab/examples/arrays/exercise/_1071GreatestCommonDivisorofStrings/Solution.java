package com.data_struct_lab.examples.arrays.exercise._1071GreatestCommonDivisorofStrings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int str1Len = str1.length();
        int str2Len = str2.length();

        while (str2Len != str1Len && str2Len != 0) {
            int temp = str2Len;
            str2Len = str1Len % str2Len;
            str1Len = temp;
        }

        return str1.substring(0, str1Len);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB")); // "ABC"
    }
}
