package CodingBlocks;
import java.util.Scanner;
public class MergeKSortedArrays {
    static void mergeArrays(int[][] arr, int N, int K){
        int[] ar = new int[N * K];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}