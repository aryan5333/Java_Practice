import java.lang.*;
import java.util.*;

public class token
{
    public static void main(String[]args)
    {
        String Data="name=Aryan;clg=LNCT;address=prakash nagar;country=India";

        StringTokenizer str= new StringTokenizer(Data,";=");
         
        String s;
        while(str.hasMoreElements())
        {
            s=str.nextToken();
            System.out.println(s);
        }
    
    }
}