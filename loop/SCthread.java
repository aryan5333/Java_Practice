import java.lang.*;

class ATM
{
    public void checkBalance(String name)
    {
        System.out.println(name + " checking ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }
    public void withdraw(String name,int amount)
    {
        System.out.println(name + " Withdrawing ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("amount");
    }
}
class customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    customer(String n,ATM atm,int amt)
    {
        name=name;
        amount=amt;
        atm=atm;

    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }
    public void run()
    {
        useATM();
    }
}
public class SCthread
{
    public static void main(String[]args)
    {
        ATM atm=new ATM();
        customer c1=new customer("Smith",atm,10000);
        customer c2=new customer("john",atm,20000);
        c1.start();
        c2.start();
    }
}
