import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 4, 5, 1 };
        // Set<Integer> set = new HashSet<>();
        // for (int n : nums) {
        // set.add(n);
        // }
        // System.out.println(set);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int n : nums) {
            if (!arr.contains(n)) {
                arr.add(n);
            }
        }
        System.out.println(arr);
    }
}
