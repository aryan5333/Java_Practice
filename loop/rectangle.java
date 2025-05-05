import java.lang.*;

class rectangle2
{
    int length=1;
    int breadth=1;

    rectangle2(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void display()
    {
        System.out.println("Length:"+this.length);
        System.out.println("Breadth:"+this.breadth);
    }
}
public class rectangle
{
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.display();
        
    
    
    }
}