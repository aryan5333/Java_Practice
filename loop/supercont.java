
import java.lang.*;

class parent
{
    parent()
    {
        System.out.println("non param of parent");
    }
    parent(int x)
    {
        System.out.println(" param of parent");
    }

}
class child extends parent
{
    child()
    {
        System.out.println("non param of child");
    }
    child(int y)
    {
        System.out.println("param of child");
    }
    child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child");
            
        
    }
}
public class supercont
{
    public static void main(String[]args)
    {
        child c=new child(10,20);
    }
}