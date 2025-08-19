import java.lang.*;

public class nestedloop
{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i+j>4)
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.println("");
                }
                System.out.println("");

                
            }
            
        }

    }

}