import java.lang.*;

class My implements Runnable
{
	public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
}
public class thread
{
    public static void main(String[] args) {
        My m=new My();
        Thread t1=new Thread(m);
        t1.start();
        int i=1;
        while (true)
        {
            System.out.println(i+"world");
            i++;

        } 
            
        }
    }
