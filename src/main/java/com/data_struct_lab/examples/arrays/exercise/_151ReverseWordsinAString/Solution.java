package com.data_struct_lab.examples.arrays.exercise._151ReverseWordsinAString;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isEmpty()) {
                continue;
            }
            sb.append(words[i].trim());
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a good   example";
        String result = solution.reverseWords(s);
        System.out.println(result);
    }
}
