class Solution {
    public int reverse(int x) {
        int rev = 0;  // This will hold the reversed number
        
        while (x != 0) {
            int pop = x % 10;   // Extract the last digit
            x /= 10;            // Remove the last digit
            
            // Check for overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Underflow
            }
            
            rev = rev * 10 + pop;  // Append the digit
        }
        
        return rev;
    }
}
