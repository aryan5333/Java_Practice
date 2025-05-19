import java.lang.*;
import java.util.Scanner;

class array2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        int A[]={1,2,4,8,6,5,7};
        int key;
        System.out.println("enter a key");
        key=sc.nextInt();

        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
        {
            System.out.println("element found at:"+i);
            System.exit(0);
        }

        }
        System.out.println("element not found");

    }

}


