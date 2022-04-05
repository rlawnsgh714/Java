package ex0405;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.tribes.Member;

public class MemberDBManager<con> {

	
	public List<Member> doInsert(){
		ArrayList<Member> al = new ArrayList();
		
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass","root","123456789");
			pstmt = con.prepareStatement("select * from member");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				member
			}
		}catch(Exception e) {
			
		}
		return al;
	}
	
	public void doInsert(String usr, String pass) {
		Connection con;
		PreparedStatement pstmt;
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass","root","123456789");
			pstmt = con.prepareStatement("insert into member (username,password) values(?,?)");
			pstmt.setString(1, usr);
			pstmt.setString(2, pass);
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}