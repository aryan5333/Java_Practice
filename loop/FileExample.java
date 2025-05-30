
import java.io.*;
import java.lang.*;


public class FileExample
{
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\sinha/Test.txt");
            String str="Learn java Programming";

            byte b[]=str.getBytes();
            

            fos.write(b,6,str.length()-6);
            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        


            
    }
}