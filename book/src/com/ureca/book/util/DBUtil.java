package com.ureca.book.util;

import java.sql.*;


public class DBUtil {
	private static String id = "ureca";
	private static String url = "jdbc:mysql://127.0.0.1:3306/urecadb?serverTimezone=UTC";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	private static DBUtil instance = new DBUtil();
	
	private DBUtil() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static DBUtil getInstance() {
		return instance;
	}
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, id, id);
	}
	
	public void close(AutoCloseable... ac) {
		for(AutoCloseable a:ac) {
			try {
				if(a!= null) a.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
