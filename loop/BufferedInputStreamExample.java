import java.lang.*;
import java.io.*;
import java.util.BitSet;

public class BufferedInputStreamExample
{
    public static void main(String[]args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\sinha/ Test.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        int x;
        while((x=bis.read())!=1);
        {
            System.out.println((char)x);
        }


    }
}