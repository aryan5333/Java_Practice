package lambdademo;

@FunctionalInterface
interface MyLambda
{
    void display();
}


public class lambdademo
{
    public static void main(String[] args) {
        MyLambda m=()->
        {
            System.out.println("Hello World");
        };
        m.display();
    }
}

