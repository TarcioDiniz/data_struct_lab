package com.data_struct_lab.examples.arrays;

public class ExponentialSearch {

    public static int binarySearch(int[] arr, int target, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        if (n == 0) return -1;
        if (arr[0] == target) return 0;

        int i = 1;
        while (i < n && arr[i] < target) {
            i *= 2;
        }

        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 10, 15, 18, 22, 30, 35, 40, 50, 60, 70};
        int target = 22;

        int result = exponentialSearch(arr, target);
        if (result != -1) {
            System.out.println("Elemento encontrado na posição: " + result);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
