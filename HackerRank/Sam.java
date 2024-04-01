package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sam {
    static void max(int[] arr, String[] arr1){
        int max = arr[0], k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                k = i;
            }
        }
        String s = arr1[k].trim();
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] totalvisit = new int[n];
        String[] costumername = new String[n];
        for (int i = 0; i < n; i++) {
            totalvisit[i] = sc.nextInt();
            costumername[i] = sc.nextLine() + " ";
        }
        max(totalvisit, costumername);

    }
}
