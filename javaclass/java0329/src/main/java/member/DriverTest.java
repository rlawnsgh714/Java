package member;

import java.sql.*;
import java.util.ArrayList;

public class DriverTest{
	//    insert
	public String doInsert(String username, String password) { 
		Connection con;
		
		PreparedStatement pstmt;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "123456789");
			pstmt = con.prepareStatement("insert into member (username, password) value (?,?)");
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
	public ArrayList<Member> doSelect(){
		
		ArrayList<Member> al = new ArrayList<Member>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "123456789");
			pstmt = con.prepareStatement("select * from member");
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				Member member = new Member();
				member.setId(rs.getInt(1));
				member.setUsername(rs.getString(2));
				member.setPassword(rs.getString(3));
				
				al.add(member);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}