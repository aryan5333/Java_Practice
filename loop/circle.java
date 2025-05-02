import java.lang.*;

class circle
{
    public double radius;
    public double Area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
 class cyclinder extends circle
{
    public double height;
    public double volume()
    {
        return Area()*height;
    }
}
class circle1
{
    public static void main(String[] args) {
        
        cyclinder c=new cyclinder();
        c.radius=14;
        c.height=12;
        System.out.println("Area:"+c.Area());
        System.out.println("perimeter:"+c.perimeter());
        System.out.println("circumference:"+c.circumference());
        System.out.println("volume:"+c.volume());

    }
} 