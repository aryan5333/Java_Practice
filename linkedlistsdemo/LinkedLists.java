package linkedlistsdemo;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        
        ll.add(2,40);
        ll.add(1,35);

        Iterator<Integer> it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //System.out.println(ll.contains(40));

        /*Iterator<Integer> it=ll.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
    }
    
}
