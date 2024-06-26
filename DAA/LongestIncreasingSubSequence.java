package DAA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubSequence {
    public static int LIS(int[] arr, int n) {
        int lis[] = new int[n];
        lis[0] = 1;
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        System.out.println("The DP Array -> " + Arrays.toString(lis));
        int res = lis[0];
        for (int i = 0; i < lis.length; i++) {
            res = Math.max(res, lis[i]);
        }
        return  res;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 7, 2, 9};
        System.out.println(LIS(arr, arr.length));
    }
}
