public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Iterate through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Compare with the same index character in other strings
            for (int j = 1; j < strs.length; j++) {
                // If index i is out of bounds or characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0]; // All characters matched
    }
}
