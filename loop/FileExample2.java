
import java.io.*;
import java.lang.*;


public class FileExample2
{
    public static void main(String[] args) throws Exception {
        try(FileInputStream fis=new FileInputStream("C:\\Users\\sinha/Test.txt"))
            
        {

            int x;

            do
            {
                x=fis.read();
                if(x!=-1);
                   System.out.print((char )x);
            }while(x!=-1);

            byte b[]=new byte[fis.available()];

            fis.read();
            String str=new String(b);

            System.out.println(str);
            

            
    }
}
}