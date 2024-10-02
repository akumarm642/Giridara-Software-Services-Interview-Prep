import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] nums = { 10, 5, 8, 20, 15 };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length - 2]);
    }
}
