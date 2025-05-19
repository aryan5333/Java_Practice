import java.lang.*;
import java.util.Scanner;

class rishu
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        
        int m=n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(m==sum)
        {
            System.out.println("its a amstrong number");
        }
        else{
            System.out.println("not an amstrong number");
        }

    
    }
}
