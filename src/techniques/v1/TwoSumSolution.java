package techniques.v1;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        // If no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumSolution sol = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 17;

        int[] result = sol.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
