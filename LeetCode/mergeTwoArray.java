import java.util.Arrays;

public class mergeTwoArray {
    public static void merge(int[] nums1, int[] nums2, int m, int n){
        int[] nums = new int[m];
        for (int i = 0; i < m; i++){
//            if(nums1[i] == 0)
//                continue;
//            else
                nums[i] = nums1[i];
        }
        int[] ans = new int[m + n];
        for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[i];
        }
        for (int i = nums.length; i < nums2.length; i++) {
            ans[i] = nums2[i];
        }
        bubbleSort(ans);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, nums2, 3, nums2.length);
    }
}
