import java.lang.*;
import java.util.*;

public class priorityQueue
{
    public static void main(String[] args) {
    PriorityQueue<Integer> p=new PriorityQueue<>();

    p.add(20);
    p.add(60);
    p.add(10);
    p.add(1);
    p.add(15);
    p.add(3);

    System.out.println(p.peek());

    
    p.poll();
    p.forEach((x)->System.out.println(x));
        

    
        
    }
}