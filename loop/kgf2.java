import java.lang.*;

class kgf2
{
    public static void amin(String[]args)
    {
        int a=10,b=5,c;
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
    }
}