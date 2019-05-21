package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	String url = "jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(MemberDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "insert into member values (null,?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getUser());
			ps.setString(4, dto.getTel());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} //insert close
	
	public MemberDTO select(String inputId) {
		MemberDTO dto = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql1 = "select * from member where id = ?";
			ps = con.prepareStatement(sql1);
			ps.setString(1, inputId);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String user = rs.getString(3);
				String tel = rs.getString(4);
				dto.setId(id);
				dto.setId(pw);
				dto.setUser(user);
				dto.setTel(tel);
			}else {
				System.out.println("검색결과가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}//select close
	
}
