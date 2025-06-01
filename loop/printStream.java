import java.io.*;
import java.lang.*;

class Student
{
    int rollno;
    String name;
    String Branch;

}

public class printStream
{
    public static void main(String[]args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\sinha\\Aryan");
        PrintStream ps=new PrintStream(fos);

        Student s=new Student();
        s.rollno=10;
        s.name="Aryan";
        s.Branch="ECE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.Branch);

        ps.close();
        fos.close();



    }
}