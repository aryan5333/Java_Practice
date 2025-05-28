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
public class l {
    public static void main(String[] args) {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> System.out.println("Lambda called!"));
    }
}