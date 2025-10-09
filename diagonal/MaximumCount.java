package diagonal;

public class MaximumCount {
    int n = nums.length;
        int i = lowerBound(nums, 1);  // first index with value ≥ 1
        int j = lowerBound(nums, 0);  // first index with value ≥ 0

        int positiveCount = n - i;
        int negCount = j;

        return Math.max(positiveCount, negCount);
    }

    
    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length; 
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    
}
