import java.util.*;

public class Solution {
    public int missingInteger(int[] nums) {
        if (nums == null || nums.length == 0) {
            // According to constraints this probably won't happen,
            // but we can define behavior: return 1 or 0 depending on spec.
            return 1;
        }

        // Phase 1: find sum of longest sequential prefix from index 0
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Phase 2: build a set of all elements for fast membership check
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            seen.add(x);
        }

        // Phase 3: starting from sum, find smallest integer >= sum that's missing
        int candidate = sum;
        while (true) {
            if (!seen.contains(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    // Optional: for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.missingInteger(new int[]{1,2,3,2,5}));       // expect 6
        System.out.println(sol.missingInteger(new int[]{3,4,5,1,12,14,13})); // expect 15
        System.out.println(sol.missingInteger(new int[]{7}));                // sum =7, 7 in nums→ check 8→ expect 8
        System.out.println(sol.missingInteger(new int[]{5,6,7,8,9}));       // prefix [5,6,7,8,9]; sum=35; check from 35 upward
    }
}
