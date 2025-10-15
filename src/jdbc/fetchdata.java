package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fetchdata {
    public static void main(String[] args) throws SQLException , ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
        System.out.println("Connected to the database successfully!");

        String sql = ("SELECT ProductName FROM products WHERE ProductID=?");

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,14);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String productName = rs.getString("ProductName");
            System.out.println("Prduct Name : " + productName);
        }

        rs.close();
        ps.close();
        con.close();
    }
}
