package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest2_insert {

	public static void main(String[] args) throws Exception{
		 String sql = "insert into book values (?, ?, ?)";
		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca"); 
		 
		 PreparedStatement ps = con.prepareStatement(sql);

		 ps.setString(1, "200");
		 ps.setString(2, "DB");
		 ps.setInt(3, 100000);
		 
		 int r = ps.executeUpdate();
		 
		 ps.close();
		 con.close();
		 
	}

}
