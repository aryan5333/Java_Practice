import java.lang.*;
import java.util.Scanner;

class array3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]={1,2,13,16,7,45,84};
        int max1,max2;
         max1=max2=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("Second Largest is"+max2);
        
    }
}