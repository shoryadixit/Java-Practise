import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddSum {
    static int[] addSum(int[] arr, int num) {
        Map<Integer, Integer> num_map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int solution = num - arr[i];
            if (num_map.containsKey(solution)){
                return new int[] {num_map.get(solution), i};
            }
            num_map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No Match Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ar1 = addSum(arr, target);
        System.out.println(Arrays.toString(ar1));
    }
}
