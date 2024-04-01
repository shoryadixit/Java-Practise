import java.util.Arrays;

public class RunningSum{
    public int[] runSum(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        RunningSum obj = new RunningSum();
        obj.runSum(arr);
    }
}