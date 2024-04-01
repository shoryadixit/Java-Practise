package DAA;

public class EditDistance {
    //This is recursive Solution...
    public static int editDistance(String s1, String s2, int m, int n) {
        if (m == 0) return n;
        if (n == 0) return m;
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return editDistance(s1, s2, m - 1, n - 1);
        } else
            return 1 + Math.min(Math.min(editDistance(s1, s2, m, n - 1), editDistance(s1, s2, m - 1, n)), editDistance(s1, s2, m - 1, n - 1));
    }
    //This is Dynamuic Programming Solution....
    public static int editDistanceDP(String s1, String s2, int m, int n) {
        int[][] dP = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dP[i][0] = i;
        }for (int i = 0; i <= n; i++) {
            dP[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dP[i][j] = dP[i - 1][j - 1];
                } else {
                    dP[i][j] = 1 + Math.min(Math.min(dP[i][j - 1], dP[i - 1][j]), dP[i - 1][j - 1]);
                }
            }
        }
        return dP[m][n];
    }

    public static void main(String[] args) {
        String s1 = "CAT", s2 = "CUT";
        System.out.println("This is Recursive Solution --> " + editDistance(s1, s2, s1.length(), s2.length()));
        System.out.println("This is Dynamic Programming Solution --> " + editDistanceDP(s1, s2, s1.length(), s2.length()));
    }
}
