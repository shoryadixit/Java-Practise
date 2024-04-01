package SomeProblem;

import java.sql.*;
import java.util.Scanner;

public class MyJDBCdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String emial = sc.nextLine();
        double cpi = sc.nextDouble();
        sc.close();

        try {
            System.out.println("Inserting data");
            int rows = insertData(name, emial, roll, cpi);
            System.out.println("Number of rows added" + rows);
            System.out.println("Now run the process result block");
        } catch (SQLException throwables) {
            System.out.println(throwables);
            throwables.printStackTrace();
        }

    }

    //making a connection
    public static Connection getDbConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/gla";
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }

    //inserting data
    public static int insertData(String name, String email, int roll, double cpi) throws SQLException {
        Connection con = getDbConnection();
        String sql = "INSERT INTO `student` (`NAME`, `EMAIL`, `ROLL_NO`, `CPI`) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, email);
        pstmt.setInt(3, roll);
        pstmt.setDouble(4, cpi);
        int rows = pstmt.executeUpdate();
        return rows;
    }

    //Show your database
    public static void processResultSet(ResultSet rs) throws SQLException {
        if (rs != null) {
            while (rs.next()) {
                String name = rs.getString("NAME");
                String email = rs.getString("EMAIL");
                int rollno = rs.getInt("ROLL_No");
                double cpi = rs.getDouble("CPI");
                System.out.println(name + "\t" + email + "\t" + rollno + "\t" + cpi);
            }
        }
    }

    //deleting the data
    public int deleteData(int rollNo) throws SQLException {
        Connection con = getDbConnection();
        String sql = "SELECT * FROM `student` WHERE ROLL_NO = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, rollNo);
        int rows = pstmt.executeUpdate();
        return rows;
    }
}
