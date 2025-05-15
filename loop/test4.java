import java.lang.*;

class Test3
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);
    }

}
public class test4
{
    public static void main(String[] args) {
        {
            Test3 t1=new Test3();
            t1.show();
            t1.x=30;
            t1.y=50;

            Test3 t2=new Test3();
            t2.show();
        }
    }
}