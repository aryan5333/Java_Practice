import java.lang.*;
import java.util.*;
public class looppratice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Program to print AP series");
        System.out.println("Enter a,r,n");

        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();

        int term=a;

        for(int i=0;i<n;i++){
            System.out.println(term+"");
            term=term*r;
        }


   }
}
