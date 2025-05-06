import java.lang.*;

interface  test
{
   void meth1();
   void meth2();


}
class test2 implements test
{
    public void meth1()
    {
        System.out.println("meth1 of class my");
    }
    public void meth2()
    {
        System.out.println("meth2 of my class");
    }
    public void meth3()
    {
        System.out.println("meth3 of class my");
    }

}
class testexample
{
    public static void main(String[]args)
    {
        test t=new test2();
        t.meth1();
        t.meth2();
        
    }
}