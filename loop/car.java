import java.lang.*;

class car
{
    public void start()
    {
        System.out.println("car starts");
    }
    public void accelerate()
    {
        System.out.println("car accelerates");
    }
    public void gearchange()
    {
        System.out.println("car gearchanged");
    }
}
class luxurycar extends car
{
    public void starts()
    {
        System.out.println("car starts");
    }
    public void accelerate()
    {
        System.out.println("car accelerates");
    }
    
    public void gearchange()
    {
        System.out.println("car gearchanged");
    }
    public void openroof()
    {
        System.out.println("car has an openroof");
    }
}
class car2
{
    public static void main(String[] args) {
        car c=new car();
        c.start();
        c.accelerate();
        c.gearchange();
    }
}