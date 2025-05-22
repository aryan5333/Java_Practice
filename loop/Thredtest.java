import java.lang.*;

class MyThread extends Thread
{
    public void run()
    {
        int count =1;
        while(true)
         { 
            System.out.println(count++ +"MyThread");
            
        }
    }
}
public class Thredtest
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();
        
        int count =1;
        while(true)
         { 
            System.out.println(count++ +"Main");
            Thread.yield();
            
        }
    
            
        

    }
}
 