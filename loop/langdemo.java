import java.lang.*;

class Myobject
{
    public String tostring()
    {
        return"My system";    }

        public int hashCode()
        {
            return 1000;

        }
        public boolean equals(Object o)
        {
            return this.hashCode() == o.hashCode();
        }
       
}

public class langdemo
{
    public static void main(String[] args) 
        {
            Myobject o1=new Myobject();
            Myobject o2=new Myobject();

            System.out.println(o1.equals(o2));
           
            
        }
    }
