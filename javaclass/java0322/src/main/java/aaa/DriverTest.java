package aaa;

import java.sql.*;
import java.util.ArrayList;

public class DriverTest{
	//    insert
	public String doInsert(String username, String password) { 
		Connection con;
		
		PreparedStatement pstmt;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjsp", "root", "123456789");
			pstmt = con.prepareStatement("insert into member (username, password) value ('rlawnsgh',1234)");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
			System.out.println("suc");
			return "suc";
		}
		catch(SQLException ex){ System.out.println("SQLException" + ex);}
		catch(Exception ex){ System.out.println("Exception:" + ex);}
		return "suc";
	}
	
	//		Select
	public ArrayList<String> doSelect(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}