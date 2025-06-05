import java.lang.*;
import java.util.*;

public class HashTable
{
    public static void main(String[]args)
    {
        Hashtable hs= new Hashtable();

        hs.put(1, "A");
        hs.put(2,"B" );
        hs.put(3,"c");
        hs.put(4,"M");
        hs.put(5,"G");

        String s=(String)hs.get(3);

        hs.computeIfAbsent(7, (k)->"S"+k);

        hs.compute(2, (k,v)->v+"z");
       /*   Enumeration e=hs.keys();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }*/

        System.out.println(hs);

    }
}