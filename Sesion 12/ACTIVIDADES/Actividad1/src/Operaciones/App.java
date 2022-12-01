package Operaciones;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo", "root", "root");
            Statement stmt = con.createStatement();
            // Mostramos los datos de la tabla
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
            System.out.println("==========================================================================");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            System.out.println("==========================================================================");
            // Insertamos dato a la Tabla
            stmt.executeUpdate("INSERT INTO emp values (11, 'Julio', 17)");
            //Borramos un dato de la tabla
            stmt.executeUpdate("DELETE from emp where name='Maria'");
            //Actualizamos los datos
            stmt.executeUpdate("UPDATE emp SET age='25' where name='Juan'");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


