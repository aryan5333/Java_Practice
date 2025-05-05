import java.lang.*;

class overriding
{
    public void display()
    {
        System.out.println("super class display");
    }
}
class sub extends overriding
{
    public void display()
    {
        System.out.println("sub class display");
    }
}
public class overriding2
{
    public static void main(String[] args) {
        overriding ov=new sub();
        ov.display();

        sub s=new sub();
        s.display();

        
    }
}