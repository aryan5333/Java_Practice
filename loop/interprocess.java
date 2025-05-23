import java.lang.*;

class myData
{
    int value;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(flag!=true)
          try{wait();}catch(Exception e){}
        value = v;
        flag=false;
        notify();
    }
    synchronized public int get()
    {
        while(flag!=false)
            try{wait();}catch(Exception e){}
        int x=0;
        x=value;
        flag=true;
        notify();

        return x;
    }
}
class producer extends Thread
{
    myData data;
    public producer(myData d)
    {
        data = d;

    }
    public void run()
    {
        int count = 1;
        while(true)
        {
            data.set(count);
            System.out.println("producer" + count);
            count++;
        }
    } 
}
class consumer extends Thread
{
    myData data;
    public consumer(myData d)
    {
        data = d;
    }
    public void run()
    {
        while (true) 
        {
            int value = data.get();
            System.out.println("consumer" + value);

            
        }
    }
}
public class interprocess
{
    public static void main(String[] args) 
        {
            myData data=new myData();
            producer p=new producer(data);
            consumer c=new consumer(data);

            p.start();
            c.start();

        }
    }
