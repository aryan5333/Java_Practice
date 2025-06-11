import java.lang.*;
import java.sql.*;

public class Database
{
    public static void main(String[]args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ");
        Statement stm = con.createStatement();


        stm.executeUpdate("create table Temp(a integer,b float)");

        stm.executeUpdate("drop table temp");   
        //PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?,?)");

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter student data");
        int r = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        String name = sc.nextLine();
        String city = sc.nextLine();
        int dno = sc.nextInt();

        stm.setInt(1,r);
        stm.setString(2,name);
        stm.setString(3,city);
        stm.setInt(4,dno);

        stm.executeUpdate();*/




        //stm.executeUpdate("insert into dept values(60,'chem')");
        
       //stm.executeUpdate("delete from dept where deptno>=60");
       //stm.executeUpdate("update dept set dname='chem' where deptno=50");

       
       // pstmt.close();
        con.close();
        con.close();



    }
}