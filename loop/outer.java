import java.lang.*;

class outer3
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("hello");
            }
        }
        Inner i=new Inner();
        i.show();

    }
}
public class outer
{
    public static void main(String[]args)
    {
        outer3 o = new outer3();
        o.display();
    }
}