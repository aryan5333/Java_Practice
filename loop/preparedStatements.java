import java.lang.*;
import java.sql.*;
import java.util.*;

public class preparedStatements
{
    public static void main(String[]args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ");
        PreparedStatement stm = con.prepareStatement("select * from students where deptno=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dept Nummber");
        int dno=sc.nextInt();

        stm.setInt(1,dno);
        ResultSet rs = stm.executeQuery();

        while(rs.next())
        {
            System.out.println(rs.getInt("roll") + " ");
            System.out.println(rs.getString("name") + " ");
            System.out.println(rs.getString("city") + " ");
            System.out.println(rs.getInt(4) + " ");




        }
        stm.close();
        con.close();



    }
}