import java.lang.*;
import java.util.Scanner;

class sudha
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String num;

        System.out.println("enter a number");
        num=sc.nextLine();
        if(num.matches("[o1]"))
        {
            System.out.println("binary radix=2");

        }
        else if(num.matches("[0-7]+"))
        {
        System.out.println("octal radix=8");
        }
        else if(num.matches("[0-7,A-f]"))
        {
            System.out.println("hexadecimal radix=16");
        }


    }
}
