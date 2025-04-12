import java.util.Scanner;

class aniket
{
    public static void main(String[]args)
    {
      int m1,m2,m3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter marks of subject");
      m1=sc.nextInt();
      m2=sc.nextInt();
      m3=sc.nextInt();

      float avg=(m1+m2+m3)/3;

      if(avg>=70)
      {
        System.out.println("grade A");
      }
      else if(avg>=60&&avg<70)
      {
        System.out.println("grade B");

      }
      else if(avg>=50&&avg<60)
      {
        System.out.println("grade c");
      }
      else if(avg>=40&&avg<50)
      {
        System.out.println("grade D");

      }
      else{
        System.out.println("grade E");
      }



    }
}


    


    

