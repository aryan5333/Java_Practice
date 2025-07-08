import java.util.ArrayDeque;

public class ArrayDequeDemo
{
    public static void main(String[]args)
    {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offerLast(30);
        ad.offerLast(40);
        ad.offerLast(50);
        ad.offerLast(60);

        ad.pollFirst();
         ad.forEach((x) -> System.out.println(x));

        ad.offerFirst(4);
        ad.offerFirst(6);
        ad.offerFirst(5);
        ad.offerFirst(4);

        ad.forEach((x) -> System.out.println(x)); 
    }
}