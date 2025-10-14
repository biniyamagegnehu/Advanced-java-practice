package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
    public static void main(String[] args) throws SQLException , ClassNotFoundException {
         Class.forName("com.mysql.cj.jdbc.Driver");

         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
          System.out.println("Connected to the database successfully!");
             //2.Ceteatea stetemnet
               //3. Excute Sql query
             //Prosecess the resultset
         // Close the connection
         con.close();


    }
}
