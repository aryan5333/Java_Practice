import java.io.*;
import java.lang.*;

class Student
{
    int Rollno;
    String name;
    String dept;
    Float avg;
}

public class DataStream
{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("c:\\Users\\sinha\\Aniket");
        DataOutputStream dos=new DataOutputStream(fos);

        Student s=new Student();

        s.Rollno=10;
        s.name="Aryan";
        s.dept="ECE";
        s.avg=80.56f;

        dos.writeInt(s.Rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.writeFloat(s.avg);

        dos.close();
        fos.close();
    }
}