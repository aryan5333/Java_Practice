import java.lang.*;
import java.util.Scanner;
class kgf
{
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0,try again");
        }
        System.out.println("Bye");
        sc.close();
    }
}
//ok