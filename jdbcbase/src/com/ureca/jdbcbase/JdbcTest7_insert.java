package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest7_insert {

	public static void main(String[] args) throws Exception{
		 String sql = "insert into book values (?, ?, ?)";
		 
		 try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "2020");
			ps.setString(2, "DB");
			ps.setInt(3, 100000);
			 
			int r = ps.executeUpdate();
			System.out.println("추가 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
