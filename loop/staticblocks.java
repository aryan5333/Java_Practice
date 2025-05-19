import java.lang.*;

public class staticblocks
{
    static {
        System.out.println("block 1");

    }
    static 
    {
        System.out.println("block 2");
    }
}
 class staticpratice
{
    public static void main(String[] args) {
        System.out.println("main");
        staticblocks s1=new staticblocks();
        staticblocks s2=new staticblocks();
    }
} 