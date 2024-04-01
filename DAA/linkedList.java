package DAA;

public class linkedList {
    private static Node head;
    private  static Node tail;

    public static class Node{
        private int data;
        private Node next;
        private Node previous;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        Node one = new Node(1);
        list.head = one;

        System.out.println(head.data);
    }

    public static class CoinChange {
        public static int coinChange(int[] coins, int amount) {
            if (amount < 1) return 0;
            // return coinChange(coins, amount, new int[amount]);
            return getCount(coins, coins.length, amount);
        }

        // private int coinChange(int[] coins, int rem, int[] count) {
        //     if (rem < 0) return -1;
        //     if (rem == 0) return 0;
        //     if (count[rem - 1] != 0) return count[rem - 1];
        //     int min = Integer.MAX_VALUE;
        //     for (int coin : coins) {
        //         int res = coinChange(coins, rem - coin, count);
        //         if (res >= 0 && res < min)
        //             min = 1 + res;
        //     }
        //     count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        //     return count[rem - 1];
        // }

        public static int getCount(int[] coin, int n, int sum) {
            if (sum == 0) {
                return 1;
            }
            if (n == 0) {
                return 0;
            }
            int res = getCount(coin, n - 1, sum);
            if (coin[n - 1] <= sum) res = res + getCount(coin, n, sum - coin[n - 1]);
            return res;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 5};
            int sum = 11;
            System.out.println(coinChange(arr, sum));
        }
    }
}
