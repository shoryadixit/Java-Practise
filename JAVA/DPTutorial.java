import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DPTutorial {
    public static int fibonacci(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }

    public static int minimumCostClimbStairs(int[] costs, int[] dp) {
        for (int i = 2; i < costs.length + 1; i++) {
            dp[i] = Math.min(dp[i - 1] + costs[i - 1], dp[i - 2] + costs[i - 2]);
        }
        return dp[costs.length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series: ");
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, dp) + " ");
        }

        System.out.println("\nEnter the number: ");
        int[] costs = {10, 15, 20};
        int[] dp2 = new int[costs.length + 1];

        System.out.println("Minimum steps: " + minimumCostClimbStairs(costs, dp2));

        MaximumNonAdjacentSum obj = new MaximumNonAdjacentSum();
        int[] nums = {5, 5, 10, 100, 10, 5};
        dp = new int[nums.length + 1];
        Arrays.fill(dp, 0);
        System.out.println("Adjacent Non Adjacent Sum: " + obj.solveByTabularDP(nums));
    }
}

class MaximumNonAdjacentSum {
    public int solveRec(int[] numbs, int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return numbs[0];
        }

        int incl = solveRec(numbs, n - 2) + numbs[n];
        int excl = solveRec(numbs, n - 1);

        return Math.max(incl, excl);
    }

    public int solveByDP(int[] numbs, int n, int[] dp) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return numbs[0];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int incl = solveByDP(numbs, n - 2, dp) + numbs[n];
        int excl = solveByDP(numbs, n - 1, dp);

        dp[n] = Math.max(incl, excl);
        return dp[n];
    }

    public int solveByTabularDP(int[] numbs) {
        int n = numbs.length;
        if (n == 0) return 0;
        if (n == 1) return numbs[0];

        int[] dp = new int[n];

        dp[0] = numbs[0];
        dp[1] = Math.max(numbs[0], numbs[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + numbs[i], dp[i - 1]);
        }

        return dp[n - 1];
    }
}

class MinimumCostClimbStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int[] dp = new int[n + 1];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public int minCostClimbingStairsOptimized(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < n; i++) {
            int current = Math.min(first, second) + cost[i];
            first = second;
            second = current;
        }

        return Math.min(first, second);
    }

    public int minCostClimbingStairsRecursive(int[] cost, int n) {
        if (n < 0) return 0;
        if (n == 0) return cost[0];
        if (n == 1) return cost[1];

        int first = minCostClimbingStairsRecursive(cost, n - 1);
        int second = minCostClimbingStairsRecursive(cost, n - 2);

        return Math.min(first, second) + cost[n];
    }
}

class HouseRobberySolutions {
    public int solveRecursion(int[] houses) {
        MaximumNonAdjacentSum obj = new MaximumNonAdjacentSum();
        int n = houses.length;
        if (houses.length == 0) return 0;
        if (houses.length == 1) return houses[0];

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                first.add(houses[i]);
            }
            if (i != 0) {
                second.add(houses[i]);
            }
        }
        return Math.max(obj.solveByTabularDP(first.stream().mapToInt(i -> i).toArray()), obj.solveByTabularDP(second.stream().mapToInt(i -> i).toArray()));
    }
}