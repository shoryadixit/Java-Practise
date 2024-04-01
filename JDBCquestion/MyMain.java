package JDBCquestion;

import java.sql.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo, Name, E-Mail, C.P.I");
        int rollno = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String email = sc.nextLine();
        double cpi = sc.nextDouble();


        String delete = "DELETE ? student WHERE rollno = ?";

        try {
            System.out.println("inserting data");
            int rows = insertData(rollno, name, email,cpi);
            System.out.println("number of rows affected" + rows);

            /*calling select
            ResultSet rs = selectAll();
            if (rs != null) {
                while (rs.next()){
                    rollno = rs.getInt("RollNo");
                    name = rs.getString("Name");
                    email = rs.getString("email");
                    cpi = rs.getDouble("CPI");
                    System.out.println(rollno + "\t" + name + "\t" + email + "\t" + cpi);
                }
            }*/
            
            //callint resultSET
            System.out.println("process result");
            ResultSet rs = processResult();
            System.out.println("process end");
            System.out.println(rs);
            //update
            System.out.println("updating");
            rows = updateData(54, "abd@gmail.com");
            System.out.println("number of rows affected" + rows);

            //deleting
        } catch (SQLException throwables) {
            System.out.println(throwables);
            throwables.printStackTrace();
        }
    }
    //Connection
    public static Connection getDbConnection() throws SQLException {
      String url = "jdbc:mysql://localhost:3306/gla";
      String user = "root";
      String pass = "";
      Connection con = DriverManager.getConnection(url, user, pass);
      return con;
    }
    //insert
    public static int insertData(int rollno, String name, String email, double cpi) throws SQLException {
        Connection con = getDbConnection();
        String sql = "INSERT INTO `student` (`rollno`, `name`, `email`, `cpi` ) VALUES (?, ?, ?, ?);";
        PreparedStatement pstmt = con.prepareStatement(sql);
        //setting parameter
        pstmt.setInt(1, rollno);
        pstmt.setString(2, name);
        pstmt.setString(3,email);
        pstmt.setDouble(4, cpi);
        int rows = pstmt.executeUpdate();
        return rows;
    }
    //update
    //update on the basis of roll no.
    public static int updateData(int rollno, String email) throws SQLException {
        Connection con = getDbConnection();
        String sql = "UPDATE student SET email = ? WHERE rollno = ?;";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,email);
        pstmt.setInt(2,rollno);
        int rows = pstmt.executeUpdate();

        return rows;
    }
    //select
    public static ResultSet selectAll() throws SQLException {
        Connection con = getDbConnection();
        String sql = "SELECT * FROM student";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }
    //delete
    //on the basis of roll no
    public static int deleteData(int rollno) throws SQLException {
        Connection con = getDbConnection();
        String sql = "DELETE FROM student WHERE rollno = ?;";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, rollno);
        int rows = pstmt.executeUpdate();
        return rows;
    }
    //Result set process function
    public static ResultSet processResult() throws SQLException {
        Connection con = getDbConnection();
        String sql = "SELECT * From student;";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<String> rs1 = null;
        while (rs.next()) {
            int rollno = rs.getInt("rollno");
            String name = rs.getString("name");
            String email = rs.getString("email");
            double cpi = rs.getDouble("cpi");
            rs1 = Collections.singletonList((rollno + "\t" + name + "\t" + email + "\t" + cpi));

        }

        return (ResultSet) rs1;
    }
}