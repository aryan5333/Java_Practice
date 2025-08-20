import java.lang.*;
import java.util.Scanner;

public class ConditionalStatement
{
    public static void main(String[]args)
    {
        int age;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
         age=sc.nextInt();

        if(age>18)
        {
            System.out.println("you are eligible to vote");

        }

        else if(age>13 && age<18)
        {
            System.out.println("you are a teenager");
        }
        else
        {
            System.out.println("you are not eligible to vote");
        }


    }
}