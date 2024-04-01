import java.util.*;

public class calculateFactors {
    public static List<Integer> findFactors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                res.add(i);
                if (n / i != i)
                    res.add(n / i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = findFactors(36);
        System.out.println(res.toString());
    }
}
