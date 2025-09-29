import java.lang.*;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       int A[]={3,9,7,8,12,6,15,5,4,10};

       for(int x:A){
        System.out.println(x+"");
        System.out.println("");

        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];

        }
        A[A.length-1]=temp;
       }
       for(int x:A){
        System.out.println(x+"");
        System.out.println("");
       }

       


    }
}
