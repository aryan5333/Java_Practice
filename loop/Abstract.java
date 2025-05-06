import java.lang.*;

 abstract class Abstract
{
    public Abstract()
    {
        System.out.println("super constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of super");
    }
    abstract public void meth2();
}
class Sub extends Abstract
{
    public void meth2()
    {
        System.out.println("Sub meth2");
    }

}
 class AbstractExample
{
    public static void main(String[] args) {
        Abstract a=new Sub();
        a.meth1();
        a.meth2();

    }
}