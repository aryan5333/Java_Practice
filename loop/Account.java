import java.lang.*;

class Account
{
    public String accNo;
    public String name;
    public String address;
    public String phoneno;
    public double dob;
    public double balance;

    public Account(String accNo,String name,String address,String phoneno,double balance,double dob)
    {
        accNo=accNo;
        this.name=name;
        this.address=address;
        this.phoneno=phoneno;
        this.dob=dob;
        this.balance=balance;

        public String getAccNo(){return accNo;}
        public String getName(){return name;}
        public String getAddress(){return address;}
        public String getPhoneno(){return phoneno;}
        public double getBalance(){return balance;}
        public double getDob(){return dob;}

        public void setAddress(String address)
        {
            address=address;
        }
        public void setPhoneno(String phoneno)
        {
            this.phoneno=phoneno;
        }

    }


}
class savingsaccount extends Account

{
    public void deposit(long amt)
    {
        balance +=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }



}
class loanAccount extends Account{
    public void payEMI(long amt)
    {
        balance -=amt;

    }
    public void repay(long amt)
    {
        balance +=amt;
    }
}
class Account1
{
    public static void main(String[] args) {
        
    }
}

