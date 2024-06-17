package com.ureca.jdbcbase;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) throws Exception{
		 String sql = "select * from book";
		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC", "ureca", "ureca"); 
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery(sql);
		 while(rs.next()) {
			 System.out.println(rs.getString("num") + " " + rs.getString(2) + " " + rs.getInt("price"));
		 }
		 
		 rs.close();
		 st.close();
		 con.close();
		 
	}

}
