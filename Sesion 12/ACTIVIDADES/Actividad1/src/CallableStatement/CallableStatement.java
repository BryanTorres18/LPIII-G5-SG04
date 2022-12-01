package CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatement {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo", "root", "root");

        java.sql.CallableStatement stmt = con.prepareCall("{call new_procedure()}");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
        System.out.println("success");
    }
}
