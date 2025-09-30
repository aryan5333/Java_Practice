import java.lang.*;
import java.util.*;
public class Queuepratice {
    public static void main(String[]args){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(50);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.contains(80));
        System.out.println(queue.size());

    }
}