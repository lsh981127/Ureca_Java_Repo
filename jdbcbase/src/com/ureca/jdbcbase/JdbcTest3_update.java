package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest3_update {

	public static void main(String[] args) throws Exception{
		 String sql = "update book set title=?, price=? where num=?";
		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca"); 
		 
		 PreparedStatement ps = con.prepareStatement(sql);

		 ps.setString(1, "자바");
		 ps.setInt(2, 1000);
		 ps.setString(3, "101");
		 
		 
		 int r = ps.executeUpdate();
		 
		 System.out.println("수정 완료 : " + r);
		 ps.close();
		 con.close();
		 
	}

}
