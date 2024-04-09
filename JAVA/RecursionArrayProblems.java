package JAVA;

import java.util.Arrays;

public class RecursionArrayProblems {
    static boolean isSortedArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSortedArray(arr, index + 1);
    }

    static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linearSearch(arr, index + 1, target);
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return binarySearch(arr, target, s, m - 1);
            } else {
                return binarySearch(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m]) {
            return binarySearch(arr, target, m + 1, e);
        }

        return binarySearch(arr, target, s, m - 1);
    }

    static void bubbleSort(int[] arr, int start, int end) {
        if (end == 0) {
            return;
        }

        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                // swap
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            bubbleSort(arr, start + 1, end);
        } else {
            bubbleSort(arr, 0, end - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 2, 1, 5, 10, 4, 9 };
        System.out.println("Is Sorted Array -> " + isSortedArray(arr, 0));

        System.out.println("Linear Search -> " + linearSearch(arr, 0, 3));

        System.out.println("Binary Search -> " + binarySearch(arr, 2, 0, arr.length));

        bubbleSort(arr2, 0, arr.length - 1);

        System.out.println("Bubble Sort -> " + Arrays.toString(arr2));
    }
}