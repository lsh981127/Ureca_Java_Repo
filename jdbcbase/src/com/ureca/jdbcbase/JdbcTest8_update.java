package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest8_update {

	public static void main(String[] args) throws Exception{
		 String sql = "update book set title=?, price=? where num=?";
		 
		 try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "Java2");
			 ps.setInt(2, 200);
			 ps.setString(3, "103");
			 
			 int r = ps.executeUpdate();
			 
			 System.out.println("수정 완료 : " + r);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 
	}

}
