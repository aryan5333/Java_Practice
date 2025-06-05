import java.lang.*;
import java.util.*;


public class Linkedhash
{
    public static void main(String[]args)
    {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("M");
        lhs.add("g");
        lhs.add("D");
        lhs.add("K");

        Iterator<String> itr=lhs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }





    }
}