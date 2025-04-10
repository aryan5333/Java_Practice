import java.util.Scanner;

class strings
{public static void main(String[] args)
    {
        int age;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        age=sc.nextInt();

        if(age>=14&&age<=55)
        {
            System.out.println("you are young");
        }
        else

        {
            System.out.println("you are not young");

        }
        sc.close(); 
        
    }
}
