import java.lang.*;

abstract class hospital
{
    abstract public void emergency();
    abstract public void appointement();
    abstract public void admit();
    abstract public void billing();

}
class MYhospital extends hospital
{
    public void emergency()
    {
        System.out.println("has an emergency");
    }
    public void appointement()
    {
        System.out.println("has an appointement");
    }
    public void admit()
    {
        System.out.println("admitted to");
    }
    public void billing()
    {
        System.out.println("billing is done");
    }
}
class hospital2
{
    public static void main(String[]args)
    {
        hospital h=new MYhospital();
        h.emergency();
        h.appointement();
        h.admit();
        h.billing();
    }
}