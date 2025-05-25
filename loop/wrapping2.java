import java.lang.*;

class wrapping2
{
    public static void main(String[] args) {
        float a=(float)Math.sqrt(-1);;
        Float b=12.5f/0;
        System.out.println(b==Float.POSITIVE_INFINITY);

        System.out.println(Float.isNaN(a));
    }
    
}

(ye niche wala code uppar wala se alag hai);

import java.lang.*;

public class wrapping2
{
    public static void main(String[] args) {
        int m1=5;

        Integer m2=Integer.valueOf("123");
        Integer m3=Integer.valueOf("A7", 16);;

        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
    }
}