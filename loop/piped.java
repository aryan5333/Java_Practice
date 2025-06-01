import java.io.*;


class producer extends Thread
{
    OutputStream os;

    public producer(OutputStream o)
    {
        os=o;
    }
    public void run()
    {
        int count=1;
        while (true) {
            try
            {
                os.write(count);
                os.flush();

                System.out.println("Producer"+count);

                System.out.flush();
               
                count++;

            }catch(Exception e){} 
            
        }
    }

}
class consumer extends Thread
{
    InputStream is;
    public consumer(InputStream i)
    {
        is=i;

    }
    public void run()
    {
        int x;

        while(true)
        {
            try
            {
               x = is.read();

               System.out.println("consumer"+x);
               System.out.flush();
               
            }
            catch(Exception e){}
        }
    }
}
public class piped
{
    public static void main(String[]args) throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

       pis.connect(pos);

        producer p=new producer(pos);
        consumer c=new consumer(pis);

        p.start();
        c.start();
    }
}