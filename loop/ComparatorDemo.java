import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

class My implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        if(i1 < i2)
        {
            return -1;
        }

        if(i1 > i2)
        {
            return 1;
        }
        return 0;
    }
}
public class ComparatorDemo
{
    public static void main(String[]args)
    {
        Integer a[] = {2,3,4,5,6,7,8,9};
        //Integer b[] = {2,3,4,5,6,7,8,9};

        //Integer c[] = Arrays.copyOf(a, a.length);
        //Arrays.fill(c,15);
        Arrays.sort(a, new My());
        
        //System.out.println(Arrays.binarySearch(c, 6));

        for(int x : a)
        {
            System.out.println(x);
        }
    }
}