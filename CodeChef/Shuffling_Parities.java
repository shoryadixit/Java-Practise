package CodeChef;

import java.util.Scanner;

public class Shuffling_Parities {
    public static void arrange(long[] a, long n) {
        int o = 0;
        int e = 1;
        while (true) {
            while (e < n && a[e] % 2 == 1) e += 2;
            while (o < n && a[o] % 2 == 0) o += 2;
            if (e < n && o < n) {
                long temp = a[e];
                a[e] = a[o];
                a[o] = temp;
            } else break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t-- != 0) {
            long n = scan.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
            }
            arrange(a, n);

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (a[i] + (i + 1)) % 2;
            }
            System.out.println(sum);
        }
        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Collections.shuffle(Collections.singletonList(A));
            for (int i = 0; i < N; i++) {
                B[i] = (A[i] + (i+1))%2;
            }
            int a = Arrays.stream(B).sum();
            System.out.println(a);
        }*/
    }
}
