import java.util.*;

public class leetcode2962 {
    // Optimized Sliding Window Approach
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int start = 0, maxElementsInWindow = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                maxElementsInWindow++;
            }
            while (k == maxElementsInWindow) {
                if (nums[start] == maxElement) {
                    maxElementsInWindow--;
                }
                start++;
            }
            ans += start;
        }

        return ans;
    }

    // Brute Force Approach
    public long bruteForceCountSubarrays(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxEleCount = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == maxElement) {
                    maxEleCount++;
                }
                if (maxEleCount >= 2) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 3, 3 };
        leetcode2962 obj = new leetcode2962();
        long ans = obj.countSubarrays(nums, 2);
        System.out.println("Sliding Window answer -> " + ans);
        long bruteForceAns = obj.bruteForceCountSubarrays(nums, 2);
        System.out.println("Brute Force answer -> " + bruteForceAns);
    }

}