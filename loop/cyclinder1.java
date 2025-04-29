import java.lang.*;

class cyclinder
{
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalsurfaceArea()
    {
        return 2*lidArea()+circumference()+height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
public class cyclinder1
{
    public static void main(String[] args) {
        {
            cyclinder c1=new cyclinder();
            c1.radius=48;
            c1.height=15;
            System.out.println("Area:"+c1.lidArea());
            System.out.println("perimeter:"+c1.totalsurfaceArea());
            System.out.println("circumference:"+c1.circumference());

        }
    }
}