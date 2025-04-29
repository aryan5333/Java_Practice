import java.lang.*;

class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;

    }
    public double perimeter()
    {
        return Math.PI*radius;
    }
    public double circumference()
    {
        return Math.PI*radius;
    }


}
public class circle1
{
    public static void main(String[]args)
    {
        circle c1=new circle();
        circle c2=new circle();
        c1.radius=8;
        c2.radius=16;
        System.out.println("Area:"+c1.area());
        System.out.println("perimeter:"+c1.perimeter());
        System.out.println("Circumference:"+c1.circumference());

        System.out.println("Area2:"+c2.area());
        System.out.println("perimeter2:"+c2.perimeter());
        System.out.println("Circumference2:"+c2.circumference());
    }
}

