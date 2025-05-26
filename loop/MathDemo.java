import java.lang.*;

class MathDemo
{
    public static void main(String[] args) {
        
         System.out.println("Absolute:");
        System.out.println(Math.abs(-123));

        System.out.println("Absolute");
        System.out.println(StrictMath.abs(-123));
         
        System.out.println("cube root:");
        System.out.println(Math.cbrt(256));

        System.out.println("Exact Decrement:");
        System.out.println(Math.decrementExact(46));

        //int i=Integer.MIN_VALUE;
        //i--;
        //System.out.println(i);

        System.out.println("Exponent value in Floating Point Rep.:");
        System.out.println(Math.getExponent(123.5));

        System.out.println("Round Division ");
        System.out.println(Math.floorDiv(146,12));

        
        System.out.println("e power x: ");
        System.out.println(StrictMath.exp(1));

        
        System.out.println("e power x: ");
        System.out.println(StrictMath.exp(1));

        
        System.out.println("log base 10: ");
        System.out.println(Math.log10(1000));

        
        System.out.println("Maximum ");
        System.out.println(Math.max(100,10));

        
        System.out.println("convert to Degrees: ");
        System.out.println(Math.toDegrees(Math.atan(1)));

        
        System.out.println("Random Number:");
        System.out.println(Math.random()*1000);

        
        System.out.println( "power:");
        System.out.println(Math.pow(2,3));

        
        System.out.println("Exact product ");
        System.out.println(Math.multiplyExact(100,200 ));

        
        System.out.println("Next Exact value: ");
        System.out.println(Math.nextAfter(12.5,11));





        






    }
}
