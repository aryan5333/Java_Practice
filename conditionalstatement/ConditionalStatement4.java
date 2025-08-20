import java.lang.*;
import java.util.*;

public class ConditionalStatement4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int marks=sc.nextInt();
        String type=((marks>=33))?"Pass":"fail";
        System.out.println(type);*/
        int marks=sc.nextInt();
        if(marks>=33)
        {
            System.out.println("Student will pass");
        }
        else
        {
            System.out.println("Student will fail");
        }
    }
}