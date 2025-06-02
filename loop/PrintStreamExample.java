import java.lang.*;
import java.io.*;

public class PrintStreamExample
{
    public static void main(String[]args) throws Exception
    {
        FileInputStream fis=new FileInputStream("c:\\Users\\sinha\\Aryan");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));

        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.Branch=br.readLine();

        System.out.println("Rollno"+s.rollno);
        System.out.println("name"+s.name);
        System.out.println("Branch"+s.Branch);

        fis.close();
        br.close();
    }
}



