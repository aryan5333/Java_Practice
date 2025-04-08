package array;

public class array {
 
    public static void main(String args[])
    {
        String str="programmer@gmail.com";
        int i=str.indexOf("@");
        String username= str.substring(0,i);
        String domain=str.substring(i+1,str.length());

        System.out.println("username:"+username);
        System.out.println("domain:"+domain);

        System.out.println(domain.startsWith("gmail"));

    }
}
    

