public class PalindromeNumber {
    class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int fp = 0;
            int sp = image[i].length - 1;

            while (fp <= sp) {
                // Swap and invert
                int temp = image[i][fp]^1;
                image[i][fp] = image[i][sp]^1;
                image[i][sp] = temp;

                fp++;
                sp--;
            }
        }
        return image;
    }
}
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int fp = 0;
            int sp = image[i].length - 1;

            while (fp <= sp) {
                // Swap and invert
                int temp = image[i][fp]^1;
                image[i][fp] = image[i][sp]^1;
                image[i][sp] = temp;

                fp++;
                sp--;
            }
        }
        return image;
    }
}

}
