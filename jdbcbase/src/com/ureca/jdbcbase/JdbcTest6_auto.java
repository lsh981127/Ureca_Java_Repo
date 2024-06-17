package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest6_auto {

	public static void main(String[] args) throws Exception{
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String sql = "select * from book where num=?";

		/**
		 * try catch resources를 활용해서 각 애들의 nullpoint exception을 무시하고
		 * 이렇게 간편하게 쓸 수 있다. 
		 */
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca");
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "103");

			try (ResultSet rs = ps.executeQuery()) {
				if(rs.next()) {
					 System.out.println(rs.getString("num") + " " + rs.getString(2) + " " + rs.getInt("price"));
				 }
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
		 
}

