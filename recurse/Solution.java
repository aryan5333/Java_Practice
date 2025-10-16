import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int remaining, List<Integer> path, List<List<Integer>> result) {
        // Base case: if path has k numbers and remaining sum is 0, it's a valid combination
        if (path.size() == k && remaining == 0) {
            result.add(new ArrayList<>(path)); // make a copy and add to result
            return;
        }

        // If path is too long or remaining sum is negative, stop
        if (path.size() > k || remaining < 0) {
            return;
        }

        // Try numbers from 'start' to 9
        for (int i = start; i <= 9; i++) {
            path.add(i);  // choose the number
            backtrack(i + 1, k, remaining - i, path, result); // explore further
            path.remove(path.size() - 1);  // backtrack
        }
    }
}
