import java.lang.*;

class data
{
    private double length;
    private double breadth;

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        return length==breadth;

    }

    

}
public class data1
{
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.length=15;
        r1.breadth=8;
        System.out.println("Area:"+r1.area());
        System.out.println("perimeter:"+r1.perimeter());
        System.out.println("Is it a Square:"+r1.isSquare());
    }
}
