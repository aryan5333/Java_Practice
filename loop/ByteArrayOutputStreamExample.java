import java.lang.*;
import java.io.*;

public class ByteArrayOutputStreamExample
{
    public static void main(String[] args) throws Exception {
        
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b[]=bos.toByteArray();

        for(byte x:b)
          System.out.println((char)x);

          bos.close();
        
        


    }
}