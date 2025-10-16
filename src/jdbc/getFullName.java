package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getFullName {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
         System.out.println("Connected to the database successfully!");

        String sql = ("SELECT FirstName,LastName FROM Employees");
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs  = ps.executeQuery();

        if (rs.next()) {
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            System.out.println("Full name  " + firstName + " " + lastName);
        }
        ps.close();
        rs.close();
        con.close();
    }
}
