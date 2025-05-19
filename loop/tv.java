import java.lang.*;

public class tv
{
    public void SwitchON()
    {
        System.out.println("tv is SwitchON");
    }
    public void channelChange()
    {
        System.out.println("tv channel is changed");
    }

    
}
class smarttv extends tv
{
   public void SwitchON()
   {
    System.out.println("smarttv is SwitchON");
   }
   public void channelchange()
   {
    System.out.println("smarttv channel is changed");

   }
   public void Browse()
   {
    System.out.println("smarttv is Browsing");
   }
}
 class tv2
 {
    public static void main(String[] args) {
        smarttv  t=new smarttv();
        t.SwitchON();
        t.channelchange();
    }
 }



