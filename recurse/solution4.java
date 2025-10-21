public class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // Pointer for the place to insert the next unique element
        int i = 0;

        // Start from the second element and check for duplicates
        for (int j = 1; j < nums.length; j++) {
            // If current element is not equal to the last unique element
            if (nums[j] != nums[i]) {
                i++;              // Move the unique pointer forward
                nums[i] = nums[j]; // Update with new unique element
            }
        }

        // Return the number of unique elements
        return i + 1;
    }

    // Test the solution
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
