package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest4_delete {

	public static void main(String[] args) throws Exception{
		 String sql = "delete from book where num=?";
		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca"); 
		 
		 PreparedStatement ps = con.prepareStatement(sql);

		 ps.setString(1, "101");
		 
		 
		 int r = ps.executeUpdate();
		 
		 System.out.println("삭제 완료 : " + r);
		 ps.close();
		 con.close();
		 
	}

}
