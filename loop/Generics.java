import java.lang.*;

public class Generics
{
    public static void main(String[]args)
    {
        Object Obj[]=new Object[3];

        Obj[0]="hi";
        Obj[1]="Bye";
        Obj[2]=new Integer(10)  ;

        String str;

        for(int i=0;i<3;i++)
        {
            str=(String)Obj[i];
            System.out.println(str);
        }

    }
}
