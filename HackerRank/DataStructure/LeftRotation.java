package HackerRank.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            if (n > i)
                arr[size - n + i] = in.nextInt();
            else
                arr[i - n] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

