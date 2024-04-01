package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class XOR_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextInt();
            }

            int[] B = new int[N];
            for (int i = 0; i < B.length; i++) {
                B[i] = A[i] ^ X;
            }

            System.out.println(Arrays.toString(B));
        }
    }
}
