import java.lang.*;

class MyThread extends Thread
{
    private int count = 0;

    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY);
    }
    public void run()
    {
        int i=1;
        while (true) { 
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }


}
public class threadtest
{
    public static void main(String[] args) {
        MyThread t=new MyThread("My Name");

        System.out.println("ID"+t.getId());
        System.out.println("Name"+t.getName());
        System.out.println("priority"+t.getPriority());
        t.start();
        System.out.println("State"+t.getState());
        System.out.println("Alive"+t.isAlive());
    }
}