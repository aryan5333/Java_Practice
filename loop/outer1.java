import java.lang.*;

class outer
{
    int x=20;

    class inner
    {
        int y=10;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    public void outerDisplay()
    {
        inner i=new inner();
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}
public class outer1
{
   public static void main(String[]args)
   {
    outer.inner oi=new outer().new inner();
    oi.innerDisplay();


   }
}
