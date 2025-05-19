import java.lang.*;
import java.util.Scanner;

class aashu
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n=sc.nextInt();

            int m=n;

            int rev=0,r;

            while(n>0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            System.out.println(rev);
            if(m==rev)
            {
                System.out.println("its a palindrome number");
            }
            else{
                System.out.println("its not a palindrome number");
            }

        }
    }
}