import java .lang.*;

class kgf
{
    public static void main(String[] args) {
        {
          try
          {
            int A[]={10,0,5,2};
            try
            {
                int r=A[0]/A[1];
                System.out.println(r);
            }

          }
          catch(ArithmeticException e)
          {
            System.out.println(e);

          }
          System.out.println(A[10]);
          
            catch(ArrayOutOfBoundsException e)
            {
                system.out.println(e);
            }
          
    }
}