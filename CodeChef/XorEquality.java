package CodeChef;
/*

    For a given N, find the number of ways to choose an integer x from the range [0,2N−1]
    such that x⊕(x+1)=(x+2)⊕(x+3), where ⊕ denotes the bitwise XOR operator.

    Since the number of valid x can be large, output it modulo 109+7.

    Input
    The first line contains an integer T, the number of test cases. Then the test cases follow.
    The only line of each test case contains a single integer N.
    Output
    For each test case, output in a single line the answer to the problem modulo 109+7.

    Constraints
    1≤T≤105
    1≤N≤105
    Subtasks
    Subtask #1 (100 points): Original Constraints

    Sample Input
    2
    1
    2
    Sample Output
    1
    2
    Explanation
    Test Case 1: The possible values of x are {0}.

    Test Case 2: The possible values of x are {0,2}.

*/
import java.util.Scanner;

public class XorEquality {
    public long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        if (x == 0) {
            return 0;
        }
        while (y > 0) {
            if (y % 2 != 0) {
                res = (res * x) % p;
            }
            y = y / 2;
            x = (x * x) % p;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            XorEquality obj = new XorEquality();
            long mod = (long) (Math.pow(10, 9) + 7);
            long x = obj.power(2, N -1, mod);
            System.out.println(x);
        }
        sc.close();
    }
}
