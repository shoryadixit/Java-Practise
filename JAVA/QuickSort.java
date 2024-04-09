package JAVA;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int lower, int higher) {
        if (lower >= higher) {
            return;
        }

        int s = lower, e = higher, m = s + (e - s) / 2, pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, lower, e);
        quickSort(arr, s, higher);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
