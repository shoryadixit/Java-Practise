package DSAlab.BinarySearch;

public class binarySearch {
    public static int search(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            if (target < arr[mid])
                end = mid - 1;
            if (target > arr[mid])
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int ans = search(arr, 4);
        System.out.println(ans);
    }
}