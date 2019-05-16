package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class orrderDAO {

	String url = "jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public orrderDTO select(String inputId) {
		orrderDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from orrder where uid = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new orrderDTO();
				String uid = rs.getString(1);
				String pid = rs.getString(2);
				String date = rs.getString(3);
				dto.setUid(uid);
				dto.setPid(pid);
				dto.setDate(date);
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
	public void insert(orrderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql1 = "insert into orrder values (?,?,?)";
			
			ps = con.prepareStatement(sql1);
			ps.setString(1, dto.getUid());
			ps.setString(2, dto.getPid());
			ps.setString(3, dto.getDate());
			
			ps.executeUpdate();
			
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
	}//insert close
	public void update(orrderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql2 = "update orrder set pid = ?, date = ?, where uid = ?";
			
			ps = con.prepareStatement(sql2);
			ps.setString(1, dto.getPid());
			ps.setString(2, dto.getDate());
			ps.setString(3, dto.getUid());
			
			ps.executeUpdate();
			
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
		
	}//update close
	public void delete(orrderDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql3 = "delete from orrder where uid = ?";
			
			ps = con.prepareStatement(sql3);
			ps.setString(1, dto.getUid());
			
			ps.executeUpdate();
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
	} //delete close
}
