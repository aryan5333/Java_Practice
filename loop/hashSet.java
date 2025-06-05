import java.lang.*;
import java.util.*;

public class hashSet
{
    public static void main(String[]args)
    {
        HashSet<Integer> hs=new HashSet<>(20,0.25f);

        hs.add(10);
        hs.add(7);
        hs.add(10);
        hs.add(20);

        System.out.println(hs);

    }
}

