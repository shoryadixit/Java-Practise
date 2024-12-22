import java.math.BigInteger;

public class Leetcode1945 {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i);
            System.out.println("Position: " + position);
            sb.append((position - 97) + 1);
        }
        System.out.println("String: " + sb.toString());
        BigInteger val = new BigInteger(sb.toString());
        int sum = 0;
        while (k > 0 && val.compareTo(BigInteger.ZERO) > 0) {
            sum = 0;
            while (val.compareTo(BigInteger.ZERO) > 0) {
                sum += val.mod(BigInteger.TEN).intValue();
                val = val.divide(BigInteger.TEN);
            }
            val = BigInteger.valueOf(sum);
            k--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Leetcode1945 leetcode1945 = new Leetcode1945();
        System.out.println(leetcode1945.getLucky("iiii", 1));
        System.out.println(leetcode1945.getLucky("leetcode", 2));
    }
}
