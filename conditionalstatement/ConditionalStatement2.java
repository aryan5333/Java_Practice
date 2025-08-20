import java.lang.*;
import java.util.*;

public class ConditionalStatement2
{
    public static void main(String[] args) {
       /*  int A,B;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        A=sc.nextInt();
         B=sc.nextInt();

         if(A>=B)
         {
            System.out.println("true");
         }
         else{
            System.out.println("False");
         }*/

          int number=17;
        String type=((number%2)==0)?"Even":"odd";
        System.out.println(type);
    }
}