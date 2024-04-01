package DSAlab.BinarySearch.Questions;

public class CeilinOfTheNumber {
    public static int searchCeilingOftheNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        System.out.println("The Ceiling of the Targer is -> " + start);
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15 };
        System.out.println("The Ceiling Element of the Targer Element is -> " + searchCeilingOftheNumber(arr, 12));
    }
}
