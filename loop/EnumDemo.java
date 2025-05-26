import java.lang.*;

enum Dept
{
    CSE,ECE,CIVIL,MECHANICAl;
    private Dept()
    {
        System.out.println(this.name());
    }
    public void display()
    {
        System.out.println(this.name() +" "+this.ordinal());
    }
}

public class EnumDemo
{
    public static void main(String[] args) {

        Dept d=Dept.CIVIL;
        d.display();


       switch(d)
       {
        case CSE:System.out.println("Head:john \nBlock:A");
        break;
        case ECE:System.out.println("Head:Smith\nBlock:B");
        break;
        case CIVIL:System.out.println("Head:Aryan\nBlock:C");
        break;
        case MECHANICAl:System.out.println("Head:Dave\nBlock:D");
        break;
       }
        
        
    
}
}