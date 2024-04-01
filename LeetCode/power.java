import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        power obj = new power();
        System.out.println(obj.myPow(x, n));
    }

    public double myPow(double x, int n) {
        // recursion approach
        double ans;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        ans = myPow(x, n / 2);
        ans *= ans;
        if (n % 2 == 1) {
            ans = ans * x;
        }
        return ans;
        /*
         * Brute Force Approach
         * 
         * double ans = 1;
         * if (n < 0){
         * x = 1/x;
         * n = -n;
         * }
         * for (int i = 0; i< n; i++){
         * ans = ans * x;
         * }
         * return ans;
         */
    }
}