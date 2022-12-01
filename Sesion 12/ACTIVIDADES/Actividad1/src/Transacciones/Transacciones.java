package Transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transacciones {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo", "root", "root");
        con.setAutoCommit(false);
        Statement stmt = con.createStatement();
        stmt.executeUpdate("insert into emp values(190,'abhi',25)");
        stmt.executeUpdate("insert into emp values(429,'Juan',14)");
        con.commit();
        con.close();
    }
}
