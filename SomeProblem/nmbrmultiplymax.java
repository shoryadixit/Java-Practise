package SomeProblem;

import java.util.Scanner;

class Solution {
    public static int integerBreak(int n) {
        int[] dp = new int[n+1];

        for(int i=1; i<n; i++){
            for(int j=1; j<i+1; j++){
                if(i+j<=n){
                    dp[i+j]=Math.max(Math.max(dp[i],i)*Math.max(dp[j],j), dp[i+j]);
                }
            }
        }

        return dp[n];
    }
    static int max(int n){
        if(n == 2 || n ==3){
            return (n - 1);
        }
        int a = 1;
        while (n > 4){
            n -= 3;
            a *= 3;
        }
        return (n*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(integerBreak(n));

        System.out.println(max(n));
    }
}