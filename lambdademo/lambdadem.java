package lambdademo;

interface MyLambda
{
    public void display(String str);
}
public class lambdadem
{
    public static void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
         MyLambda ml=lambdadem::reverse;

         ml.display("Hello");
        
    }
}