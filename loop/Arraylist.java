import java.lang.*;
import java.util.*;

public class Arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);

        ArrayList<Integer> al2=new ArrayList<>(List.of(20,30,40,50,60));

        al1.add(10);
        al1.add(0,5 );
        al1.addAll(1,al2);
        al1.add(5,40);


        al1.set(6, 90);

        ListIterator<Integer> it= al1.listIterator() ;
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        al1.forEach(n->show(n));
        

        

        for(int i=0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        } 

    }
    public static void show(int i)
    {
        if(i>30)
        {
           System.out.println(i);
        }
    }
}
