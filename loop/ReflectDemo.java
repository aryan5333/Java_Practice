import java.lang.reflect.*;

class MY
{
    private int a;
    public int b;
    protected int c;
    int d;

    public MY() {}
    public MY(int x,int y) {}

    public void display(String s,String s2) {}
    public int show(int x,int y) {return 0;}
       

}
public class ReflectDemo
{
    public static void main(String[] args) {
        Class<?> c = MY.class;
        Field field[]=c.getDeclaredFields();
        Method meth[]=c.getMethods();
        //Constructor conc=c.getConstructors();

       for(Method m:meth) {
           System.out.println(m);
       }

       Parameter param[]=meth[0].getParameters();

       for(Parameter p:param)
       {
        System.out.println(p);
       }
        
       
    }
}