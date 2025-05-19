import java.lang.*;

public class Finally
{
    public static void main(String[]args)
    {
        try
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("Finally message");
        }


        
    }
}