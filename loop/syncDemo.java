import java.lang.*;

class Mydata
{
    synchronized public void display(String str)
    {
        
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            
        }
    }


}
class MyThread1 extends Thread
{
    Mydata d;
    public MyThread1(Mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }

}
class MyThread2 extends Thread
{
    Mydata d;
    public MyThread2(Mydata d)
    {
        this.d=d;

    }
    public void run()
    {
        d.display("wellcome");
    }
}
public class syncDemo
{
    public static void main(String[]args)
    {
        Mydata data=new Mydata();
        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);
        t1.start();
        t2.start();
    }
}