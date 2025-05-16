import java.lang.*;
import java.util.*;

class student
{
    private String rollNo;
    private static int count=1;
    private String assignrollNo()
    {
        Date d=new Date();
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    student()
    {
        rollNo=assignrollNo();

    }
    public String getrollNo()
    {
        return rollNo;
    }
}
public class student2
{
    public static void main(String[]args)
    {
        student s1=new student();
        student s2=new student();
        student s3=new student();
        System.out.println(s1.getrollNo());
        System.out.println(s2.getrollNo());
        System.out.println(s3.getrollNo());

    }
}



