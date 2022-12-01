package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class InsertPrepared{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo", "root", "root");

            PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?,?)");
            stmt.setInt(1,101);//1 specifies the first parameter in the query
            stmt.setString(2,"Ratan");
            stmt.setInt(3,34);

            int i=stmt.executeUpdate();
            System.out.println(i+" records inserted");

            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
