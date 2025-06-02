import java.lang.*;
import java.io.*;

class customer implements Serializable
{
    String custID;
    String name;
    String phoneno;

    static int count=0;

     customer()
    {

    }
    customer(String n,String phno)
    {
        custID="C"+count;
        count++;
        name=n;
        phoneno=phno;
    }
    public String toString()
    {
        return  "customer ID:"+custID+"\nName:"+name+"\nphno:"+phno+"\n";
    }

}
public class SerializationExample
{
    public static void main(String[]args) throws Exception 
    {
        customer list[] = { new customer("Smith", "9279450622"), new customer("john", "6202209345") };

        FileOutputStream fos=new FileOutputStream("CustomerId");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeInt(list.length);
        for(customer c:list)
            oos.writeObject(c);
        
        oos.close();
        fos.close();
        

        

    }


}
