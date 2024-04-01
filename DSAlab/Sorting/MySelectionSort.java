package DSAlab.Sorting;

import java.util.Arrays;

public class MySelectionSort {
    static void selectionSort(int[] arr) {
        int mainIndex;
        for (int i = 0; i < arr.length; i++) {
            mainIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[mainIndex]) {
                    int temp = arr[mainIndex];
                    arr[j] = arr[mainIndex];
                    arr[mainIndex] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {43, 23, 12, 3, 4, 8};
        selectionSort(arr);
    }
}
