package JDBCdemo.Main;
//Trying to connect to database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
    public static void main(String[] args) {
        //We follow Five steps
        //step 1 : Load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        //step 2 : Create the connection
            String url = "jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
        //step 3 : Prepare Statement
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO  info ('id', 'name') VALUES ('112', Dixit);";
            //insert
            //step 4 : Execute Statement or SQL
            int rows = stmt.executeUpdate(sql);
            //step 5 : result processing
            System.out.println("No. of rows affected = " + rows);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
