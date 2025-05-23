import java.lang.*;

class whiteboard
{
    String text;
    int numberofstudents;
    int count=0;
    public void attendance()
    {
        numberofstudents++;
    }

    synchronized public void write(String t)
    {
        System.out.println("Teacher is writing" + t);
        while(count != 0)
            try { wait(); } catch(Exception e) {}
        text=t;
        count=numberofstudents;
        notifyAll();
    }
    synchronized public String read()
    {
        while(count ==0)
            try{wait();}catch(Exception e){}
        String t=text;
        count--;
        if(count ==0)
            notifyAll();

            return t;

    }
}
class teacher extends Thread{
    whiteboard wb;

    String[] notes = {"java is a language ", "java is independent platform"};
    public teacher(whiteboard wb)
    {
        this.wb=wb;

    }
    public void run()
    {
        for(int i=0;i<notes.length;i++)
           wb.write(notes[i]);

    }
}
class student extends Thread
{
    String name;
    whiteboard wb;

    public student(String n,whiteboard wb)
    {
        name=n;
        this.wb=wb;
    }
    public void run()
    {
        String text;
        wb.attendance();

        do{
            text=wb.read();
            System.out.println(name +"Reading"+text);
            System.out.flush();
        }while(text.equals("end"));
    }
}
public class interprocess2
{
    public static void main(String[]args)
    {
        whiteboard wb=new whiteboard();
        teacher t=new teacher(wb);

        student s1=new student("1.john",wb);
        student s2=new student("2.Aryan",wb);
        student s3=new student("3.Ravi",wb);
        student s4=new student("4.Sam",wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}