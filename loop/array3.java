import java.lang.*;
import java.util.Scanner;


class array3
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);

            int A[]={1,2,4,8,6,10,17,14};
            int max=A[0];

            for(int i=0;i<A.length;i++)
            {
                if(A[i]>max)
                {
                    max=A[i];
                }

            }
            System.out.println(max);


            

            
        
            

        }
    }
