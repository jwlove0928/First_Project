package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class menuDAO {

	String url = "jdbc:mysql://localhost:3306/clothes";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public menuDTO select(String inputId) {
		menuDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from menu where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new menuDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String sort = rs.getString(3);
				String content = rs.getString(4);
				String image = rs.getString(5);
				String price = rs.getString(6);
				String company = rs.getString(7);
				dto.setId(id);
				dto.setName(name);
				dto.setSort(sort);
				dto.setContent(content);
				dto.setImage(image);
				dto.setPrice(price);
				dto.setCompany(company);
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
	public void insert(menuDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql1 = "insert into menu values (?,?,?)";
			
			ps = con.prepareStatement(sql1);
			ps.setString(2, dto.getName());
			ps.setString(4, dto.getContent());
			ps.setString(6, dto.getPrice());
			
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
	}//insert close
	public void update(menuDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql2 = "update menu set name = ?, content = ?, price = ? where name = ?";
			
			ps = con.prepareStatement(sql2);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getPrice());
			ps.setString(4, dto.getName());
			
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
		
	}//update close
	public void delete(menuDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql3 = "delete from menu where name = ?";
			
			ps = con.prepareStatement(sql3);
			ps.setString(1, dto.getName());
			
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
	} //delete close
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		menuDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.Driver연결");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2.DB연결");
			
			String sql4 = "select * from menu";
			
			ps = con.prepareStatement(sql4);
			System.out.println("3.sql문전송");
			rs = ps.executeQuery();
			System.out.println("4.sql문 완료");
			if(rs.next()) {
				dto = new menuDTO();
				String name = rs.getString(1);
				String content = rs.getString(2);
				String price = rs.getString(3);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				list.add(dto);
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
		return list;
	}
}
