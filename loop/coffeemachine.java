import java.lang.*;

class coffeemachine
{
    private float coffeeqty;
    private float waterqty;
    private float milkqty;
    private float sugarqty;

    static private coffeemachine my=null;
    private coffeemachine()
    {
        coffeeqty=1;
        waterqty=1;
        milkqty=1;
        sugarqty=1;

    }
    public void fillwater(float qty)
    {
        waterqty=qty;
    }
    public void fillmilk(float qty)
    {
        milkqty=qty;
    }
    public float getcoffee()
    {
        return 0.15f;

    }
    static coffeemachine getInstance()
    {
        if(my==null)
        my=new coffeemachine();
        return my;
    }


}
class cofee
{
    public static void main(String[]args)
    {
        coffeemachine c1=coffeemachine.getInstance();
        coffeemachine c2=coffeemachine.getInstance();
        coffeemachine c3=coffeemachine.getInstance();

        System.out.println(c1+" "+c2+" "+c3);
        if(c1==c2 &&c1==c3 );
        System.out.println("Same");



    }
}

