import java.lang.*;

public class wrappingdemo
{
    public static void main(String[] args) {
        Integer i1=new Integer(10);
        Integer i2=Integer.valueOf(10);
        Integer b=10;
    }
    Byte c=15;
    Byte d=Byte.valueOf("15");
    Byte bb=15;
    Byte f=Byte.valueOf(bb);

    Short s=Short.valueOf("123");

    Float g = 12.3f;
    Float h = Float.valueOf("123.5");
    Double j = Double.valueOf(123.456);
    Character k=Character.valueOf('A');

    Boolean l=Boolean.valueOf("true");


}


//(these all are Wrapper classes package in java.lang)