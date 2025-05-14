package loop;


public class Member {

    interface Members
    {
        public void callback();

    }
    Members members[] = new Members[10];
    int count = 0;

    void register(Members m)
    {
        members[count++] = m;
    }
    void invitesale()
    {
        for(int i=0;i<count;i++)
        members[i].callback();

    }
    class customer implements Members
    {
        String name;
        customer(String n)
        {
            name=n;
        }
        public void callback()
        {
            System.out.println("ok,i will visit,"+name);
        }
    }
}
public class Member2
{
    public static void main(String[]args)
    {
        Member s = new Member();
        Member.customer c1 = s.new customer("john");
        Member.customer c2 = s.new customer("smith");
        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
}