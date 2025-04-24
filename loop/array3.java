import java.lang.*;
import java.util.Scanner; 

class array3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int A[]={1,2,5,8,9,12,18};
        for(int x:A)
        System.out.println(x+"");
        System.out.println("");
        int temp=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int x:A)
        System.out.println(x+",");
        System.out.println("");
    }
        
    }
