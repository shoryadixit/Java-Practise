import java.util.Arrays;
import java.util.Scanner;

public class Build_Array_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Build_Array_Permutation obj = new Build_Array_Permutation();
        System.out.println(Arrays.toString(obj.buildArray(arr)));
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[i] = nums[nums[i]];
            }
        }
        return ans;
    }
}
