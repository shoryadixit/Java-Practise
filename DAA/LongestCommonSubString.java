package DAA;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubString {
    static int[][] DP;

    //This is a Tabular Solution
    public static int lcs(String s1, String s2, int s1Length, int s2Length) {
        DP = new int[s1Length + 1][s2Length + 1];
        for (int i = 1; i < s1Length + 1; i++) {
            for (int j = 1; j < s2Length + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    DP[i][j] = 1 + DP[i - 1][j - 1];
                } else {
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
                }
            }
        }
        return DP[s1Length][s2Length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int a = lcs(s1, s2, s1.length(), s2.length());
        System.out.println("This is a Tabular Solution of LCS --> " + a);
        DP = new int[s1.length() + 1][s2.length() + 1];

        int b = recursiveLCS(s1, s2, s1.length(), s2.length());
        System.out.println("This is a Recursive Solution of LCS --> " + b);

        for (int i = 0; i < DP.length; i++) {
            System.out.println(Arrays.toString(DP[i]));
        }
    }

    //This is a Recursive Solution with optimize DP Approach and if we remove all DP lines and write simple return statements
//    then its simple recurseve approach
    public static int recursiveLCS(String s1, String s2, int s1Length, int s2Length) {
        if (DP[s1Length][s2Length] != -1) {
            if (s1Length == 0 || s2Length == 0) return DP[s1Length][s2Length] = 0;
            if (s1.charAt(s1Length - 1) == s2.charAt(s2Length - 1))
                DP[s1Length][s2Length] = 1 + recursiveLCS(s1, s2, s2Length - 1, s2Length - 1);
            else
                DP[s1Length][s2Length] = Math.max(recursiveLCS(s1, s2, s1Length - 1, s2Length), recursiveLCS(s1, s2, s1Length, s2Length - 1));
        }
        return DP[s1Length][s2Length];


//      Bottom Code is Simple Recursive Approach

//        if (s1Length == 0 || s2Length == 0) return 0;
//        if (s1.charAt(s1Length - 1) == s2.charAt(s2Length - 1))
//            return 1 + recursiveLCS(s1, s2, s2Length - 1, s2Length - 1);
//        else
//            return Math.max(recursiveLCS(s1, s2, s1Length - 1, s2Length), recursiveLCS(s1, s2, s1Length, s2Length - 1));
    }
}
