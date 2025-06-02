import java.io.*;
import java.lang.*;

class Student implements Serializable
{
    private int Rollno;
    private String name;
    private String dept;
    private Float avg;
    public static int Data=10;
    public transient int t;

    public Student()
    {

    }
    public Student(int r,String n,String d,float a)
    {
        Rollno=r;
        name=n;
        dept=d;
        avg=a;
        Data=500;
        t=500;
    }
        public String toString()
        {
            return "\nStudent details\n"+
                   "\nRoll"+Rollno+
                   "\nName"+name+
                   "\nDept"+dept+
                   "\nAverage"+avg+
                   "\nData"+Data+
                   "\nTansient"+t+"\n";
            

        }
    }




public class Serialization
{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("c:\\Users\\sinha\\sudha");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Student s=new Student(10,"john","ECE",91.2f);
        oos.writeObject(s);

        fos.close();
        oos.close();




        
    }
}