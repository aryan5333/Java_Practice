import java.lang.*;

class cyclinder2
{
    private int radius;
    private int height;

    public cyclinder2()
    {
        radius=1;
        height=1;
    }
    public cyclinder2(int r,int h)
    {
         radius=r;
         height=h;
    }
    public int getHeight()
    {
        return height;

    }
    public int getRadius()
    {
        return radius;
    }
    public int setRadius(int r)
    {
        return radius;
    }
    public int setHeight(int h)
    {
        return height;
    }
    public void setDimension(int h,int r)
    {
        height=h;
        radius=r;
    }
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public class cyclinderTest
    {
        public static void main(String[]args)
        {
            cyclinder2 c=new cyclinder2();
            c.setHeight(10);
            c.setRadius(12);
            c.setDimension(10,7);
            System.out.println("LidArea:"+c.lidArea());
            System.out.println("perimeter:"+c.perimeter());
            System.out.println("circumference;"+c.circumference());



        }
    }

    }
