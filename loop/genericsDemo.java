import java.lang.*;

class Data<T>
{
    private T Obj;
    public void setData(T v)
    {
        Obj=v;
    }
    public T getdata()
    {
        return Obj;
    }
}

public class genericsDemo<T>
{
    public static void main(String[] args) {
        Data<Integer> d=new Data();

        d.setData(10);
        System.out.println(d.getdata());
    }

    
}