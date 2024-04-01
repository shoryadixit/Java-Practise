public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        System.out.println(coinChange(arr, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        int[] count = new int[amount];
        return Changer(coins, amount, count);
    }

    public static int Changer(int[] coins, int rem, int[] count) {
        if (rem < 0) return -1;
        if (rem == 0) return 0;
        if (count[rem - 1] != 0) return count[rem - 1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = Changer(coins, rem - coin, count);
            if (res >= 0 && res < min)
                min = 1 + res;
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }
}
