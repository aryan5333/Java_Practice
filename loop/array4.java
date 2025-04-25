import java.lang.*;
import java.util.Scanner;

class array4
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        A[0]=1;
        A[1]=5;
        A[2]=9;
        A[3]=10;
        A[4]=12;
        A[5]=15;

        int n=6;
        for(int i=0;i<n;i++)
        
            System.out.println(A[i]+",");
            System.out.println("");
            int x=20;
            int index=2;
            for(int i=n;i>index;i--)
                A[i]=A[i-1];
                A[index]=x;
                
                for(int i=0;i<n;i++)
        
            System.out.println(A[i]+",");
            System.out.println("");
            

        

        
        


    }
}