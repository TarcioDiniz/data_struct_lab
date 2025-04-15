package com.data_struct_lab.examples.arrays.exercise._443StringCompressio;

public class Solution {
    public int compress(char[] chars) {
        int n = chars.length, i = 0, j = 0;
        while (j < n) {
            char c = chars[j];
            int count = 0;
            while (j < n && chars[j] == c) {
                j++;
                count++;
            }
            chars[i++] = c;
            if (count > 1) {
                String s = String.valueOf(count);
                for (char ch : s.toCharArray()) {
                    chars[i++] = ch;
                }
            }
        }
        return i;
    }
}
