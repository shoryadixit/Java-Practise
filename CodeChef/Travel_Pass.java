package CodeChef;

import java.util.Scanner;

public class Travel_Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            str = str.substring(0, N);
            int count0 = 0, count1 = 0;
            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(str.substring(i, i + 1));
                if (a == 0) {
                    count0 += 1;
                } else if (a == 1) {
                    count1 += 1;
                }
            }

            System.out.println((A * count0) + (B * count1));
        }
    }
}
