package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class findTitle {
    public static void main(String[] args)  throws SQLException, ClassNotFoundException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
         System.out.println("Connected to the database successfully!");

        String sql = ("SELECT Title FROM Employees WHERE FirstName = 'Nancy'");
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs  = ps.executeQuery();

        if (rs.next()) {
            String title = rs.getString("Title");
            System.out.println("Title " + title);
        }
        ps.close();
        rs.close();
        con.close();
    }
}
