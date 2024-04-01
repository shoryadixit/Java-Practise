package CodeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pre_Elimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] S = new int[N];
            for (int i = 0; i < S.length; i++) {
                S[i] = sc.nextInt();
            }

            System.out.println(solve(K, S));
        }

        sc.close();
    }

    static int solve(int K, int[] S) {
        Arrays.sort(S);

        int beginIndex = S.length - K;
        while (beginIndex > 0 && S[beginIndex - 1] == S[beginIndex]) {
            beginIndex--;
        }

        return S.length - beginIndex;
    }
}
