package SomeProblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MyMainJDBCdemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rollno = scan.nextInt();
		scan.nextLine();
		String name = scan.nextLine();
		String email = scan.nextLine();
		double cpi = scan.nextDouble();

		scan.close();
		
		
		try {
				System.out.println("Inserting data");
				int rows = insertdata(rollno, name, email, cpi);
				System.out.println("Number of rows infected " + rows);
				System.out.println("Now run the process Result block");
				
			
		} catch (SQLException throwables) {
			// TODO Auto-generated catch block
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
	//insert data in database
	public static int insertdata(int rollno, String name, String email, double cpi) throws SQLException {
		Connection con = getDbConnection();
		String sql = "INSERT INTO `student` (`rollno`, `name`, `email`, `cpi`) VALUES (?, ?, ?, ?);";
		PreparedStatement pstmt = con.prepareStatement(sql);
		//setting parameter
		pstmt.setInt(1, rollno);
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setDouble(4, cpi);
		
		int rows = pstmt.executeUpdate();
		
		return rows;	
	}
	//Delete Data from database
	public static int deleteData(int rollno) throws SQLException {
		Connection con = getDbConnection();
		String sql = "DELETE FROM student WHERE rollno = ?;";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, rollno);
		int rows = pstmt.executeUpdate();
		return rows;
	}
	//to show your Database
	public static void processResultSet(ResultSet sql) throws SQLException{
	    ResultSet rs = sql;
		if (rs != null) {
			while (rs.next()) {
				int rollno = rs.getInt("rollno");
				String name = rs.getString("name");
				String email = rs.getString("email");
				double cpi = rs.getDouble("cpi");
				System.out.println(rollno + "\t" + name + "\t" + email + "\t" + cpi);
			}
		}
	}
}