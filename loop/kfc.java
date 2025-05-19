import java.lang.*;

abstract class kfc
{
    public kfc()
    {
        System.out.println("kfc is good");
    }
    public  void makeitems()
    {
        System.out.println("items is made");
    }
    abstract public void billing();
    abstract public void offer();
}
class MYkfc extends kfc
{
    public MYkfc()
    {
        System.out.println("mykfc is very good");
    }
    public void billing()
    {
        System.out.println("billing is done");
    }
    public void offer()
    {
        System.out.println("offer is given");
    }
    public void free()
    {
        System.out.println("free is given");
    }
}
class kfc2
{
    public static void main(String[] args) {
        kfc k=new MYkfc();
        k.billing();
        k.offer();
        k.makeitems();

    }
}