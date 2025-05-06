import java.lang.*;

abstract class shapes
{
    abstract public double perimeter();
    abstract public double area();

}
class circle extends shapes
{
    double radius;
    public double perimeter()
    {
        return 2*Math.PI*radius*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;

    }
}
class rectangle extends shapes
{
    double length;
    double breadth;
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }

}
class shapes2
{
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.length=15;
        r.breadth=10;
        System.out.println("Area:"+r.area());
        System.out.println("perimeter:"+r.perimeter());
    }
}
