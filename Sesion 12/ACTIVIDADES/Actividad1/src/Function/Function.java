package Function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Function {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo", "root", "root");
        CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}");
        stmt.setInt(2,10);
        stmt.setInt(3,43);
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.execute();

        System.out.println(stmt.getInt(1));

    }
}

