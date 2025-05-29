package lambdademo;

interface MyLambdaInterface
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambdaInterface ml)
    {
        ml.display();
    }
}
class Demo
{
    public void method1()
    {
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
}
public class l {
    public static void main(String[] args) {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> System.out.println("Lambda called!"));
    }
}