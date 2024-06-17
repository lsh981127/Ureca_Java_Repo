package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest1_select {

	public static void main(String[] args) throws Exception{
//		Class.forName("com.mysql.cj.jdbc.Driver");

		
		 String sql = "select * from book where num=?";
		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca"); 
		 
//		 Statement st = con.createStatement();
		 PreparedStatement ps = con.prepareStatement(sql);

		 ps.setString(1, "103");
		 
		 /**
		  * 이제 그냥 Statement를 쓰는 게 아니라 PrepareStatement로 string을 맘대로 바꿔서
		  * 원하는 데이터를 그대로 호출하면서 사용한다.
		  * 
		  * PreparedStatement만 사용!!
		  */
	
		 ResultSet rs = ps.executeQuery();

		 if(rs.next()) {
			 System.out.println(rs.getString("num") + " " + rs.getString(2) + " " + rs.getInt("price"));
		 }
		 

		 rs.close();
		 ps.close();
		 con.close();
		 
	}

}
