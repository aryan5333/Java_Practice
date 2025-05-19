import java.lang.*;

class customer
{
    private String SubID;
    private String name;
    private int maxmarks;
    private int marksobtain;

    public customer(String SubID,String name,int maxMarks)
    {
        this.SubID=SubID;
        this.name=name;
        this.maxmarks=maxMarks;

    }
    public String getSubID(){return SubID;}
    public String getname(){return name;}
    public int getmarksobtain(){return marksobtain;}
    public int getmaxmarks(){return maxmarks;}

    public void setMaxmarks(int mm)
    {
        maxmarks=mm;
    }
    public void setMarksobtain(int m)
    {
        marksobtain=m;
    }
    public String toString()
    {
        return "\nSubject ID:"+SubID+"\nName:"+name+"\nmarksobtain:"+marksobtain;

    }

}
public class cTest
{
    public static void main(String[] args) {
        subject subs[]=new subject[3];
        subs[0]=newsubject("s101,bs,100");
        subs[1]=newsubject("s102,m1,100");
        subs[2]=newsubject("s103,control,100");

        for(subject s:subs)
        System.out.println(s);
    }
    
}
    

