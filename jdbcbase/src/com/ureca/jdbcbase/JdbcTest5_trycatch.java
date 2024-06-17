package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest5_trycatch {

	public static void main(String[] args) {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from book where num=?";
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca"); 
			 
			ps = con.prepareStatement(sql);		
			ps.setString(1, "103");
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			/**
			 * 각 애들에 대해서 try catch를 다 씌워줘야해
			 * 그래서 이 방법보다 try with resources를 화룡하는 게 좋다
			 */
			
			try {
				if (rs!= null) rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			try {
				if (ps!= null) ps.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				if (con!= null) con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			 
		}

	}

}
