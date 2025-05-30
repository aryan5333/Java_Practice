import java.lang.*;
import java.io.*;

public class copy
{
    public static void main(String[]args) throws Exception
    {
        FileInputStream fis=new FileInputStream("Source1.txt");
        FileOutputStream fos=new FileOutputStream("Source2.txt");

        int b;
        while((b=fis.read())!=-1)
        {
            if(b>=65 && b<=120)fos.write(b+32);
            else fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
