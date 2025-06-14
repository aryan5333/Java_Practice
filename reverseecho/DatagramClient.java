import java.lang.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient
{
    public static void main(String[] args) throws Exception {
        
        DatagramSocket ds=new DatagramSocket(2001);
        String msg="Hello World";

        DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
        ds.send(dp);

        byte b[]=new byte[1024];
        dp=new DatagramPacket(b,1024);

        ds.receive(dp);

        msg=new String(dp.getData()).trim();
        System.out.println("From Server"+msg);

        ds.close();
        
    }
}

 class DatagramServer
{
    public static void main(String[] args) throws Exception {
        
        DatagramSocket ds=new DatagramSocket(2000);
        
        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,1024);

        ds.receive(dp);

        String msg=new String(dp.getData()).trim();
        System.out.println("From Client"+msg);

        StringBuilder st=new StringBuilder(msg);
        st.reverse();
        msg=st.toString();




         dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
        ds.send(dp);

        
        ds.close();
        
    }
}