package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class MaximiseFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >= 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                int k = sc.nextInt();
                arr[i] = k;
            }
            int[] max = new int[n];
            int max1 = 0;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if(arr[n -1] == arr[0]){
                    max1 = 0;
                }
                else{
                    max1 += (arr[n - 1]) - (arr[0]) + (arr[0 + 1]);
                    break;
                }
            }
            System.out.println(max1);
        t--;
        }
    }
}
