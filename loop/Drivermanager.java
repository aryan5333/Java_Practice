import java.lang.*;
import java.sql.*;

public class Drivermanager
{
    public static void main(String[]args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from students");

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